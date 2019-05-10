package shop;
import java.time.LocalDate;


import com.sun.scenario.effect.impl.prism.PrDrawable;

import java.time.LocalDate;

public class SpecialOffer {

    Product product;
    String description;
    LocalDate startdate;
    LocalDate endDate;
    double discount;


    public SpecialOffer(Product product, String description, LocalDate startdate, LocalDate endDate, double discount){
        this.product=product;
        this.description=description;
        this.startdate=startdate;
        this.endDate=endDate;
        this.discount=discount;
    }


    public String toString(){

            return "\n" + product.name.toUpperCase() + "\n\"" + description + "\"\n\t" + "Starts from: " + startdate + " Ends at: " + endDate + "\n\t Discount --> " + discount*100 + "% ";

    }

}
