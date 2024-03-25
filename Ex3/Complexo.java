package Ex3;

public class Complexo {
    private double a;
    private double b;

    public Complexo(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public Complexo soma(Complexo complexo) {
        return new Complexo(this.a + complexo.a, this.b + complexo.b);
    }

    public Complexo multiplica(Complexo complexo) {
        return new Complexo(this.a * complexo.a - this.b * complexo.b, this.a * complexo.b + this.b * complexo.a);
    }

    public double modulo() {
        return Math.sqrt(Math.pow(this.a, 2) + Math.pow(this.b, 2));
    }

    public double argumentoPrincipal() {
        return Math.atan(this.b / this.a);
    }

    @Override
    public String toString() {
        return this.a + " + " + this.b + "i";
    }
}