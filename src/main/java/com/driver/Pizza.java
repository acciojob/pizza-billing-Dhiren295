package com.driver;

public class Pizza {
    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice=100;
    private  int toppingPrice=150;
    private int takeAwayPrice=20;

    boolean isCheeseAdded;
    boolean isToppingAdded;
    boolean isTakeAwayAdded;
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

        this.isTakeAwayAdded=false;
        this.isCheeseAdded=false;
        this.isToppingAdded=false;

        this.bill="Base Price Of The Pizza: "+this.price+"\n";
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
        if(isToppingAdded==false){
            this.price=this.price+this.toppingPrice;
            isToppingAdded=true;
        }
    }
    public void addTakeaway(){
        //your code goes here
        if(isTakeAwayAdded==false){
            this.price=this.price+this.takeAwayPrice;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        //your code goes here
        if(isBillGenereted==false){
            if(isCheeseAdded==true){
                this.bill=this.bill+"Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isToppingAdded==true){
                this.bill=this.bill+"Extra Toppings Added: "+this.toppingPrice+"\n";
            }
            if(isTakeAwayAdded==true){
                this.bill=this.bill+"Paperbag Added: "+this.takeAwayPrice+"\n";
            }

            this.bill=this.bill+"Total Price: "+this.price+"\n";
            isBillGenereted=true;
        }
        return this.bill;
    }
}
