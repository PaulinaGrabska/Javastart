package room;

public class Room {

    private double temperature;
    private double measurement;
    private boolean hasAirConditioner;    private static final double MIN_TEMPERSATURE = 16.0;
    private double cubature;  //m^3
    private double efficiency; // 1 degree lower/higher per m^3/h


    public Room(double temperature, double measurement, boolean hasAirConditioner, double cubature, double efficiency) {
        this.temperature = temperature;
        this.measurement = measurement;
        this.hasAirConditioner = hasAirConditioner;
        this.cubature = cubature;
        this.efficiency = efficiency;
    }

    public double getTemperature() {
        return temperature;
    }


    public boolean decreaseOne(){
        if(hasAirConditioner && temperature>=MIN_TEMPERSATURE){
            temperature-=1;
            return true;
        }else{
            return  false;
        }
    }


    public double timeOfCooling(){
        if(decreaseOne()){
            return cubature/efficiency*60;
        }else{
            return 0;
        }
    }


}
