package ex12_03;
//taktowanie, np. 3000MHz, zakładana temperatura przy takim taktowaniu i maksymalna bezpieczna temperatura

public class Processor extends Part implements Timing{

    private double timing; // in MHz
    private double temperature;
    private double maxTempareture;


    public Processor(String model, String producent, String serialNo, double timing, double temperature, double maxTempareture) {
        super(model, producent, serialNo);
        this.timing = timing;
        this.temperature = temperature;
        this.maxTempareture = maxTempareture;
    }

    public double getTiming() {
        return timing;
    }

    public void setTiming(double timing) {
        this.timing = timing;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getMaxTempareture() {
        return maxTempareture;
    }

    public void setMaxTempareture(double maxTempareture) {
        this.maxTempareture = maxTempareture;
    }

    @Override
    public void timingIncrease(double increment) {
        double tempIncrease = (increment/100)*10; //every +100 MHz -> +10 C temp.
        if((getTemperature()+tempIncrease)>getMaxTempareture()){
            throw new TooHighTemperature();
        }else {
            setTemperature(getTemperature() + tempIncrease);
            setTiming(getTiming() + increment);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", timing: " + timing +" MHZ, temperature: " + temperature + ", maxTempareture: " + maxTempareture;
    }
}
