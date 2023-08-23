package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Contato 1", 12345670);
        agenda.adicionarContato("Contato 2", 12345671);
        agenda.adicionarContato("Contato 3", 12345672);
        agenda.adicionarContato("Contato 4", 12345673);
        agenda.adicionarContato("Contato 5", 12345674);
        agenda.adicionarContato("Teste 6", 12345675);
        agenda.adicionarContato("Teste 7", 12345676);
        agenda.adicionarContato("Contato 8", 12345677);
        agenda.adicionarContato("Contato 8", 12345678);

        System.out.println("========================================");
        System.out.println("Quantidade de contatos: " + agenda.quantidadeDeContatos());
        agenda.mostrarAgenda();
        System.out.println("========================================");


        System.out.println("========================================");
        System.out.println(" Procurando por 'Teste'");
        Set<Contato> procura = agenda.procurarContato("Teste");
        System.out.println(procura);
        System.out.println("========================================");


    }
}
