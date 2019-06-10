package ex12_03;

public class Main {

    public static void main(String[] args) {


        Computer computer = new Computer(new Processor("Quad Q6600", "Intel Core", "3444", 2400, 45, 60),
                new Ram("ValueRAM", "Kingston", "3221", 667, 30, 70, 2000),
                new HardDrive("UDMA/100", "Western Digital","5668", 80));

        System.out.println(computer);

        try{
            computer.getProcessor().timingIncrease(100);
            computer.getRam().timingIncrease(200);
        }catch(TooHighTemperature e){
            System.out.println(e.getMessage());
        }

        System.out.println("After changes: \n" +computer);

    }
}
