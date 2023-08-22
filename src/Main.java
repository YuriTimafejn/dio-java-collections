import list.OperacoesBasicas.ListaTarefa;

public class Main {
    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println(listaTarefa.totalTarefasLista()); // 0

        listaTarefa.addTarefa("Tarefa 01");
        listaTarefa.addTarefa("Tarefa 02");
        listaTarefa.addTarefa("Tarefa excluir");
        listaTarefa.addTarefa("Tarefa excluir");
        listaTarefa.addTarefa("Tarefe TESTE");
        System.out.println(listaTarefa.totalTarefasLista());

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removeTarefa("Tarefa excluir");
        listaTarefa.obterDescricoesTarefas();
    }
}