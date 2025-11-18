package atividades_aula.aula1.aula5.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Raiz {
    public static double calculaRaiz(int num)  throws IllegalArgumentException{
        if(num < 0){
            throw new IllegalArgumentException("Valor invalido");
        }else{
            return Math.sqrt(num);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean flag = true;

        do{
            try{//lê o nuemro e calcula raiz
                System.out.println("Digite um numero: ");
                int numero = scanner.nextInt();

                double resultado = calculaRaiz(numero);
                System.out.printf("\nResult: sqrt(%d) = %f\n", numero, resultado);
                flag = false; // entrada bem-sucedida fim do 1oop

            }
            catch(InputMismatchException inputMismatchException){
                System.err.printf("\nException: %s\n", inputMismatchException);
                scanner.nextLine(); // descarta entrada para o usuário tentar de novo
                System.out.print("Voce deve digitar um numero inteiro. Por favor, tente novamente.%n%n");

            }
            catch(IllegalArgumentException illegalArgumentException){
                System.err.printf("\nException: %s\n", illegalArgumentException);
                scanner.nextLine(); // descarta entrada para o usuário tentar de novo
                System.out.print("Voce deve digitar um numero positivo. Por favor, tente novamente.%n%n");

            }

        }while(flag);

        scanner.close();
    }
}
