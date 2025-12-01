package atividades_aula.aula1.aula7.ex2;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.nextLine();

        PrintStream ps = new PrintStream("saida.txt");

        while(!(palavra.equals("FIM"))){
            ps.println(palavra); 
            palavra = scanner.nextLine();
        }
        
        scanner.close();
        ps.close();
        
    }

}
