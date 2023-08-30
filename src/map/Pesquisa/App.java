package map.Pesquisa;

public class App {
    public static void main(String[] args) {
        EstoqueProduto estoque = new EstoqueProduto();

        estoque.adicionarProduto(0001l, "Produto 5", 10.20, 2);
        estoque.adicionarProduto(0002l, "Produto 4", 100.50, 1);
        estoque.adicionarProduto(0003l, "Produto 3", 12.75, 5);
        estoque.adicionarProduto(0004l, "Produto 2", 13.45, 6);
        estoque.adicionarProduto(0005l, "Produto 1", 15.0, 10);

        estoque.exibirProdutos();

        System.out.println("====================================");
        System.out.println("Produto mais caro");
        System.out.println(estoque.produtoMaisCaro());
        System.out.println("====================================");
        System.out.println("Valor total estoque");
        System.out.println(estoque.valorEstoque());
        System.out.println("====================================");
    }
}
