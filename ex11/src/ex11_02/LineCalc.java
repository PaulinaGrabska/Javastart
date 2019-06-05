package ex11_02;

public class LineCalc {

    double lineLength(Line2D line){
        double xlength=Math.abs(line.getP1().getX()-line.getP2().getX());
        double ylength=Math.abs(line.getP1().getY()-line.getP2().getY());
        return Math.sqrt((xlength*xlength)+(ylength*ylength));
    }
}
