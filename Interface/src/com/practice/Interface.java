
package com.practice;

import java.util.Scanner;

interface Payment
{
    void makePayment();//by default it is a abstract method
}
class PayPal implements Payment
{
    
    @Override
    public void makePayment()
    {
        //some logic for PayPal payment
        //e.g. Paypal uses username and password for payment
        System.out.println("Paypal uses username and password for payment");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Username : "+sc.nextLine());
        System.out.println("Enter Password : "+sc.nextLine());
        System.out.println("Make Payment on PayPal ");
    }
}
class CreditCard implements Payment
{
    @Override
    public void makePayment()
    {
        //some logic for CreditCard payment
        //e.g. CreditCard uses card number, date of expiry etc...
        System.out.println("CreditCard uses card number, date of expiry and cvv");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter card number : "+sc.nextLine());
        System.out.println("Enter date of expiry : "+sc.nextLine());
        System.out.println("Enter cvv : "+sc.nextLine());
        System.out.println("Make Payment on Creditcard ");
    }
}

public class Interface
{
    public static void main(String[] args) 
    {
        Payment payPalPayment=new PayPal();
        payPalPayment.makePayment();
        Payment creditCardPayment=new CreditCard();
        creditCardPayment.makePayment();
    }
}