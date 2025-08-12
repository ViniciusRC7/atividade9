package atividadepratica9.model;

import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;

public class Universidade {
     
    private String nome;
    private List<Professor>professores;

    public Universidade(String nome, List<Professor> professores) {
        this.nome = nome;
        this.professores = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

   public void adicionarProfessor(Professor professor){
       if(!professores.contains(professor))
       {
           professores.add(professor);
           System.out.println(professor.getNome() +
                   " foi adicionado à universidade " + nome);
       }   
       else{
              System.out.println(professor.getNome() +
                   "já está na universidade");
    
       }
    public void removerProfessor(Professor professor) {
        if (professores.contains(professor)) {
            professores.remove(professor);
            System.out.println(professor.getNome() + " foi removido da universidade " + nome);
        } else {
            System.out.println(professor.getNome() + " não está na universidade.");
        }
    }
}
