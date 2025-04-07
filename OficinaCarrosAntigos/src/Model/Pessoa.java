package src.model;
public abstract class Pessoa {
    private String nome;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() { 
        return nome; 
    }

    public void setNome(String nom) { 
        this.nome = nom;
    }
    
    public String getCpf() { 
        return cpf; 
    }

    public void setCpf(String cpf) { 
        this.cpf = cpf; 
    }

    public abstract String apresentacao();
}