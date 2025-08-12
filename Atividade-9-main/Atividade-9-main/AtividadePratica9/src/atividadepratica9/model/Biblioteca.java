package atividadepratica9.model;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    
    private List<Livro>livros;

    public Biblioteca() {
       livros = new ArrayList();
    }

   public void adicionarLivro(Livro livro){
       livros.add(livro);
      System.out.println("Livro '" + 
              livro.getNome()+"'adicionado a biblioteca");
   }
    public void removerLivro(Livro livro){
     if(livros.remove(livro)){
         System.out.println("Livro '" + 
              livro.getNome()+"'removido da biblioteca");
     }
     else {
         System.out.println("Livro não encontrado");
     }
    }
    
    public void exibirLivros(){
        if(livros.isEmpty()){
             System.out.println("A biblioteca está vazia");
    }
        else{
            StringBuilder sb = new StringBuilder();
             System.out.println("Livros na biblioteca:");
            for (Livro livro : livros) {
                sb.append(livro);
                sb.append("\n");
            }
            System.out.println(sb);
        }
    
    
    
    }
    
}
