package EscolaDeMusica;

public class Bateria extends InstrumentoMusical{
    private int numeroDePecas;

    public Bateria(String nome, String material, int numeroDePecas) {
        super(nome, material);
        this.numeroDePecas = numeroDePecas;
    }

    @Override
    public void afinar() {
        System.out.println("Ajustando tensão dos tambores");
    }

    @Override
    public void tocar() {
        System.out.println("Boom! Tuts Tuts!");
    }

    public int getNumetoDePecas() {
        return numeroDePecas;
    }

    public void setNumetoDePecas(int numetoDePecas) {
        this.numeroDePecas = numetoDePecas;
    }
}
