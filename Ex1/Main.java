package Ex1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("João", "Masculino", 10, false);
        Pessoa pessoa2 = new Pessoa("Maria", "Feminino", 15, true);
        Pessoa pessoa3 = new Pessoa("José", "Masculino", 20, false);

        Churrasco churrasco = new Churrasco(0);

        churrasco.verificarConsumo(pessoa1);
        churrasco.verificarConsumo(pessoa2);
        churrasco.verificarConsumo(pessoa3);
    }
}


