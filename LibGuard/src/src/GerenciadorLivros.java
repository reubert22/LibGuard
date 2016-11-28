package src;

import java.util.ArrayList;
import classes.Editora;

public class GerenciadorLivros {

    private ArrayList<Livro> listLivros;
    private ArrayList<Editora> listEditora;

    public GerenciadorLivros() {
        listLivros  = new ArrayList<>();
        listEditora = new ArrayList<>();
    }

    public ArrayList<Livro> getListLivros() {
        return listLivros;
    }

    public void setListLivros(ArrayList<Livro> listLivros) {
        this.listLivros = listLivros;
    }

    public ArrayList<Editora> getListEditora() {
        return listEditora;
    }

    public void setListEditora(ArrayList<Editora> listEditora) {
        this.listEditora = listEditora;
    }
    
    public void addLivro(Livro livro){
        listLivros.add(livro);
    }
    
    public void rmvLivro(Livro livro){
        listLivros.remove(livro);
    }

}
