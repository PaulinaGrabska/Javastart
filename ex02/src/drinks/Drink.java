package drinks;
/*
Stwórz klasę Drink. Każdy drink ma swoją nazwę, cenę, a także informację o tym, czy jest alkoholowy, czy nie.
Dodatkowo w klasie tej powinny być zapisane informacje o składnikach.
Każdy składnik to obiekt z informacja o nazwie oraz ilości danego składnika.
Zakładamy, że drink składa się dokładnie z 3 składników. W osobnej klasie utwórz przynajmniej
jeden obiekt przechowujący pełne informacje o drinku i wyświetl o nim informacje w konsoli.
Dodatkowo oblicz pojemność drinka (sumę ilości wszystkich składników) i także tę informację wyświetl w konsoli.
 */

public class Drink {

    String name;
    double price;
    boolean withAlcohol;
    Ingredient ingredient1;
    Ingredient ingredient2;
    Ingredient ingredient3;


    public Drink(String name, double price, boolean withAlcohol, Ingredient ingredient1, Ingredient ingredient2,
                 Ingredient ingredient3){

        this.ingredient1 = ingredient1;
        this.ingredient2 = ingredient2;
        this.ingredient3 = ingredient3;
        this.name = name;
        this.price = price;
        this.withAlcohol = withAlcohol;

    }

}
