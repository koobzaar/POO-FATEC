package Ex11;


public class Main {
    public static void main(String[] args) {
        Edificio edificio = new Edificio();
        Apartamento apartamento1 = new Apartamento(1);
        Apartamento apartamento2 = new Apartamento(2);
        Apartamento apartamento3 = new Apartamento(3);

        edificio.adicionarApartamento(apartamento1);
        edificio.adicionarApartamento(apartamento2);
        edificio.adicionarApartamento(apartamento3);

        edificio.listarApartamentos();

        System.out.println(edificio.buscarApartamento(2));
    }
}

