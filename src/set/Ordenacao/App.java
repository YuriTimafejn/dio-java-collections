package set.Ordenacao;

import java.util.Set;

public class App {
    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        produtos.adicionarProduto(1230L, "Produto 1", 10.05, 10);
        produtos.adicionarProduto(1231L, "Produto 2", 10.15, 5);
        produtos.adicionarProduto(1232L, "Produto 3", 10.5, 1);
        produtos.adicionarProduto(1233L, "Produto 4", 10.25, 17);
        produtos.adicionarProduto(1234L, "Produto 5", 10.75, 22);
        produtos.adicionarProduto(1235L, "Produto 6", 10.0, 13);
        produtos.adicionarProduto(1236L, "Produto 7", 12, 19);

        Set<Produto> listagem = produtos.listarPorNome();
        System.out.println(listagem);

        System.out.println("========================");
        listagem = produtos.exibirPorPreco();
        System.out.println(listagem);

    }
}
