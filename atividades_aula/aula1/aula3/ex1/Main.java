package atividades_aula.aula1.aula3.ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        System.out.println("Livro 1:");
        livro1.exibir();

        Scanner leitor = new Scanner(System.in); 
        System.out.println("Digite o titulo do livro:");
        String titulo = leitor.nextLine(); 
        System.out.println("Digite o nome do autor do livro:");
        String autor = leitor.nextLine();
        
        leitor.close();

        Livro livro2 = new Livro(titulo,autor);
        System.out.println("Livro 2:");
        livro2.exibir();
    }
}
