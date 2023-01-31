package com.zsgpractice.array;

class ArrayList {
    int size;
    int arr[];
    int pos;
    ArrayList(int size){
        pos=0;
        this.size=size;
        arr=new int[size];
    }
    ArrayList(){
        this(5);
    }
    private void changeArray(){
        int temp[]=this.arr;
        this.arr=new int[this.size];
        for(int i=0;i<this.pos;i++){
            this.arr[i]=temp[i];
        }
    }
    public void insert(int x){
        if(pos==size){
            this.size+=5;
            this.changeArray();
        }
        this.arr[pos++]=x;
    }
    public void delete(int i){
        if(pos==0){
            System.out.println("List is Empty, Nothing to delete.");
            return;
        }
        if(i<0){
            System.out.println("Negative index does not Allowed.");
        }
        if(i>pos){
            System.out.println("This index does not exits");
            return;
        }
        for(;i<pos-1;i++){
            arr[i]=arr[i+1];
        }
        arr[--pos]=0;
        if(pos==size-5){
            this.size-=5;
            this.changeArray();
        }
    }
    public int length(){
        return pos;
    }
    public void print(){
        if(pos==0){
            System.out.println("[ ]");
            return;
        }
        for(int i=0;i<pos;i++){
            if(i==0){
                System.out.printf("[ %d",arr[i]);
                continue;
            }
            System.out.printf(", %d",arr[i]);
        }
        System.out.println(" ]");
    }
    public static void main(String[] args) {
        ArrayList list=new ArrayList(5);
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.delete(2);
        System.out.println(list.length());
        list.print();
    }
}

