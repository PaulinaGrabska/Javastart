package ex12_01;
/* wyjątek powinien być rzucony, jeśli ktoś przy próbie utworzenia obiektu Person przekaże do konstruktora wiek mniejszy niż 1
 */
public class IncorrectAgeException extends RuntimeException{

    public IncorrectAgeException() {
        super("Person can't be less than 1 year old. ");
    }
}
