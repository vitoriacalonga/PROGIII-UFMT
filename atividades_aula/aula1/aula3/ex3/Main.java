package atividades_aula.aula1.aula3.ex3;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Vitoria", 20, "202411722029");
        System.out.println("Sem modificacao");
        //teste getters
        System.out.println("Nome: " + aluno1.getNome()); 
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Matricula: " + aluno1.getMatricula());

        System.out.println("modificando...");
        aluno1.setNome("Vitoria Calonga");
        aluno1.setIdade(21);
        aluno1.setMatricula("543121");
        
        System.out.println("modificado!");
        aluno1.exibir();
    }
    

}
