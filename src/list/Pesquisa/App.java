package list.Pesquisa;

public class App {
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        catalogo.adicionarCatalogo("Titulo 1", "Autor 1", 2020);
        catalogo.adicionarCatalogo("Titulo 2", "Autor 1", 2021);
        catalogo.adicionarCatalogo("Titulo 3", "Autor 2", 2023);
        catalogo.adicionarCatalogo("Titulo 4", "Autor 3", 2018);
        catalogo.adicionarCatalogo("Titulo 5", "Autor 3", 2020);
        catalogo.adicionarCatalogo("Titulo 1", "Autor 1", 2021);
        catalogo.adicionarCatalogo("Titulo 6", "Autor 4", 2022);
        catalogo.adicionarCatalogo("Titulo 7", "Autor 2", 2022);
        catalogo.adicionarCatalogo("Titulo 8", "Autor 4", 2019);
        catalogo.adicionarCatalogo("Titulo 9", "Autor 5", 1992);

        System.out.println(catalogo.pesquisarAutor("Autor 1"));
        System.out.println(catalogo.pesquisarAutor("Autor 6"));

        System.out.println(catalogo.pesquisarPorTitulo("Titulo 1"));
        //System.out.println(catalogo.pesquisarPorTitulo("Titulo 10")); //Erro

        System.out.println(catalogo.pesquisarPorIntervalo(2018, 2020)); // 4
        System.out.println(catalogo.pesquisarPorIntervalo(1990, 2020)); // 5
        System.out.println(catalogo.pesquisarPorIntervalo(2024, 2025)); // 0
    }
}
