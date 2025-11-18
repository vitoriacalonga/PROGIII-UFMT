package atividades_aula.aula1.aula5.ex3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Converte{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String entrada = "";
        
        try {
            System.out.print("Digite um numero inteiro: ");
            entrada = scanner.nextLine();

            int numeroConvertido = Integer.parseInt(entrada);

            System.out.printf("O numero convertido eh: %d%n", numeroConvertido);

        } catch (NumberFormatException e) {
            System.err.printf("%nErro: A entrada '%s' não eh um numero valido.%n", entrada);
            System.out.println("Detalhes do erro: " + e.getMessage());

        } finally {
            // Passo 4: O bloco finally executa SEMPRE, dando erro ou não
            System.out.println("\n Bloco Finally: Encerrando o programa...");
            scanner.close();
        }
    }
}