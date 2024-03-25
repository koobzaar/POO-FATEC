package Ex8;

public class Main {
    public static void main(String[] args) {
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();

        porta1.abrir();
        porta1.fechar();
        porta2.abrir();
        porta2.fechar();

        System.out.println("Número de aberturas: " + Porta.getNumAberturas());
    }
}


