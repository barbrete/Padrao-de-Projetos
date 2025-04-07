package src.model;

import Interfaces.IProdServ;

public class ItemOrdemServico {
    private IProdServ prodServ;
    private int quantidade;

    public ItemOrdemServico(IProdServ prodServ, int quantidade) {
        this.prodServ = prodServ;
        this.quantidade = quantidade;
    }

    public IProdServ getProdServ() {
        return prodServ;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setProdServ(IProdServ prodServ) {
        this.prodServ = prodServ;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return quantidade * prodServ.getPreco();
    }

    public void imprimeItem() {
        System.out.println("- " + prodServ.getNome() + " | Qtd: " + quantidade +
                " | Subtotal: R$" + calcularSubtotal());
    }
}
