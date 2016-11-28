package src;

import classes.Editora;

public class Livro {

    private String titulo;
    private String autor;
    private Editora editora;
    private String ilustrador;
    private int numPaginas;
    private String localizacao;
    private String numLivro;
    private String isbn;

    public Livro(String titulo, String autor, Editora editora, String ilustrador,
            int numPaginas, String localizacao, String numLivro,
            String isbn) {
        this.titulo      = titulo;
        this.autor       = autor;
        this.editora     = editora;
        this.ilustrador  = ilustrador;
        this.numPaginas  = numPaginas;
        this.localizacao = localizacao;
        this.numLivro    = numLivro;
        this.isbn        = isbn;
    }
    
    public Livro(){}

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

    public Editora getEditor() {
        return editora;
    }

    public void setEditor(Editora editora) {
        this.editora = editora;
    }

    public String getIlustrador() {
        return ilustrador;
    }

    public void setIlustrador(String ilustrador) {
        this.ilustrador = ilustrador;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getNumLivro() {
        return numLivro;
    }

    public void setNumLivro(String numLivro) {
        this.numLivro = numLivro;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

}
