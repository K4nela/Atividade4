package Aula4;

public class Main {
    public static void main(String[] args){
        Funcionario f[] = new Funcionario[3];
        Gerente g[] = new Gerente[2];

        g[0] = new Gerente ("Maria", 19, "111.222.333-44", "Gerente de Ti", "01/01/2025", 1500, 1);
        g[1] = new Gerente ("Samuel", 40, "222.333.444-55", "Gerente de Segurança", "01/03/2025", 1000,2);

        f[0] = new Funcionario ("Felipe", 20, "333.444.555-66", "Segurança", "01/12/2024", 2000);
        f[1] = new Funcionario ("Lucas", 18, "444.555.666-77", "Técnico de Ti", "01/11/2024", 2000);
        f[2] = new Funcionario ("Duda", 22, "555.666.777-88", "Secretária", "01/10/2024", 1300);

        System.out.println("=== Funcionários ===");
        for(int i = 0; i < f.length; i++) {
            f[i].mostrarDados();
        }

        System.out.println("=== Gerentes ===");
        for(int i = 0; i < g.length; i++) {
            g[i].mostrarDados();
        }

        // Aumentando salário do gerente
        g[0].receberAumento(10);
        System.out.println("Salário de " + g[0].getNome() + " após aumento: " + g[0].getSalario());

        // Calculando salário anual de um funcionário
        double salarioAnualDuda = f[2].calcularSalarioAnual(15);
        System.out.println("Salário anual da " + f[2].getNome() + " com aumento de 15%: " + salarioAnualDuda);

        // Gerenciar equipe
        g[0].gerenciarEquipe(f[0]);
        g[0].gerenciarEquipe(f[1]);
    }
}
