package src.Model;
import src.Enum.TipoFuncionario;

public class Funcionario extends Pessoa {
    private double salario;
    private TipoFuncionario tipo;
    private static int TotalFuncionarios;

    
    public double getSalario() { 
        return salario; 
    }

    public void setSalario(double sal) {
         this.salario = sal;
    }

    public double calcComissao() {
        return this.getSalario() * 0.1;
    }
}