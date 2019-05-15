package warehouse;

public class Device {

    private String code;
    private String producer;
    private String type;
    private double price;


    public Device(String code, String producer, String type, double price) {
        this.code = code;
        this.producer = producer;
        this.type = type;
        this.price = price;
    }

    public Device(String code, String producer, String type) {
        this.code = code;
        this.producer = producer;
        this.type = type;
    }

     public String getInfo(){
        return "Kod: " + code + ", producent: " + producer + ", typ: " + type + ", cena: " + price;
     }

        


}
