package atividades_aula.aula1.aula6.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Calcule {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            lista.add(scanner.nextInt());
        }
        scanner.close();
        int soma = 0;

        System.out.println("Array com todos os numeros informados: ");
        for(int num:lista){
            System.out.println(num);
            soma += num;
        } 
        double media = soma / 10;
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + media);

        lista.removeIf(num -> num %2 == 0);

        System.out.println("Array sem os numeros pares: ");
        for(int num:lista){
            System.out.println(num);
        } 

        System.out.println();
    }
    

}
