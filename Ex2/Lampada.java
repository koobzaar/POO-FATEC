package Ex2;

enum Estado {
    APAGADA, ACESA
}

public class Lampada {
    private Estado estado;
    private int qtdAcendimentos;

    public Lampada() {
        this.estado = Estado.APAGADA;
        this.qtdAcendimentos = 0;
    }

    public void click() {
        if (this.estado == Estado.APAGADA) {
            this.estado = Estado.ACESA;
        } else {
            this.estado = Estado.APAGADA;
        }
        this.qtdAcendimentos++;
    }

    public int qtdAcendimentos() {
        return this.qtdAcendimentos;
    }

    public Estado checaEstado() {
        return this.estado;
    }
    
}
