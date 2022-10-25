import entidades.Biblioteca;
import entidades.BibliotecaList;
import entidades.Livro;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaListDriver {
    public static void main(String[] args){
        Livro livro;
        BibliotecaList biblioteca;

        System.out.println("Sistema de Bibliotecas");
        biblioteca = new BibliotecaList(new ArrayList<>());

        biblioteca.adicionarLivro(new Livro("Java","João"));
        biblioteca.adicionarLivro(new Livro("C++","Lucas"));
        biblioteca.adicionarLivro(new Livro("Delphi","Rafael"));
        biblioteca.adicionarLivro(new Livro("C#","Douglas"));
        biblioteca.adicionarLivro(new Livro("C","Mia"));

        List<Livro> livros = biblioteca.livros();

        for(Livro li : livros){
            System.out.println(li);
        }
        System.out.println("*****************");
        biblioteca.removerLivro(3);

        for(Livro li : livros){
            System.out.println(li);
        }
        }


    }

