package shop;

public class Product {

    String name;
    double price;
    String description;
    Category category;

    public Product(String name, double price, String description, Category category){

        this.name = name;
        this.price = price;
        this.description=description;
        this.category=category;
    }


    public String toString(){

        if(category!=null) {
            return "\nCategory: " + category.name + " \"" + category.description + "\"\n\t" + name + " - \"" + description + "\", price: " + price + " zl.\n";
        }else{
            return "\nNO CATEGORY:\n\t" + name + " - \"" + description + "\", price: " + price + " zl.\n";
        }
    }

}
