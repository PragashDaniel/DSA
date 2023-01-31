
package com.practice;

abstract class Burger
{
    public void packing()
    {
        //some logic for packing a burger
        System.out.println("Packing in a box");
    }
    public abstract void price(); //price is different for different categories of burgers
}
class VegBurger extends Burger
{
    @Override
    public void price()
    {
        System.out.println("Price for veg burger : 100");//set price for a veg burger.
    }
}
class NonVegBurger extends Burger
{
    @Override
    public void price()
    {
        System.out.println("Price for veg burger : 150");//set price for a non-veg burger.
    }
}
public class AbstractClass 
{
    public static void main(String[] args) 
    {
            Burger vegBurger=new VegBurger();
            vegBurger.packing();
            vegBurger.price();
            Burger nonVegBurger=new NonVegBurger();
            nonVegBurger.packing();
            nonVegBurger.price();
    }
}
