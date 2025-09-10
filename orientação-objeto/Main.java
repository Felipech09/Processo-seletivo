import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Funcionario> funcionarios = new ArrayList<>();

        // Secretários
        Funcionario jorge = new Funcionario("Jorge Carvalho", "Secretário", 1, 2018);
        Funcionario maria = new Funcionario("Maria Souza", "Secretário", 12, 2015);

        // Vendedores
        Funcionario ana = new Funcionario("Ana Silva", "Vendedor", 12, 2021);
        Funcionario joao = new Funcionario("João Mendes", "Vendedor", 12, 2021);

        // Gerentes
        Funcionario juliana = new Funcionario("Juliana Alves", "Gerente", 7, 2017);
        Funcionario bento = new Funcionario("Bento Albino", "Gerente", 3, 2014);

        // Vendas do mês 12/2021
        ana.vendasMes = 5200;
        joao.vendasMes = 3400;
    
        funcionarios.add(jorge);
        funcionarios.add(maria);
        funcionarios.add(ana);
        funcionarios.add(joao);
        funcionarios.add(juliana);
        funcionarios.add(bento);

        // Mês e ano de referência
        int mes = 12;
        int ano = 2021;

        // Total pago
        double totalPago = 0;
        for (Funcionario f : funcionarios) {
            totalPago += f.totalRecebido(mes, ano);
        }
        System.out.println("Total pago (salário + benefício): R$ " + totalPago);

        // Total em salários
        double totalSalarios = 0;
        for (Funcionario f : funcionarios) {
            totalSalarios += f.salario(mes, ano);
        }
        System.out.println("Total em salários: R$ " + totalSalarios);

        // Total em benefícios
        double totalBeneficios = 0;
        for (Funcionario f : funcionarios) {
            if (!f.cargo.equals("Gerente")) {
                totalBeneficios += f.beneficio(mes, ano);
            }
        }
        System.out.println("Total em benefícios: R$ " + totalBeneficios);

        // Quem mais recebeu
        Funcionario maiorRecebimento = funcionarios.get(0);
        for (Funcionario f : funcionarios) {
            if (f.totalRecebido(mes, ano) > maiorRecebimento.totalRecebido(mes, ano)) {
                maiorRecebimento = f;
            }
        }
        System.out.println("Quem recebeu mais: " + maiorRecebimento.nome);

        // Quem recebeu mais benefício
        Funcionario maiorBeneficio = jorge; // começa com alguém que recebe benefício
        for (Funcionario f : funcionarios) {
            if (!f.cargo.equals("Gerente")) {
                if (f.beneficio(mes, ano) > maiorBeneficio.beneficio(mes, ano)) {
                    maiorBeneficio = f;
                }
            }
        }
        System.out.println("Quem recebeu mais benefício: " + maiorBeneficio.nome);

        // Vendedor que mais vendeu
        Funcionario maiorVenda = ana;
        for (Funcionario f : funcionarios) {
            if (f.cargo.equals("Vendedor")) {
                if (f.vendasMes > maiorVenda.vendasMes) {
                    maiorVenda = f;
                }
            }
        }
        System.out.println("Vendedor que mais vendeu: " + maiorVenda.nome);
    }
}
