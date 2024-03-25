
package Ex12;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", "123.456.789-00", new Telefone("11", "99999-9999"));

        cliente.mostrarDados();
        cliente.adicionarTelefone(new Telefone("11", "88888-8888"));
        cliente.mostrarDados();
    }
}
