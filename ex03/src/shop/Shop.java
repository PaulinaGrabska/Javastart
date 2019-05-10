package shop;
import java.time.Month;


import java.time.LocalDate;

public class Shop {

    public static void main(String[] args) {

        Category sweets = new Category("Sweets", "Sweets which will make your life sweeter");

        Category snacks = new Category("Snacks", "Watching movie? Going to the cinema? Go&Grab your snack");

        Product candy = new Product("Candy", 1.5, "Candy with chocolate and jelly juice filling", sweets);

        Product snickers = new Product("Snickers", 2.5, "Bar with peanuts and choco cream", sweets);

        Product chips = new Product("Chips", 3.0, "Onion and sour cream chips", snacks);

        Product tv = new Product("Tv", 1000.0, "Very modern tv with all extra equipment", null);

        SpecialOffer so = new SpecialOffer(snickers, "Buy 2 bars and get 20% off", LocalDate.of(2019,Month.MAY, 20),
                LocalDate.of(2019,Month.MAY, 30), 0.2);



        System.out.println("All products: \n");
            System.out.println(candy.toString());
            System.out.println(snickers.toString());
            System.out.println(chips.toString());
            System.out.println(tv.toString());

        System.out.println("*** SPECIAL OFFER ***\n" + so.toString());

    }

}
