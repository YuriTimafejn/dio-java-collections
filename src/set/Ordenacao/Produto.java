package set.Ordenacao;

import java.util.Objects;

public class Produto implements Comparable<Produto>{
    private long codigo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Produto produto)) return false;
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public String toString() {
        return "Produto { \n" +
                "\tcodigo=" + codigo +
                ", produto='" + produto + '\'' +
                "}\n";
    }

    public long getCodigo() {
        return codigo;
    }

    public String getProduto() {
        return produto;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Produto(long codigo, String produto, double preco, int quantidade) {
        this.codigo = codigo;
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    private String produto;
    private double preco;
    private int quantidade;

    @Override
    public int compareTo(Produto p) {
        return produto.compareToIgnoreCase(p.getProduto());
    }
}
