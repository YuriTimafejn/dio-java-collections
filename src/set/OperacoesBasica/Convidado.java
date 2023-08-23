package set.OperacoesBasica;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    @Override
    public String toString() {
        return "\tConvidado {\n" +
                "\tnome='" + nome + '\'' +
                ", Convite: " + codigoConvite +
                "}\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite() && Objects.equals(getNome(), convidado.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getCodigoConvite());
    }
}
