// Exerc´ıcio 7. Implemente a classe Eq2Grau que possua: Atributos: a, b e
// c (doubles); M´etodos: delta(): retorna o delta da equa¸c˜ao; raiz1(): retorna a
// primeira raiz se Δ ≥ 0, se n˜ao, retorna NaN; raiz2(): retorna a segunda raiz se
// Δ ≥ 0, se n˜ao, retorna NaN.

package Ex7;

public class Main {
    public static void main(String[] args) {
        Eq2Grau eq = new Eq2Grau(1, -5, 6);

        System.out.println("Delta: " + eq.calcDelta());
        System.out.println("Raiz 1: " + eq.calcRaiz1());
        System.out.println("Raiz 2: " + eq.calcRaiz2());
    }
}

// Path: Ex7/Eq2Grau.java