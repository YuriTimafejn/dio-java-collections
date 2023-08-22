package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> catalogo;

    public CatalogoLivros() {
        this.catalogo = new ArrayList<>();
    }

    public void adicionarCatalogo(String titulo, String autor, int anoPublicacao) {
        this.catalogo.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarAutor(String autor) {
        List<Livro> obras = new ArrayList<>();

        for (Livro l : catalogo) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                obras.add(l);
            }
        }
        return obras;
    }

    public List<Livro> pesquisarPorIntervalo(int dataInicial, int dataFinal) {
        List<Livro> obras = new ArrayList<>();
        for (Livro l : catalogo) {
            if (l.getAnoPublicacao() >= dataInicial && l.getAnoPublicacao() <= dataFinal) {
                obras.add(l);
            }
        }
        return obras;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPesquisado = null;
        for (Livro l : catalogo) {
            if (l.getTitulo().equalsIgnoreCase(titulo)) {
                livroPesquisado = l;
                break;
            }
        }

        if (livroPesquisado == null)
            throw new RuntimeException("Livro não encontrado");

        return livroPesquisado;
    }
}
