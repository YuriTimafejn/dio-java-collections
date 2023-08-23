package set.OperacoesBasica;

public class App {
    public static void main(String[] args) {
        ListaConvidados lista = new ListaConvidados();

        lista.adicionarConvidado("Convidado 1", 1234);
        lista.adicionarConvidado("Convidado 2", 1235);
        lista.adicionarConvidado("Convidado 3", 1236);
        lista.adicionarConvidado("Convidado 4", 1237);
        lista.adicionarConvidado("Convidado 5", 1238);
        lista.adicionarConvidado("Convidado 6", 1239);

        System.out.println("Lista Completa");
        System.out.println("QUANTIDADE CONVIDADOS: " + lista.QuantidadeConvidadosLista());
        lista.mostrarLista();
        System.out.println("=================================");

        lista.removerConvidadoPorConvite(1236);
        System.out.println("Lista Completa");
        System.out.println("QUANTIDADE CONVIDADOS: " + lista.QuantidadeConvidadosLista());
        lista.mostrarLista();
        System.out.println("=================================");
    }
}
