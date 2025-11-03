package atividades_aula.aula1.aula3.ex3;

public class Pessoa{
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //getters
    public String getNome(){ return this.nome; }
    public int getIdade(){ return this.idade; }

    //setters
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        if(idade > 0){
            this.idade = idade;
        }
    }

    public void exibir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
    }

    
}