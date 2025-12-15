package trabalho1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<ItemBiblioteca> biblioteca = new ArrayList<>();

        //base de dados ficticia 
        biblioteca.add(new Livro("Engenharia de Software", "Ian Sommerville", "978-85-123", 1234));
        biblioteca.add(new Livro("Clean Code", "Robert C. Martin", "978-01-323", 2123));
        biblioteca.add(new Revista("National Geographic", "Disney", "0027-9358", 3123));
        biblioteca.add(new MidiaDigital("Curso de Java", "MP4", 4123));
        biblioteca.add(new Jornal("Folha de S.Paulo", "14/12/2025", 5123));
        biblioteca.add(new Artigo("Análise do comportamento social das estudantes do curso técnico em informática utilizando redes complexas", "Vitoria Calonga", "IFMT",6123));

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        System.out.println("\n\tSISTEMA DA BIBLIOTECA\n");

        while(flag){
            System.out.println("\n\t---LISTA DE LIVROS DA BIBLIOTECA---\n");

            for(int i = 0; i < biblioteca.size(); i++){
                ItemBiblioteca aux = biblioteca.get(i);

                //verifica disponibilidade
                String status = aux.getDispo() ? "[DISPONÍVEL]" : "[INDISPONIVEL]";

                System.out.println("Numero item: [" + i + "] " + status + " " + aux.getTitulo());
            }

            System.out.println("\n\nInforme o numero do item que deseja interagir ou -1 para SAIR\n");

            int item = scanner.nextInt();

            if (item == -1){
                System.out.println("Saindo do sistema...");
                flag = false;
                break;
            }

            if (item >= 0 && item < biblioteca.size()) {
            ItemBiblioteca itemSelecionado = biblioteca.get(item);

            System.out.println("\nVocê selecionou: " + itemSelecionado.getTitulo());
            System.out.println("\n\tEscolha:\n1 - Emprestar");
            System.out.println("2 - Devolver");
            System.out.println("3 - Multar");
            System.out.print("4 - Sair");
            
            int acao = scanner.nextInt();

            switch(acao){
                case 1:
                    itemSelecionado.emprestar();
                    break;
                case 2:
                    itemSelecionado.devolver();
                    break;
                case 3:
                    itemSelecionado.multar();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        else{
            System.out.println("[ERRO]: Item não encontrado! Tente novamente.");
        }
        }
        scanner.close();
    }
}
