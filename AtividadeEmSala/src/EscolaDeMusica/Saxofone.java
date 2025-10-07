package EscolaDeMusica;

public class Saxofone extends InstrumentoMusical{
    private String material;

    @Override
    public void afinar() {
        System.out.println("Afinando saxofone");
    }

    @Override
    public void tocar(){
        System.out.println("Tocando saxofone");
    }

    public String getSax() {
        return material;
    }

    public void setSax(String sax) {
        this.material = sax;
    }
}
