package EscolaDeMusica;

public class Saxofone extends InstrumentoMusical{

    public Saxofone(String nome, String material) {
        super(nome, material);
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Assoprando saxofone");
    }

    @Override
    public void tocar(){
        super.tocar();
        System.out.println("Fluuuuu!");
    }

}
