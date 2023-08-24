package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agenda;

    public AgendaContatos() {
        this.agenda = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone)
    {
        agenda.put(nome, telefone);
    }

    public void removerContato(String nome)
    {
        if (!agenda.isEmpty())
        {
            agenda.remove(nome);
        }
    }

    public void exibirContatos()
    {
        System.out.println(agenda);
    }

    public Integer pesquisaTelefone(String nome)
    {
        Integer retorno = null;
        if (!agenda.isEmpty())
        {
            retorno = agenda.get(nome);
        }

        return retorno;
    }
}
