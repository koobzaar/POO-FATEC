package Ex11;

class Apartamento {
    private int numero;

    public Apartamento(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Apartamento " + numero;
    }
}

