package atividades_aula.aula1.aula3.ex3;

public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(String nome1, int idade1, String matricula1){
        //chama o construtor da classe pai
        super(nome1, idade1); 
        this.matricula = matricula1;
    }

    //getter
    public String getMatricula(){ return this.matricula; }

    //setter
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    @Override 
    public void exibir() {
        super.exibir();
        System.out.println("Matricula: " + this.getMatricula());
    }
}
