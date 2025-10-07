package EscolaDeMusica;

public class Piano extends InstrumentoMusical{
    private int numeroTeclas;

    public Piano(String nome, String material, int numeroTeclas) {
        super(nome, material);
        this.numeroTeclas = numeroTeclas;
    }
    
          @Override
    public void info() {
        super.info();
        System.out.println("Tem " + getNumetoDeTeclas() + " teclas");
    }

    @Override
    public void tocar() {
        super.tocar();
        System.out.println("Plim! Plim! Plom!");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando as cordas e martelos do piano");
    }

    public int getNumeroTeclas() {
        return numeroTeclas;
    }

    public void setNumeroTeclas(int numeroTeclas) {
        this.numeroTeclas = numeroTeclas;
    }
}
