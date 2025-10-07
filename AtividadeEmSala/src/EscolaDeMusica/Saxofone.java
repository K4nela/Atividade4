package EscolaDeMusica;

public class Saxofone extends InstrumentoMusical{

    public Saxofone(String nome, String material) {
        super(nome, material);
    }

    public void info(){
        System.out.println("O Saxofone é de " + getMaterial());
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
