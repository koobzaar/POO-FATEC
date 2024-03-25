package Ex11;
import java.util.ArrayList;

class Edificio {
    private ArrayList<Apartamento> apartamentos = new ArrayList<Apartamento>();

    public void adicionarApartamento(Apartamento apartamento) {
        apartamentos.add(apartamento);
    }

    public void listarApartamentos() {
        for (Apartamento apartamento : apartamentos) {
            System.out.println(apartamento);
        }
    }

    public Apartamento buscarApartamento(int numero) {
        for (Apartamento apartamento : apartamentos) {
            if (apartamento.getNumero() == numero) {
                return apartamento;
            }
        }

        return null;
    }
}