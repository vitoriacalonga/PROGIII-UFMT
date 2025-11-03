package atividades_aula.aula1.aula3.ex2;

public class Aluno extends Pessoa{
    String matricula;

    public Aluno(String nome1, int idade1, String matricula1){
        //chama o construtor da classe pai
        super(nome1, idade1); 
        this.matricula = matricula1;
    }

    @Override 
    public void exibir() {
        super.exibir();
        System.out.println("Matricula: " + this.matricula);
    }
}
