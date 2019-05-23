package welcome;
/*
Napisz program, w którym wczytasz od użytkownika 5 imion a następnie wyświetlisz na ekranie powitanie każdej z osób,
ale w kolejności odwrotnej niż je wprowadzono.
Np.
Podaj 5 imion:
Ania
Bartek
Wojtek
Karol
Zosia
Cześć Zosia
Cześć Karol
Cześć Wojtek
Cześć Bartek
Cześć Ania
 */
public class Welcome {

    private String [] names = new String [5];
    private int nameNumbers;

    public void sayHi(){
        for (int i = 4; i >=0 ; i--) {
            System.out.println("Hi " + names[i]);
        }
    }

    public void addName(String name){
        if(nameNumbers<names.length){
            names[nameNumbers]=name;
            nameNumbers++;
        }
    }

    public String[] getNames() {
        return names;
    }
}
