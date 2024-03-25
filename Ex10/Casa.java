package Ex10;

class Casa {
    private String cor;
    private Porta portaEntrada;
    private Porta porta1;
    private Porta porta2;
    private Porta porta3;

    public Casa(String cor, Porta portaEntrada, Porta porta1, Porta porta2) {
        this.cor = cor;
        this.portaEntrada = portaEntrada;
        this.porta1 = porta1;
        this.porta2 = porta2;
    }

    public void abrirPortaEntrada() {
        portaEntrada.abrir();
    }

    public void abrirPorta1() {
        porta1.abrir();
    }

    public void abrirPorta2() {
        porta2.abrir();
    }

    public void abrirPorta3() {
        porta3.abrir();
    }

    public int portasAbertas() {
        int portasAbertas = 0;

        if (portaEntrada.isOpen()) {
            portasAbertas++;
        }

        if (porta1.isOpen()) {
            portasAbertas++;
        }

        if (porta2.isOpen()) {
            portasAbertas++;
        }

        if (porta3.isOpen()) {
            portasAbertas++;
        }

        return portasAbertas;
    }
}
