package Ex12;

public class Cliente {
    private String nome;
    private String cpf;
    private Telefone telefone;

    public Cliente(String nome, String cpf, Telefone telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Telefone: " + this.telefone.obterDDD() + " " + this.telefone.obterNumero());
    }

    public void adicionarTelefone(Telefone telefone) {
        this.telefone = telefone;
    }
}