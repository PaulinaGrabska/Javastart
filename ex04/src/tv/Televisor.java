package tv;
/*
- turnOn()- włącza telewizor
- turnOff()- wyłącza telewizor
- showStatus()- wyświetla informację, czy telewizor jest włączony, czy wyłączony

Utwórz klasę testową z metodą main, utwórz w niej telewizor (domyślnie powinien być wyłączony), a następnie:

wyświetl status, włącz telewizor i ponownie wyświetl status, wyłącz telewizor i ponownie wyświetl status
 */

public class Televisor {

    boolean status;

    public void turnOn(){
        status = true;
    }

    public void turnOff(){
        status = false;
    }

    public void showStatus(){
        if(status==true) {
            System.out.println("Tv is turn on");
        }else{
            System.out.println("Tv is turn off");
        }
    }

}
