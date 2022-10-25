package entidades;

public class Biblioteca {
    private Livro[] livros;
    public Biblioteca(int quantidadeLivros){
        livros = new Livro[quantidadeLivros];
    }
    public Livro[] getLivros(){
        return  livros;
    }
    public int getQuantidade(){
        return livros.length;
    }
    public void AdicionarLivro(Livro livro) {
        for (int i =0; i < livros.length; i++){
            if (livros[i] == null){
                livros[i] = livro;
            }
        }
    }
}