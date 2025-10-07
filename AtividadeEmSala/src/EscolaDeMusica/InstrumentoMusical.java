package EscolaDeMusica;

import java.lang.constant.Constable;

public abstract class InstrumentoMusical {
    protected String nome;
    protected String material;

    public InstrumentoMusical(String nome, String material){
        this.nome = nome;
        this.material = material;
    }

    public void info(){
        System.out.println("O " + getNome() + " é de " + getMaterial());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void tocar(){
        System.out.println("Tocando instrumento " + getNome());
    }

    public void afinar(){
        System.out.println("Afinando instrumento" + getNome());
    }
    }
