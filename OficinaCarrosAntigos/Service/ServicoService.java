package Service;
import src.model.Servico;

import java.util.ArrayList;
import java.util.List;

public class ServicoService {

    private List<Servico> listaServicos;

    public ServicoService() {
        this.listaServicos = new ArrayList<>();
    }

    public void adicionarServico(Servico servico) {
        if (servico.getNome() == null || servico.getNome().isEmpty()) {
            throw new IllegalArgumentException("O nome do serviço não pode ser vazio.");
        }

        if (servico.getPreco() <= 0) {
            throw new IllegalArgumentException("O preço do serviço deve ser maior que zero.");
        }

        listaServicos.add(servico);
    }

    public List<Servico> listarServicos() {
        return listaServicos;
    }
}
