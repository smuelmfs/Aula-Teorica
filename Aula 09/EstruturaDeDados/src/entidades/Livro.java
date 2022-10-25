package entidades;

public class Livro {
    private String titulo;
    private String autor;

    //Construtor
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Livro() {
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString(){
        return "entidades.Livro{" +
                "Titulo='" + titulo +'\'' +
                ", Autor='" + autor + '\'' +
                '}';
    }
}
