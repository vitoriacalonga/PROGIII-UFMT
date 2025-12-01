package atividades_aula.aula1.aula7.ex3;

import java.io.File;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o caminho:");
        String caminho = scanner.next();
        
        scanner.close();

        File arquivo = new File(caminho);
        if(arquivo.exists()){
            System.out.println("Existe algo neste caminho, ");
            if(arquivo.isDirectory()){
                System.out.println("eh um diretorio");
            }
            else{
                System.out.println("eh um arquivo");
            }
        }
        else{
            System.out.println("Este caminho nao existe");
        }
    }
}
