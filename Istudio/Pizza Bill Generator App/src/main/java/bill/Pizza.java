package bill;

import java.util.Scanner;

public class Pizza {
    protected int price ;
    protected Boolean veg;

    protected int extraCheesePrice = 100;
    protected int extraToppingsPrice = 150;
    protected int backPackPrice = 20;

    protected int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isOptedForTakeAway = false;

    Scanner in = new Scanner(System.in);

    public Pizza(Boolean veg) {
        this.veg = veg;

        if(this.veg)
            this.price = 300;
        else
            this.price = 400;

        basePizzaPrice = this.price;
    }

    public void addExtraCheese(){
        System.out.println("Extra cheese (Y/N) :");
        char ch = in.next().toLowerCase().charAt(0);
        switch (ch){
            case ('y') :
                isExtraCheeseAdded = true;
                this.price += extraCheesePrice ;
                break;
            case ('n') :
                isExtraCheeseAdded = false;
                break;
        }
    }

    public void addExtraToppings(){
        System.out.println("Extra Toopings (Y/N) :");
        char ch = in.next().toLowerCase().charAt(0);
        switch (ch){
            case ('y') :
                isExtraToppingsAdded = true;
                this.price += extraToppingsPrice ;
                break;
            case ('n') :
                isExtraToppingsAdded = false;
                break;
        }
    }

    public void takeAway(){
        System.out.println("Want takeAway (Y/N) :");
        char ch = in.next().toLowerCase().charAt(0);
        switch (ch){
            case ('y') :
                isOptedForTakeAway = true;
                this.price += backPackPrice ;
                break;
            case ('n') :
                isOptedForTakeAway = false;
                break;
        }
    }

    public void getBill(){
        String bill ="";
        System.out.println("\nPizza :" + basePizzaPrice );

        if(isExtraToppingsAdded)
            bill += "Extra Toppings : " + extraToppingsPrice +"\n" ;
        if(isExtraCheeseAdded)
            bill += "Extra Cheese : " + extraCheesePrice + "\n" ;
        if(isOptedForTakeAway)
            bill += "Take Away : " + backPackPrice + "\n" ;

        bill += "Total Amount : " + this.price + "\n" ;

        System.out.println(bill);
        System.out.println("\n..........Thank you! Visit Again..........");
    }

}
