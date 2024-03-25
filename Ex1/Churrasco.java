package Ex1;
public class Churrasco {
    public double qtdCarne;

    public Churrasco(double qtdCarne) {
        this.qtdCarne = qtdCarne;
    }

    public void verificarConsumo(Pessoa pessoa) {
        if (pessoa.idade >= 4 && pessoa.idade <= 12 && !pessoa.vegetariana) {
            qtdCarne += 1;
        } else if (pessoa.idade >= 13 && !pessoa.vegetariana) {
            qtdCarne += 2;
        }

        System.out.println("Nome: " + pessoa.nome + "\nQuantidade de carne consumida: " + qtdCarne + "kg\n");
    }
}