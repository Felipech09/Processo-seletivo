import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.ArrayList;

class Funcionario {
    String nome;
    String cargo;
    LocalDate dataContrato;
    double vendasMes;

    // Construtor corrigido: nome da classe estava errado
    public Funcionario(String nome, String cargo, int mes, int ano) {
        this.nome = nome;
        this.cargo = cargo;
        this.dataContrato = LocalDate.of(ano, mes, 1);
    } 

    // Método `anoServico` estava correto, mas a chamada para ele estava errada em outro método
    int anosServico(int mes, int ano) {
        LocalDate atual = LocalDate.of(ano, mes, 1);
        return Period.between(dataContrato, atual).getYears();
    }

    // Método `salario` corrigido: `anoervico` estava com erro de digitação
    double salario(int mes, int ano) {
        int anos = anosServico(mes, ano);
        if (cargo.equals("Secretário")) return 7000 + 1000 * anos;
        if (cargo.equals("Vendedor")) return 12000 + 1800 * anos;
        if (cargo.equals("Gerente")) return 20000 + 3000 * anos;
        return 0;
    }

    // Método `beneficio` corrigido: faltava `return`, `equals` e `Vendedor` estavam com erros de digitação
    double beneficio(int mes, int ano) {
        if (cargo.equals("Secretário")) return salario(mes, ano) * 0.2;
        if (cargo.equals("Vendedor")) return vendasMes * 0.3;
        return 0;
    }

    // O método `totalRecebido` estava correto
    double totalRecebido(int mes, int ano) {
        return salario(mes, ano) + beneficio(mes, ano);
    }
}
