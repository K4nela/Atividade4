package EscolaDeMusica;

public class Saxofone extends InstrumentoMusical{

    public Saxofone(String nome, String material) {
        super(nome, material);
    }

    @Override
    public void afinar() {
        System.out.println("Assoprando saxofone");
    }

    @Override
    public void tocar(){
        System.out.println("Fluuuuu!");
    }

}
