package atividades_aula.aula1.aula3.ex1;

public class Livro {
    String titulo;
    String autor;

    public Livro(){
        this.titulo = "";
        this.autor = "";
    }

    public Livro(String titulo1, String autor1){
        this.titulo = titulo1;
        this.autor = autor1;
    }

    public void exibir() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("--------------------");
    }
}
