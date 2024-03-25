package Ex4;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", 1000, 500);

        System.out.println("Saldo: " + cliente.checarSaldo());
        cliente.sacar(200);
        System.out.println("Saldo: " + cliente.checarSaldo());
        cliente.depositar(300);
        System.out.println("Saldo: " + cliente.checarSaldo());
    }
}
