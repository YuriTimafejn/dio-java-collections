package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> listaTarefa;

    public ListaTarefa() {
        this.listaTarefa = new ArrayList<>();
    }

    public void addTarefa(String novaTarefa)
    {
        listaTarefa.add(new Tarefa(novaTarefa));
    }

    public void removeTarefa(String tarefaExcluir)
    {
        List<Tarefa> tarefasParaExcluir = new ArrayList<>();

        for (Tarefa t :
                listaTarefa) {
            if(t.getDescricao().equalsIgnoreCase(tarefaExcluir))
            {
                tarefasParaExcluir.add(t);
            }
        }

        listaTarefa.removeAll(tarefasParaExcluir);
    }

    public int totalTarefasLista()
    {
        return listaTarefa.size();
    }

    public void obterDescricoesTarefas()
    {
        System.out.println(listaTarefa);
    }
}
