package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agenda;

    public AgendaContatos() {
        this.agenda = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero)
    {
        agenda.add(new Contato(nome, numero));
    }

    public void mostrarAgenda()
    {
        System.out.println(agenda);
    }

    public Set<Contato> procurarContato(String nome)
    {
        Set<Contato> contatosEncontrados = new HashSet<>();

        for (Contato c :
                agenda) {
            if (c.getNome().startsWith(nome))
            {
                contatosEncontrados.add(c);
            }
        }
        return contatosEncontrados;
    }

    public int quantidadeDeContatos()
    {
        return agenda.size();
    }
}
