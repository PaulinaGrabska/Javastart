package ex12_03;

public class Computer {

    private Processor processor;
    private Ram ram;
    private HardDrive hd;

    public Computer(Processor processor, Ram ram, HardDrive hd) {
        this.processor = processor;
        this.ram = ram;
        this.hd = hd;
    }


    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public HardDrive getHd() {
        return hd;
    }

    public void setHd(HardDrive hd) {
        this.hd = hd;
    }

    @Override
    public String toString() {
        return "Computer {\n" +
                "Processor [" + processor +
                "]\nRAM [" + ram +
                "]\nHard Disk Drive [" + hd +"] }";
    }
}
