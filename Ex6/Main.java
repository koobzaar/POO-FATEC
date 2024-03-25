
package Ex6;

public class Main {
    public static void main(String[] args) {
        JogoAdivinhacao jogo = new JogoAdivinhacao();

        jogo.sortear();
        jogo.adivinhar(50);
        jogo.adivinhar(25);
        jogo.adivinhar(75);
        jogo.adivinhar(100);
    }
    
}

