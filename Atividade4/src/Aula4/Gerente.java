package Aula4;

import java.util.ArrayList;

public class Gerente extends Funcionario{
    private int equipe;
    private double bonus;
    private ArrayList<Funcionario> listaEquipe;

    public Gerente(String no, int id, String cpf, String ca, String daAd, double sa, int eq){
        super(no, id, cpf, ca, daAd, sa);
        this.equipe = eq;
        this.bonus = 0.20;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getEquipe() {
        return equipe;
    }

    public void setEquipe(int equipe) {
        this.equipe = equipe;
    }

    public double calcularSalarioComBonus(){
        double novoSalario = getSalario() * (1 + getBonus());
        setSalario(novoSalario);
        return novoSalario;
    }

    public void gerenciarEquipe(Funcionario F){
        listaEquipe.add(F);
        System.out.println(F.getNome() + " agora faz parte da equipe do gerente " + getNome());
    }

    @Override
    public void mostrarDados(){
        System.out.println(" ");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("CPF: " + getCpf());
        System.out.println("Cargo: " + getCargo());
        System.out.println("Data de Admissão: " + getDataAdmissao());
        System.out.println("Salário: " + getSalario());
        System.out.println("Salario com Bônus: " + calcularSalarioComBonus());
        System.out.println(" ");
    }
}
