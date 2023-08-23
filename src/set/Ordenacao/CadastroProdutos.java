package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> produtos;

    public CadastroProdutos() {
        this.produtos = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String produto, double preco, int quantidade)
    {
        produtos.add(new Produto(codigo, produto, preco, quantidade));
    }

    public Set<Produto> listarPorNome()
    {
        return new TreeSet<>(produtos);
    }

    public Set<Produto> exibirPorPreco()
    {
        Set<Produto> lista = new TreeSet<>(new ComparadorProduto());

        lista.addAll(produtos);

        return lista;
    }
}
