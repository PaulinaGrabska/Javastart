package ex12_03;
//nazwę modelu, producenta i numer seryjny.

public abstract class Part {

    String model;
    String producent;
    String serialNo;

    public Part(String model, String producent, String serialNo) {
        this.model = model;
        this.producent = producent;
        this.serialNo = serialNo;
    }

    @Override
    public String toString() {
        return "Model: "+ model +", Producent: " + producent + ", serialNo: " + serialNo ;
    }
}
