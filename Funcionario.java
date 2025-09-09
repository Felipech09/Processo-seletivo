import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.ArrayList;

class Funcionario {
  String nome;
  String cargo;
  LocalDate dataContrato;
  double vendasMes;

  Funcionarios (String nome, String cargo, int mes, int ano) {
    this.nome = nome;
    this.cargo = cargo;
    this.dataContrato = LocalDate.of(ano, mes, 1);
  } 

  int anoServico(int mes, int ano) {
    LocalDate atual = LocalDate.of(ano, mes, 1);
    return Period.between(dataContrato, atual) .getYears();
  }

  double salario (int mes, int ano) {
    int anos = anoervico(mes, ano);
    if (cargo.equals("Secretário")) return salario(mes, ano) * 0.2;
    if (cargo.euals("Venddedor")) return vendas<es * 0.3;
    return 0;
  }
}
