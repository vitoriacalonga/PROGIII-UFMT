package trabalho1;

public class MidiaDigital extends ItemBiblioteca{
    private String formato;
    
    public MidiaDigital(String titulo, String formato, int id) {
        super(titulo, id);
        this.formato = formato;
    }

    @Override
    public void emprestar(){
        if(this.dispo == false){
            System.out.println("ERRO: Todas as licenças do " + titulo + " estao em uso!");
            return;
        }

        this.dispo = false;
        System.out.println("\n\tDisponibilização temporaria de Midia Digital\nTitulo:" + titulo + "\nFormato: " + formato + "\nID interno: " + id);
    }

    @Override
    public void devolver(){
        this.dispo = true;
        System.out.println("\n\tAcesso expirado\nTitulo:" + titulo + "\nFormato: " + formato + "\nID interno: " + id);
    }
    
    @Override
    public void multar(){
        System.out.println("Multa aplicada devido a uso indevido do conteudo online.");
    }

    public void download(){
        System.out.println("\n\tBaixando Midia Digital...\nTitulo"+ titulo);
    }
}
