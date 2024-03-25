package Ex7;

public class Eq2Grau {
    private double a;
    private double b;
    private double c;

    public Eq2Grau(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcDelta() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double calcRaiz1() {
        return (-b + Math.sqrt(calcDelta())) / (2 * a);
    }

    public double calcRaiz2() {
        return (-b - Math.sqrt(calcDelta())) / (2 * a);
    }
    
}
