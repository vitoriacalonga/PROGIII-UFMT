package atividades_aula.aula1.aula6.ex2;

import java.util.HashSet;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> palavras = new HashSet<>();
        String palavra;

        System.out.println("Digite uma palavra:");
        palavra = scanner.next();
        while(!(palavra.equals("fim"))){
            palavra = palavra.toLowerCase();//para nao causar erros para identificar java e fim
            palavras.add(palavra);
            System.out.println("Digite uma nova palavra:");
            palavra = scanner.next();
        }
        scanner.close();

        System.out.printf("\nTodas as palavras digitadas:\n");
        for(String elemento: palavras){
            System.out.println(elemento);
        }

        System.out.println("Contem java: " + (palavras.contains("java") ? "Sim" : "Nao"));
    }
}
