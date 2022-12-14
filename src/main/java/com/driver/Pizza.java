package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int basePrice;
    private int extraCheese=80;
    private int extraBag=20;
    private int extraToppings;
    boolean   extraToppingsadded=false;
    boolean extraCheeseadded=false;
    boolean extraBagadded=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg==true){
            this.price=price+300;
            this.bill="Base Price Of The Pizza: "+price+"\n";
        }
       else {
            this.price=price+400;
            this.bill=this.bill+"Base Price Of The Pizza: "+price+"\n";
        }
    }

    public void addExtraCheese(){
        if(extraCheeseadded==false){
            this.price=price+this.extraCheese;
            this.bill=this.bill+"Extra Cheese Added: "+this.extraCheese+"\n";
            extraCheeseadded=true;
        }

    }

    public void addExtraToppings(){
        if(isVeg){
            if(extraToppingsadded==false){
                extraToppings=70;
                this.price=price+this.extraToppings;
                this.bill=this.bill+"Extra Toppings Added: "+extraToppings+"\n";
                extraToppingsadded=true;
            }

        }
        else{
            if(extraToppingsadded==false){
                extraToppings=120;
                this.price=price+this.extraToppings;
                this.bill=this.bill+"Extra Toppings Added: "+extraToppings+"\n";
                extraToppingsadded=true;
            }
        }
    }

    public void addTakeaway(){
        if(extraBagadded==false){
            this.price=price+this.extraBag;
            this.bill=this.bill+"Paperbag Added: "+extraBag+"\n";
            extraBagadded=true;
        }

    }

    public String getBill(){
        this.bill=this.bill+"Total Price: "+this.price;
        return this.bill;
    }
}
