package trabalho1;

public abstract class ItemBiblioteca{
    protected String titulo;
    protected int id; 
    protected boolean dispo = true;

    public ItemBiblioteca(String titulo, int id) {
        this.titulo = titulo;
        this.id = id;
    }

    public abstract void emprestar();
    public abstract void devolver();
    public abstract void multar();

    public String getTitulo(){
        return titulo;
    }

    public boolean getDispo(){
        return dispo;
    }
}
