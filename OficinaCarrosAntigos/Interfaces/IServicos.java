package Interfaces;

import src.model.Carro;

//CLASSE USADA NA PRIMEIRA APRESENTAÇÃO, AGORA ESTÁ SENDO
//SUBSTITUIDA POR IPRODSERV

public interface IServicos {
    public void RecebeCarro(Carro carro);

    public void ConsertaCarro(Carro carro);

    public void DevolveCarro(Carro carro);
}
