package src.model;

import Interfaces.IProdServ;
import src.Enum.StatusCarro;

public class Servico implements IProdServ {
    private String nome;
    private String descricao;
    private double preco;

    public Servico(String nome, String descricao, double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
    public double getPreco() { return preco; }


    @Override
    public void imprimeProdServ() {
        System.out.println("Serviço:\tNome: " + nome + "\tDescricao: " + descricao + "\tPreço: R$" + preco);
    }


    // @Override
    // public void RecebeCarro(Carro carro) {
    //     if (Carro.VerificaSeCarroEClassico(carro.getAno()))
    //     {
    //         carro.setStatus(StatusCarro.RECEBIDO);
    //         System.out.println("O carro com a placa " + carro.getPlaca() + " está na oficina.");
    //     }
    // }

    // @Override
    // public void ConsertaCarro(Carro carro){
    //     if (Carro.VerificaSeCarroEClassico(carro.getAno()))
    //     {
    //         carro.setStatus(StatusCarro.EM_RESTAURACAO);
    //         System.out.println("O carro com a placa " + carro.getPlaca() + " está consertando.");
    //     }
    // }

    // @Override
    // public void DevolveCarro(Carro carro){
    //     if (Carro.VerificaSeCarroEClassico(carro.getAno()))
    //     {
    //         carro.setStatus(StatusCarro.PRONTO);
    //         System.out.println("O carro com a placa " + carro.getPlaca() + " foi devolvido para o cliente.");
    //     }
    // }
}
