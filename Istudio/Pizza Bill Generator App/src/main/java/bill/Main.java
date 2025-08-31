package bill;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n..........Welcome to Pizza Mania..........");
        System.out.println("Which Pizza : \n1)Veg Pizza \n2)Non-Veg Pizza \n3)Delux Veg Pizza \n4)Delux Non-Veg Pizza");
        int ch = sc.nextInt();

        switch (ch){
            case 1:
                Pizza vegPizaa = new Pizza(true);
                vegPizaa.addExtraCheese();
                vegPizaa.addExtraToppings();
                vegPizaa.takeAway();
                vegPizaa.getBill();
                break;

            case 2:
                Pizza nonvegPizaa = new Pizza(false);
                nonvegPizaa.addExtraCheese();
                nonvegPizaa.addExtraToppings();
                nonvegPizaa.takeAway();
                nonvegPizaa.getBill();
                break;

            case 3:
                Pizza vegDeluxPizaa = new Pizza(false);
                vegDeluxPizaa.basePizzaPrice = 550;
                vegDeluxPizaa.addExtraCheese();
                vegDeluxPizaa.addExtraToppings();
                vegDeluxPizaa.takeAway();
                vegDeluxPizaa.getBill();
                break;

            case 4:
                Pizza nonvegDeluxPizaa = new Pizza(false);
                nonvegDeluxPizaa.basePizzaPrice = 600;
                nonvegDeluxPizaa.addExtraCheese();
                nonvegDeluxPizaa.addExtraToppings();
                nonvegDeluxPizaa.takeAway();
                nonvegDeluxPizaa.getBill();
                break;

        }
    }
}
