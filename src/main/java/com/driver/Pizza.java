package com.driver;

public class Pizza {

    private int price;//calculating the final bill price

    private Boolean isVeg;
    private String bill;
    private int cheesePrice=100;
    private  int toppingPrice=150;
    private int takeAwayPrice=20;

    boolean isCheeseAdded;
    boolean isToppingAddaed;
    boolean isTakeAwayAded;
    boolean isBillGenereted;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice=80;
        this.takeAwayPrice=20;
        if(isVeg==true){
            this.price=300;
            this.toppingPrice=70;
        }else {
            this.price=400;
            this.toppingPrice=120;
        }
        this.isTakeAwayAded=false;
        this.isCheeseAdded=false;
        this.isToppingAddaed=false;

        this.bill="Base Price of the Pizza"+this.price+"\n";
        // your code goes here

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
       //your code goes here
        if(isCheeseAdded==false){
            this.price=this.price+this.cheesePrice;
            isCheeseAdded=true;


        }

    }

    public void addExtraToppings(){
        //your code goes here
        if(isToppingAddaed==false){
            this.price=this.price+this.toppingPrice;
            isToppingAddaed=true;
        }
    }

    public void addTakeaway(){
        //your code goes here
        if(isTakeAwayAded==false){
            this.price=this.price+this.takeAwayPrice;
            isTakeAwayAded=true;
        }
    }

    public String getBill(){
        //your code goes here
        if(isBillGenereted==false){
            if(isCheeseAdded==true){
                this.bill=this.bill+"Extra Cheese Added "+this.cheesePrice+"\n";
            }
            if(isToppingAddaed==true){
                this.bill=this.bill+"Extra Topping Added: "+this.toppingPrice+"\n";
            }
            if(isTakeAwayAded==true){
                this.bill=this.bill+" Paperbag Added: "+this.takeAwayPrice+"\n";
            }
            this.bill=this.bill+" Total Price: "+this.price+"\n";
            isBillGenereted=true;
        }
        return this.bill;
    }
}
