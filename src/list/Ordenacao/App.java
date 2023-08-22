package list.Ordenacao;

public class App {
    public static void main(String[] args) {
        OrdenacaoPessoa fila = new OrdenacaoPessoa();

        fila.adicionarPessoa("Pessoa 1", 23, 1.65);
        fila.adicionarPessoa("Pessoa 2", 19, 1.85);
        fila.adicionarPessoa("Pessoa 3", 24, 1.75);
        fila.adicionarPessoa("Pessoa 4", 27, 1.55);
        fila.adicionarPessoa("Pessoa 5", 34, 1.70);
        fila.adicionarPessoa("Pessoa 6", 23, 1.80);

        System.out.println("ORDENANDO POR IDADE ASC");
        System.out.println(fila.ordenaPorIdade());
        System.out.println("====================");
        System.out.println("ORDENANDO POR ALTURA ASC");
        System.out.println(fila.ordenarPorAltura());
        System.out.println("====================");
    }
}
