package Ex6;
import java.util.Random;
public class JogoAdivinhacao {
    private int numeroSorteado;
    private Random random;

    public JogoAdivinhacao() {
        random = new Random();
    }

    public void sortear() {
        numeroSorteado = random.nextInt(100);
    }

    public void adivinhar(int numero) {
        if (numero == numeroSorteado) {
            System.out.println("Parabéns, você acertou!");
        } else if (numero < numeroSorteado) {
            System.out.println("O número sorteado é maior.");
        } else {
            System.out.println("O número sorteado é menor.");
        }
    }
}