package atividades_aula.aula1.aula5.ex1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divide {
    //demonstra o laçamento de uma exceção quando quando ocorre uma divisão por zer0
    public static int divisao(int numerador, int denominador) 
    throws ArithmeticException
    {
        return numerador/denominador;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean flag = true; //determina se mais entradas são necessário, ou seja, tem excecao

        do{
            try{//lê o numerador/denomidador e calcula divisao
                System.out.println("Digite o numerador");
                int numerador = scanner.nextInt();
                System.out.println("Digite o denominador");
                int denominador = scanner.nextInt();

                int resultado = divisao(numerador, denominador);
                System.out.printf("\nResult: %d / %d = %d\n", numerador, denominador, resultado);
                flag = false; // entrada bem-sucedida; fim do 1oop

            }
            catch(InputMismatchException inputMismatchException){
                System.err.printf("\nException: %s\n", inputMismatchException);
                scanner.nextLine(); // descarta entrada para o usuário tentar de novo
                System.out.print("Voce deve digitar numeros inteiros. Por favor, tente novamente.%n%n");

            }
            catch(ArithmeticException arithmeticException){
                System.err.printf("\nException: %s\n", arithmeticException); 
                System.out.print("Zero eh um denominador invalido. Digite um numero valido.%n%n");
            }

        }while(flag);

        scanner.close();
    }
}
