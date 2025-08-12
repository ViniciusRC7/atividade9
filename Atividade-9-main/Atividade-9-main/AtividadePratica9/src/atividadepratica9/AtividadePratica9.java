package atividadepratica9;

import atividadepratica9.model.*;

public class AtividadePratica9 { 
    public static void main(String[] args) {
           // Criando livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
        Livro livro2 = new Livro("1984", "George Orwell");
        Livro livro3 = new Livro("A Origem das Espécies", "Charles Darwin");

        // Criando biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros à biblioteca
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        // Exibindo livros
        biblioteca.exibirLivros();

        // Removendo um livro
        biblioteca.removerLivro(livro2);

        // Exibindo livros após remoção
        biblioteca.exibirLivros();
    }
    }
    

