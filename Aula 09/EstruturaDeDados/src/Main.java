import entidades.Biblioteca;
import entidades.Livro;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
    Livro livro;
    Biblioteca biblioteca;
    Scanner input = new Scanner(System.in);

    biblioteca = new Biblioteca(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de livros")));
    JOptionPane.showMessageDialog(null,"Quantidade de livros suportados na biblioteca" + biblioteca.getQuantidade());

    livro = new Livro("A", "B");

    biblioteca.AdicionarLivro(livro);

    System.out.println(livro);








    }
}
