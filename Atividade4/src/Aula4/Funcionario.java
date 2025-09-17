package Aula4;

public class Funcionario extends Pessoa{
    private String cargo;
    private String dataAdmissao;
    private double salario;

    public Funcionario(String no, int id, String cpf, String ca, String daAd, double sa){
        super(no,id,cpf);
        this.cargo = ca;
        this.dataAdmissao = daAd;
        this.salario = sa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }
    
    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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
        System.out.println(" ");
    }

    public double calcularSalarioAnual(double aumento){
        return getSalario() * (1 + (aumento / 100));
    }

    public void receberAumento(double valor){
        double novoSalario = calcularSalarioAnual(valor);
        setSalario(novoSalario);
    }
    
}
