package point;
/*
Napisz program, w którym wczytasz współrzędne punktu w przestrzeni (X, Y) a następnie wyświetlisz na
ekranie informację mówiącą o tym, w której ćwiartce układu się on znajduje.
Np.
Podaj X
5
Podaj Y
-3
Punkt (5, -3) leży w IV ćwiartce układu współrzędnych.
Sprawdzanie tego, w której ćwiartce leży punkt wydziel do osobnej klasy. Możesz zdefiniować dodatkową klasę P
oint do reprezentowania punktu. Zwróć uwagę na to, żeby numer ćwiartki był wyświetlony w postaci liczby rzymskiej.
 */

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
