
package Ex10;


public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa("Azul", new Porta(), new Porta(), new Porta());

        casa.abrirPortaEntrada();
        casa.abrirPorta1();
        casa.abrirPorta2();
        casa.abrirPorta3();

        System.out.println("Portas abertas: " + casa.portasAbertas());
    }
}

