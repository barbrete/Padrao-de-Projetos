package src.model;

import Interfaces.IProdServ;

public class Produto implements IProdServ {
    private String nome;
    private String marca;
    private String categoria;
    private double preco;

    public Produto(String nome, String marca, String categoria, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.marca = marca;
    }

    public String getNome() { return nome; }
    public String getMarca() { return marca; }
    public String getCategoria() { return categoria; }
    public double getPreco() { return preco; }

    public void setNome(String nome) { this.nome = nome; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public void setPreco(double preco) { this.preco = preco; }

    @Override
    public void imprimeProdServ() {
        System.out.println("Produto:\tNome: " + nome + "\tPreço: R$" + preco);
    }
}
