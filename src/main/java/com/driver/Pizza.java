package com.driver;

public class Pizza {

    private int price;

    private Boolean isVeg;
    private String bill;
    private int extraCheesePrice=100;
    private  int extraToppintPrice=150;
    private int backPackPrice=20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded=false;
    private boolean isExtraToppingAdded=false;
    private boolean isOptedForTakeAway=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.price=300;
        }
        else {
            this.price=400;
        }
        basePizzaPrice=this.price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        isExtraCheeseAdded=true;
        // your code goes here
        System.out.println("Extra Cheese added");
        this.price+=extraCheesePrice;

    }

    public void addExtraToppings(){
        // your code goes here
        isExtraToppingAdded=true;
        System.out.println("Extra topping added");
        this.price+=extraToppintPrice;
    }

    public void addTakeaway(){
        // your code goes here
        isOptedForTakeAway=true;
        System.out.println("Take away optd");
        this.price+=backPackPrice;
    }

    public String getBill(){
        String bill="";
        // your code goes here
        System.out.println("Pizza "+basePizzaPrice);
        if(isExtraCheeseAdded){
            bill+="Extra cheese added "+extraCheesePrice+"\n";
        }
        if(isExtraToppingAdded){
            bill+="Extra topping added "+extraToppintPrice+"\n";
        }
        if(isOptedForTakeAway){
            bill+="Take way "+backPackPrice+"\n";
        }
        bill+="Bill:"+this.price+"\n";
        System.out.println(bill);
        return this.bill;
    }
}
