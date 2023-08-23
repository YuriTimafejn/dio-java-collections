package set.OperacoesBasica;

import java.util.HashSet;
import java.util.Set;

public class ListaConvidados {
    private Set<Convidado> listaConvidados;

    public ListaConvidados() {
        this.listaConvidados = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int convite)
    {
        listaConvidados.add(new Convidado(nome, convite));
    }

    public void removerConvidadoPorConvite(int convite)
    {
        Convidado convidadoParaRemover = null;

        for (Convidado c :
                listaConvidados) {
            if (c.getCodigoConvite() == convite)
            {
                convidadoParaRemover = c;
                break;
            }
        }
        if(convidadoParaRemover != null)
            listaConvidados.remove(convidadoParaRemover);
    }

    public int QuantidadeConvidadosLista()
    {
        return listaConvidados.size();
    }

    public void mostrarLista()
    {
        System.out.println(listaConvidados);
    }
}
