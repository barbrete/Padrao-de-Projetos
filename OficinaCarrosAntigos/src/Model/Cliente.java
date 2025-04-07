package src.model;
public class Cliente extends Pessoa {
    private String profissao;

    public Cliente(String profissao, String nome, String cpf) {
        super(nome,cpf);
        this.profissao = profissao;
    }

    public String getProfissao() { 
        return profissao; 
    }

    public void setProfissao(String profissao) { 
        this.profissao = profissao;
    }

    @Override
    public String apresentacao() {
        return
        "\nnome: "+ this.getNome() + 
        "\nCPF: " + this.getCpf() + 
        "\nprofissao: " + this.getProfissao();
    }

}
