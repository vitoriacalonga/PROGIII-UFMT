package trabalho1;

public class Revista extends ItemBiblioteca{
    private String editora;
    private String issn;

    public Revista(String titulo, String editora, String issn, int id) {
        super(titulo, id);
        this.editora = editora;
        this.issn = issn;
    }

    @Override
    public void emprestar(){
        if(this.dispo == false){
            System.out.println("ERRO: A revista" + titulo + " já está emprestada!");
            return;
        }

        this.dispo = false;
        System.out.println("\n\tEmprestimo Realizado por 7 dias\nTitulo da revista:" + titulo + "\nEditora: " + editora + "\nISNN: " + issn + "\nID interno: " + id);
    }

    
    @Override
    public void devolver(){
        if(this.dispo == true){
            System.out.println("ERRO: A revista" + titulo + " já foi devolvida!");
            return;
        }

        this.dispo = true;
        System.out.println("\n\tRevista devolvida\nTitulo da revista:" + titulo + "\nEditora: " + editora + "\nISNN: " + issn + "\nID interno: " + id);
    }

    
    @Override
    public void multar(){
        System.out.println("\n\tMulta aplicada devido a atraso de devolução\nTitulo da revista:" + titulo + "\nEditora: " + editora + "\nISNN: " + issn + "\nID interno: " + id);
    }
}
