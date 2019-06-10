package ex12_01;
//jeśli ktoś przy próbie utworzenia obiektu Person przekaże do konstruktora imię lub nazwisko będące nullem
// lub mające mniej niż 2 znaki
public class NameUndefinedException extends RuntimeException{

    public NameUndefinedException() {
        super("First Name and Last name can't be null or have less than 2 letters.");
    }
}
