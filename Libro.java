public class Libro
{
    protected String titulo;
    protected String autor;

    public Libro(String tituloLibro, String autorLibro)
    {
        titulo = tituloLibro;
        autor = autorLibro;
    }
    
    public String dimeAutor()
    {
        return autor;
    }
    public String dimeTitulo()
    {
        return titulo;
    }
}
