package ex12_03;
// (ilość pamięci i taktowanie, np. 4096MB 1066MHz, zakładana temperatura przy takim taktowaniu i maksymalna bezpieczna temperatura)

public class Ram extends Processor {

    private double memory; // in MB

    public Ram(String model, String producent, String serialNo, double timing, double temperature, double maxTempareture, double memory) {
        super(model, producent, serialNo, timing, temperature, maxTempareture);
        this.memory = memory;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    @Override
    public void timingIncrease(double increment) {
        double tempIncrease = (increment/100)*15; //every +100 MHz -> +15 C temp.
        if((getTemperature()+tempIncrease)>getMaxTempareture()){
            throw new TooHighTemperature();
        }else {
            setTemperature(getTemperature() + tempIncrease);
            setTiming(getTiming() + increment);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", memory: " + memory + " MB";
    }
}
