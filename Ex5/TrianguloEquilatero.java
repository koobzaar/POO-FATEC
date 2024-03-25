package Ex5;

public class TrianguloEquilatero {
    private double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    public double calcPerimetro() {
        return 3 * lado;
    }

    public double calcArea() {
        return (Math.sqrt(3) / 4) * Math.pow(lado, 2);
    }
    
}
