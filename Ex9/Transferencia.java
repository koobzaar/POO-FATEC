package Ex9;

public class Transferencia {
    public void transferir(Cliente c1, Cliente c2, double quantia) {
        if (c2.checarSaldo() >= quantia) {
            c2.sacar(quantia);
            c1.depositar(quantia);
            System.out.println("Transferência de R$" + quantia + " realizada com sucesso de " + c2.obterNome() + " para " + c1.obterNome());
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

