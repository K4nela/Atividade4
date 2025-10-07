package EscolaDeMusica;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        InstrumentoMusical[] banda = new InstrumentoMusical[4];

        banda[0] = new Violao ("Violão Classico", "Madeira", 5);
        banda[1] = new Saxofone ("Saxofone Alto", "Latão");
        banda[2] = new Piano ("Piano de Cauda", "Madeira", 88);
        banda[3] = new Bateria ("Bateria","Madeira",5);
        
        for(InstrumentoMusical ins: banda){
            if(ins!=null){
                ins.tocar();
            }
        }
    }
}