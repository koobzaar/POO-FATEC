package Ex3;

public class Main {
    public static void main(String[] args) {
        Complexo complexo1 = new Complexo(1, 2);
        Complexo complexo2 = new Complexo(3, 4);

        System.out.println("Complexo 1: " + complexo1);
        System.out.println("Complexo 2: " + complexo2);

        System.out.println("Soma: " + complexo1.soma(complexo2));
        System.out.println("Multiplicação: " + complexo1.multiplica(complexo2));
        System.out.println("Módulo: " + complexo1.modulo());
        System.out.println("Argumento principal: " + complexo1.argumentoPrincipal());
    }
    
}
// Path: Ex3/Complexo.java
