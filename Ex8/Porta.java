package Ex8;

public class Porta {
    private boolean isOpen;
    private static int numAberturas;

    public Porta() {
        this.isOpen = false;
    }

    public void abrir() {
        this.isOpen = true;
        numAberturas++;
    }

    public void fechar() {
        this.isOpen = false;
    }

    public static int getNumAberturas() {
        return numAberturas;
    }
}