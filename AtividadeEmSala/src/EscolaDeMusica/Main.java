package EscolaDeMusica;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int opcao = 0;
        Scanner scn = new Scanner(System.in);
        InstrumentoMusical[] banda = new InstrumentoMusical[4];

        banda[0] = new Violao ("Violão Clássico", "Madeira", 5);
        banda[1] = new Saxofone ("Saxofone Alto", "Latão");
        banda[2] = new Piano ("Piano de Cauda", "Madeira", 88);
        banda[3] = new Bateria ("Bateria","Madeira",5);



        do {

            //Menu
            System.out.println("---------Menu-------");
            System.out.println("1 - Afinar banda");
            System.out.println("2 - Tocar");
            System.out.println("3 - Informações");
            System.out.println("0 - fechar");
            System.out.println("--------------------");

            System.out.println("Digite a opção desejada: ");
            opcao = scn.nextInt();
            scn.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("------Afinando------");
                    for (InstrumentoMusical ins : banda) {
                        if (ins != null) {
                            ins.afinar();
                        }
                    }
                    System.out.println("--------------------");
                    break;

                case 2:
                    System.out.println("-------Tocando-------");
                    for (InstrumentoMusical ins : banda) {
                        if (ins != null) {
                            ins.tocar();
                        }
                    }
                    System.out.println("--------------------");
                    break;

                case 3:
                    System.out.println("-------Informações-------");
                    for (InstrumentoMusical ins : banda) {
                        if (ins != null) {
                            ins.info();
                        }
                    }
                    System.out.println("--------------------");
                    break;
            }
        }while(opcao!= 0);
    }
}