
public class Libro
{
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String tituloLibro, String autorLibro , int paginasLibro)
    {
        titulo = tituloLibro;
        autor = autorLibro;
        paginas = paginasLibro;
    }
    
    public String dimeAutor()
    {
        return autor;
    }
    
    public String dimeTitulo()
    {
        return titulo;
    }
    
    public int dimePaginas()
    {
        return paginas;
    }
    
    public String dimeDetalles()
    {
        String detalles;
        detalles = ("Titulo" +titulo+ "," + "Auto" +autor+ "," + "Paguinas" +paginas);
        return detalles;
    }
    
}
