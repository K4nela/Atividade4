package EscolaDeMusica;

public class Piano extends InstrumentoMusical{
    private int numeroTeclas;

    public Piano(String nome, String material, int numeroTeclas) {
        super(nome, material);
        this.numeroTeclas = numeroTeclas;
    }

    @Override
    public void tocar() {
        System.out.println("Plim! Plim! Plom!");
    }

    @Override
    public void afinar() {
        System.out.println("Ajustando as cordas e martelos do piano");
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }
}
