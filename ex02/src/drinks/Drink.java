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

        setIngredient1(ingredient1);
        setIngredient2(ingredient2);
        setIngredient3(ingredient3);
        setName(name);
        setPrice(price);
        setWithAlcohol(withAlcohol);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWithAlcohol() {
        return withAlcohol;
    }

    public void setWithAlcohol(boolean withAlcohol) {
        this.withAlcohol = withAlcohol;
    }

    public Ingredient getIngredient1() {
        return ingredient1;
    }

    public void setIngredient1(Ingredient ingredient1) {
        this.ingredient1 = ingredient1;
    }

    public Ingredient getIngredient2() {
        return ingredient2;
    }

    public void setIngredient2(Ingredient ingredient2) {
        this.ingredient2 = ingredient2;
    }

    public Ingredient getIngredient3() {
        return ingredient3;
    }

    public void setIngredient3(Ingredient ingredient3) {
        this.ingredient3 = ingredient3;
    }
}
