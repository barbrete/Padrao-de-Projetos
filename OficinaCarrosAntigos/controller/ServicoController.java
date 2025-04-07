package controller;

import Service.ServicoService;
import src.model.Servico;

import java.util.List;

public class ServicoController {

    private ServicoService servicoService;

    public ServicoController() {
        this.servicoService = new ServicoService();
    }

    public void criarServico(String nome, String descricao, double preco) {
        Servico novoServico = new Servico(nome, descricao, preco);
        servicoService.adicionarServico(novoServico);
    }

    public List<Servico> obterServicos() {
        return servicoService.listarServicos();
    }

    public void exibirServicos() {
        List<Servico> servicos = servicoService.listarServicos();
        if (servicos.isEmpty()) {
            System.out.println("Nenhum serviço cadastrado.");
        } else {
            for (Servico servico : servicos) {
                servico.imprimeProdServ(); // Usa o método da interface IProdServ
            }
        }
    }
}
