package Ex9;

public class Cliente {
    private String nome;
    private double saldo;
    private double limite;

    public Cliente(String nome, double saldo, double limite) {
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
    }

    public void sacar(double quantia) {
        if (saldo + limite >= quantia) {
            saldo -= quantia;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    public void depositar(double quantia) {
        saldo += quantia;
    }

    public double checarSaldo() {
        return saldo + limite;
    }

    public String obterNome() {
        return nome;
    }
}
