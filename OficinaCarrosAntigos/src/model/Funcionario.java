package src.model;
import src.Enum.TipoFuncionario;

public class Funcionario extends Pessoa {
    private double salario;
    private TipoFuncionario tipo;
    private static int TotalFuncionarios;

    public Funcionario(double salario, String nome, String cpf) {
        super(nome,cpf);
        this.salario = salario;
        TotalFuncionarios++;
    }

    public TipoFuncionario getTipo() {
        return tipo;
    }

    public void setTipo(TipoFuncionario tipo) {
        this.tipo = tipo;
    }

    public static int getTotalFuncionarios() {
        return TotalFuncionarios;
    }

    public double getSalario() { 
        return salario; 
    }

    public void setSalario(double sal) {
         this.salario = sal;
    }

    public double calcComissao() {
        return this.getSalario() * 0.1;
    }

    @Override
    public String apresentacao() {
        return "Funcionário: " + this.getNome() + ", CPF: " + this.getCpf() + ", Salário: " + this.getSalario();
    }
    
}