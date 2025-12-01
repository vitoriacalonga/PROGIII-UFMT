package atividades_aula.aula1.aula7.ex1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) throws IOException { 

        Scanner scanner = new Scanner(System.in);
        String nomearq;

        System.out.println("Informe o nome do arquivo (sem a extensão .txt):");
        nomearq = scanner.nextLine();

        scanner.close();

        try (FileInputStream is = new FileInputStream(nomearq + ".txt");
             InputStreamReader isr = new InputStreamReader(is);
             BufferedReader br = new BufferedReader(isr)) { 

            String s = br.readLine();
            while (s != null) {
                System.out.println(s);
                s = br.readLine();
            }
            br.close();
            
        }

        catch(IOException ioexception){
            System.err.println("Erro: " + ioexception);
        }

        
    }

    
}