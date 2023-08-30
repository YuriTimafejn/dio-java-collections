package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {
    private Map<Long, Produto> estoque;

    public EstoqueProduto() {
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(Long codigo, String nome, double preco, int quantidade)
    {
        estoque.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos()
    {
        System.out.println(estoque);
    }

    public double valorEstoque()
    {
        double valorTotal = 0d;
        if(!estoque.isEmpty())
        {
            for (Produto p :
                    estoque.values()) {
                valorTotal += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotal;
    }

    public Produto produtoMaisCaro()
    {
        Produto produto = null;
        double menorValor = Double.MIN_VALUE;
        if(!estoque.isEmpty())
        {
            for (Produto p :
                    estoque.values()) {
                if (p.getPreco() > menorValor)
                {
                    produto = p;
                    menorValor = p.getPreco();
                }
            }
        }
        return produto;
    }
}
