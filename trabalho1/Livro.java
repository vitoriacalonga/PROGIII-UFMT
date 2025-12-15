package trabalho1;

public class Livro extends ItemBiblioteca{
    private String autor;
    private String isbn; 

    public Livro(String titulo, String autor, String isbn, int id) {
        super(titulo, id); 
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public void emprestar(){
        if(this.dispo == false){
            System.out.println("ERRO: O livro " + titulo + " já está emprestado!");
            return;
        }

        this.dispo = false;
        System.out.println("\n\tEmprestimo Realizado por 7 dias\nTitulo do livro:" + titulo + "\nAutor: " + autor + "\nISBN: " + isbn + "\nID interno: " + id);
    }

    
    @Override
    public void devolver(){
        if(this.dispo == true){
            System.out.println("ERRO: O livro " + titulo + " já foi devolvido!");
            return;
        }

        this.dispo = true;
        System.out.println("\n\tLivro Devolvido\nTitulo do livro:" + titulo + "\nAutor: " + autor + "\nISBN: " + isbn + "\nID interno: " + id);
    }

    
    @Override
    public void multar(){
        System.out.println("\n\tMulta aplicada devido o atraso do livro\nTitulo do livro:" + titulo + "\nAutor: " + autor + "\nISBN: " + isbn + "\nID interno: " + id);
    }
}
