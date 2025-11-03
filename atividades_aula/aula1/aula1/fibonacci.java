//Programa que imprime os 30 primeiros elementos da sequência de Fibonacci

package atividades_aula.aula1.aula1;

public class fibonacci {
    public static void main(String[] args) {
        int n = 30;
        long s1 = 1;
        long s2 = 1;
        
        System.out.println("Os 30 primeiros elementos da sequencia de Fibonacci: ");
        for(int i = 1 ; i <=n; i++){
            if(i == 1 || i == 2){
                System.out.print("1");
            }
            else{
                long proximo = s1 + s2;
                System.out.print(proximo);
                s1 = s2;
                s2 = proximo;
            }
            if(i < n){
                System.out.print(", ");
            }
        }
    }
}
