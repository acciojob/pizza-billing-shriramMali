package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int bagPrice;
    private int cheesePrice;
    private int toppingsPrice;
    boolean extraToppingsadded;
    boolean extraCheeseadded;
    boolean extraBagadded;
    boolean extraBillgenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice=80;
        this.bagPrice=20;
        if(this.isVeg){
            this.price=300;
            this.toppingsPrice=70;
        }
       else {
            this.price=400;
            this.toppingsPrice=120;

        }
       this.extraBagadded=false;
       this.extraCheeseadded=false;
       this.extraToppingsadded=false;
       this.extraBillgenerated=false;
        this.bill="Base Price Of The Pizza: "+this.price+"\n";

    }
     public int getPrice(){
        return this.price;
     }
    public void addExtraCheese(){
        if(extraCheeseadded==false){
            this.price+=cheesePrice;

            extraCheeseadded=true;
        }

    }

    public void addExtraToppings(){
            if(extraToppingsadded==false){
                this.price+=toppingsPrice;
                extraToppingsadded=true;
            }

        }

    public void addTakeaway(){
        if(extraBagadded==false){
            this.price+=bagPrice;
            extraBagadded=true;
        }

    }

    public String getBill(){
        if(extraBillgenerated==false){
            if(extraCheeseadded==true){
                this.bill=this.bill+"Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(extraToppingsadded==true){
                this.bill=this.bill+"Extra Toppings Added: "+this.toppingsPrice+"\n";
            }

            if(extraBagadded==true){
                this.bill=this.bill+"Paperbag Added: "+this.bagPrice+"\n";
            }
            this.bill=this.bill+"Total Price: "+this.price;
            extraBillgenerated=true;

        }

        return this.bill;
    }
}
