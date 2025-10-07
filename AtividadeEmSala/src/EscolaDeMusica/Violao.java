package EscolaDeMusica;

public class Violao extends InstrumentoMusical {
    private int cordas;

    public Violao(String nome, String material, int cordas) {
        super(nome, material);
        this.cordas = cordas;
    }

    public void mostraraInfos(){
           System.out.println("O violão tem " + getCordas() + " cordas");
       }

    @Override
    public void afinar() {
        System.out.println("Ajustando a tensão das cordas violão");
    }

    @Override
    public void tocar() {
        System.out.println("Brooommm!");
    }

    public int getCordas() {
        return cordas;
    }

    public void setCordas(int cordas) {
        this.cordas = cordas;
    }
}
