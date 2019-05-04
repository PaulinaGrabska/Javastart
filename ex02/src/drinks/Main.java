package drinks;

public class Main {

    public static void main(String[] args) {


        // first Drink - Mohito with ingredients: Mint, Vodka, Lime

        Ingredient ing1 = new Ingredient();
        ing1.name = "Mint";
        ing1.amount = 100;

        Ingredient ing2 = new Ingredient();
        ing2.name = "Vodka";
        ing2.amount = 50.5;

        Ingredient ing3 = new Ingredient();
        ing3.name = "Lime";
        ing3.amount = 45;

        Drink drink1 = new Drink("Mohito", 25, true, ing1, ing2, ing3);



        // second Drink - Mammamia with ingredients: Malibu, Kiwi, Water

        Ingredient ing4 = new Ingredient();
        ing4.name = "Water";
        ing4.amount = 150;

        Ingredient ing5 = new Ingredient();
        ing5.name = "Malibu";
        ing5.amount = 75;

        Ingredient ing6 = new Ingredient();
        ing6.name = "Kiwi";
        ing6.amount = 60;

        Drink drink2 = new Drink("Mammmia", 45, false, ing4, ing5, ing6);


        //printing info about drink1 - Mohito
        printInfo(drink1);
        totalAmount(drink1);

        //printing info about drink2 - Mammamia
        printInfo(drink2);
        totalAmount(drink2);


    }

    // printing information (all details) about drink
    public static void printInfo(Drink drink){

        System.out.printf("Information about drink: %s\n Price: %f $\n Is it with alcohol? %s\n " +
                "1st ingredient: %s - %f ml\n 2nd ingredient: %s-  %f ml\n 3rd ingredient: %s - %f ml\n",
                drink.name, drink.price, drink.withAlcohol, drink.ingredient1.name, drink.ingredient1.amount,
                drink.ingredient2.name,drink.ingredient2.amount, drink.ingredient3.name, drink.ingredient3.amount);
        System.out.println();
    }

    // printing total amount of ingredients in drink
    public static void totalAmount(Drink drink){

        double totAmount = drink.ingredient1.amount + drink.ingredient2.amount+ drink.ingredient3.amount;

        System.out.println("Total amount of ingredients in " + drink.name +" is " + totAmount + " ml\n" );

    }

}