package Interfaces;

//interface feita para incrementar tanto produtos da própria oficina (estoque), como peças de carros,
//quanto para serviços prestados pela oficina

public interface IProdServ {
    String getNome();
    double getPreco();
    void imprimeProdServ();
}
