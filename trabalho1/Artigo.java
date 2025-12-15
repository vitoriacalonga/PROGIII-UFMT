package trabalho1;

public class Artigo extends ItemBiblioteca{
    private String autor;
    private String instituicao;

    public Artigo(String titulo, String autor, String instituicao, int id) {
        super(titulo, id);
        this.autor = autor;
        this.instituicao = instituicao;
    }
    @Override
    public void emprestar(){
        if(this.dispo == false){
            System.out.println("ERRO: O Artigo " + titulo + " esta indisponivel no momento!");
            return;
        }

        this.dispo = false;
        System.out.println("\n\tCopia do artigo gerada\nTitulo:" + titulo + "\nautor: " + autor + "\nInstituicao" + instituicao + "\nID interno: " + id);
    }

    
    @Override
    public void devolver(){
        this.dispo = true;
        System.out.println("Feedback do artigo recebido.");
    }

    
    @Override
    public void multar(){
        System.out.println("Nao ha multas aplicadas a Artigos Academicos.");
    }
}
