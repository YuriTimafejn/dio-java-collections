package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    List<Pessoa> filaPessoas;

    public OrdenacaoPessoa() {
        this.filaPessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura)
    {
        filaPessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenaPorIdade()
    {
        List<Pessoa> ordenadoPorIdade = new ArrayList<>(filaPessoas);
        Collections.sort(ordenadoPorIdade);
        return ordenadoPorIdade;
    }

    public List<Pessoa> ordenarPorAltura()
    {
        List<Pessoa> ordenadoPorAltura = new ArrayList<>(filaPessoas);
        Collections.sort(ordenadoPorAltura, new ComparadorAltura());
        return ordenadoPorAltura;
    }
}
