package EscolaDeMusica;

public class Main {
    public static void main(String[] args){

        InstrumentoMusical ins = new InstrumentoMusical() {
            @Override
            public void tocar() {
                super.tocar();
            }

            @Override
            public void afinar() {
                super.afinar();
            }
        };

        Violao v = new Violao();
        Saxofone s = new Saxofone();

        v.afinar();
        s.afinar();

//        ins.tocar();
    }
}
