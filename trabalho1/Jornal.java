package trabalho1;

public class Jornal extends ItemBiblioteca{
    private String data_publicacao; // Ex: "14/12/2025"

    public Jornal(String titulo, String data_publicacao, int id) {
        super(titulo, id);
        this.data_publicacao = data_publicacao;
    }

    @Override
    public void emprestar(){
        if(this.dispo == false){
            System.out.println("ERRO: O jornal " + titulo + " já está emprestado!");
            return;
        }

        this.dispo = false;
        System.out.println("\n\tJornal emprestado para leitura no local\nTitulo:" + titulo + "\nData Publicacao: " + data_publicacao + "\nID interno: " + id);
    }

    
    @Override
    public void devolver(){
        if(this.dispo == true){
            System.out.println("ERRO: O jornal " + titulo + " já foi devolvido!");
            return;
        }

        this.dispo = true;
       System.out.println("\n\tJornal devolvido\nTitulo:" + titulo + "\nData Publicacao: " + data_publicacao + "\nID interno: " + id);
    }

    
    @Override
    public void multar(){
        System.out.println("\n\tMulta aplicada devido a rasura\nTitulo:" + titulo + "\nData Publicacao: " + data_publicacao + "\nID interno: " + id);
    }
}
