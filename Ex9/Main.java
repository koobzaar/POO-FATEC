package Ex9;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", 1000, 500);
        Cliente cliente2 = new Cliente("Maria", 2000, 1000);

        Transferencia transferencia = new Transferencia();
        transferencia.transferir(cliente1, cliente2, 300);
    }
}
