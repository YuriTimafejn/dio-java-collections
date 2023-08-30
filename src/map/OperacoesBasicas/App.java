package map.OperacoesBasicas;

public class App {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Teste 1", 1230);
        agenda.adicionarContato("Teste 2", 1231);
        agenda.adicionarContato("Teste 3", 1232);
        agenda.adicionarContato("Teste 4", 1233);
        agenda.adicionarContato("Teste 5", 1234);
        agenda.adicionarContato("Teste 6", 1235);

        System.out.println("=================================");
        agenda.exibirContatos();
        System.out.println("=================================");
        System.out.println("=================================");
        agenda.removerContato("Teste 4");
        agenda.exibirContatos();
        System.out.println("=================================");
        System.out.println("=================================");
        System.out.println(agenda.pesquisaTelefone("Teste 5"));
        System.out.println("=================================");
    }
}
