package Pacote;

import java.util.Scanner;

/*
 * @author aluno
 */
public class ExecutaLivro {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Livro livro1 = new Livro();
        System.out.println("Digite o nome do titulo do livro: ");
        livro1.setTitulo(ler.nextLine());
        System.out.println("Digite o Autor do livro: ");
        livro1.setAutor(ler.nextLine());
        System.out.println("Digite o editor: ");
        livro1.setEditor(ler.nextLine());
        System.out.println("Digite o ilustrador: ");
        livro1.setIlustrador(ler.nextLine());
        System.out.println("Digite o numero de paginas: ");
        livro1.setNpaginas(ler.nextInt());
        ler.nextLine();
        System.out.println("Digite o numero do livro: ");
        livro1.setNlivro(ler.nextLine());
        System.out.println("Digite a localizacao do livro: ");
        livro1.setLocalizacao(ler.nextLine());
        System.out.println("Digite o ISBN: ");
        livro1.setIsbn(ler.nextLine());
        
        
        System.out.println("Titulo do livro: " + livro1.getTitulo());
        System.out.println("Autor do livro: " + livro1.getAutor());
        System.out.println("Editor do livro: " + livro1.getEditor());
        System.out.println("Ilustrador do livro: " + livro1.getIlustrador());
        System.out.println("Número de páginas: " + livro1.getNpaginas());
        System.out.println("Número do livro: " + livro1.getNlivro());
        System.out.println("Localização: " + livro1.getLocalizacao());
        System.out.println("ISBN: " + livro1.getIsbn());
    }
}
