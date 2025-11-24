package atividades_aula.aula1.aula6.ex3;

import java.util.HashMap;
import java.util.Scanner;

public class Pessoa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> pessoas = new HashMap<>();
        String nome;
        int idade, qtd;

        System.out.println("Quantas pessoas deseja cadastrar:");
        qtd = scanner.nextInt();
        scanner.nextLine(); //limpa o buffer

        for(int i = 0; i < qtd;i++){
            System.out.println("Nome:");
            nome = scanner.nextLine();
            nome = nome.toLowerCase();
            System.out.println("Idade:");
            idade = scanner.nextInt();
            scanner.nextLine();
            pessoas.put(nome, idade);
        }

        

        //para encontrar idade
        System.out.println("\nDigite um nome a ser encontrado:");
        String aux = scanner.nextLine();
        aux = aux.toLowerCase();

        boolean contem = pessoas.containsKey(aux);

        if(contem){
            System.out.println("Idade: " + pessoas.get(aux));
        }else{
             System.out.println("Nome nao encontrado");
        }

        //para remover nome
        System.out.println("\nDigite um nome a ser removido:");
        aux = scanner.nextLine();
        aux = aux.toLowerCase();//evita erros
        scanner.close();

        contem = pessoas.containsKey(aux);

        if(contem){
            System.out.println("Removendo...");
            pessoas.remove(aux);
        }else{
             System.out.println("Nome nao encontrado");
        }

        System.out.println("\nAtualizando..");
        for (String chave : pessoas.keySet()) {
            System.out.println("Nome: " + chave + "\nIdade: " + pessoas.get(chave));
        }

    }
}
