import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livros;

    // Construtor para inicializar a lista de livros
    public CatalogoLivros() {
        this.livros = new ArrayList<>();
    }

    // Método para adicionar um livro ao catálogo
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro(titulo, autor, anoPublicacao);
        livros.add(livro);
        System.out.println("Livro adicionado: " + titulo);
    }

    // Método para pesquisar livros por autor
    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    // Método para pesquisar livros por intervalo de anos
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosEncontrados = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                livrosEncontrados.add(livro);
            }
        }
        return livrosEncontrados;
    }

    // Método para pesquisar livros por título
    public Livro pesquisarPorTitulo(String titulo) {
        for (Livro livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null; // Retorna null se nenhum livro for encontrado
    }

    // Método main para testar a funcionalidade
    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();

        // Adicionar livros ao catálogo
        catalogo.adicionarLivro("Livro1", "autor1", 2020);
        catalogo.adicionarLivro("Livro2", "autor2", 2021);
        catalogo.adicionarLivro("Livro3", "autor2", 2022);
        catalogo.adicionarLivro("Livro2", "autor3", 2023);
        catalogo.adicionarLivro("Livro3", "autor4", 1994);



        // Pesquisar livros por autor
        List<Livro> livrosPorAutor = catalogo.pesquisarPorAutor("George Orwell");
        System.out.println("Livros encontrados pelo autor 'George Orwell':");
        for (Livro livro : livrosPorAutor) {
            System.out.println(livro.getTitulo());
        }

        // Pesquisar livros por intervalo de anos
        List<Livro> livrosPorIntervaloAnos = catalogo.pesquisarPorIntervaloAnos(2020, 2023);
        System.out.println("Livros encontrados entre  e 2023:");
        for (Livro livro : livrosPorIntervaloAnos) {
            System.out.println(livro.getTitulo());
        }

        // Pesquisar livro por título
        Livro livroPorTitulo = catalogo.pesquisarPorTitulo("2020");
        if (livroPorTitulo != null) {
            System.out.println("Livro encontrado pelo título '2020': " + livroPorTitulo.getTitulo());
        } else {
            System.out.println("Livro '2020' não encontrado.");
        }
    }
}
