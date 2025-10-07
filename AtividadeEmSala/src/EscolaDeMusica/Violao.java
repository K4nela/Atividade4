package EscolaDeMusica;

public class Violao extends InstrumentoMusical {
       private String material;

       public void mostraraInfos(){
           System.out.println("O violão é de " + getMaterial());
       }

    @Override
    public void afinar() {
        System.out.println("Modificando a tensão das cordas violão");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando violão");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
