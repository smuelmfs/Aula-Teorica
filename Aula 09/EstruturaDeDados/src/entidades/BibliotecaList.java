package entidades;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaList {
    private List<Livro> livros;
    public BibliotecaList(List<Livro> livros) {
        this.livros = livros;
    }
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    public void removerLivro(int Indice){
        livros.remove(Indice);
    }
    public List<Livro> livros(){
        return livros;
    }
}
