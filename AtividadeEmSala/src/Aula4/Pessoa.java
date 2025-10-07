package Aula4;

public class Pessoa{
    protected String nome;
    protected int idade;
    protected String cpf;

    public Pessoa(String no, int id, String cpf){
        this.nome = no;
        this.idade = id;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void mostrarDados(){
        System.out.println(" ");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println(" ");
    }
}