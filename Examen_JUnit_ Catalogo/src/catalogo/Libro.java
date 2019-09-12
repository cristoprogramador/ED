package catalogo;

/**
 * Junio 2010. Examen 4, problema 1
 * 
 * @author (Profesores PRG - DSIC - ETSINF - UPV) 
 * Clase Libro: Un libro tiene un autor, un t�tulo, su ISBN, 
 * el a�o de publicaci�n, y el n�mero de ejemplares que se
 * disponen de ese libro.
 */
public class Libro {   
    private String autor;
    private String ISBN;
    private String titulo;
    private int anoPub;
    private int numEjem;
    
    public Libro(String aut, String isbn, String tit, 
                             int aPub, int nEjem) {
        this.autor = aut;
        this.ISBN = isbn;
        this.titulo = tit;
        this.anoPub = aPub;
        this.numEjem = nEjem;
    }
    /** Operaci�n consultora del autor */
    public String getAutor() { return this.autor; } 
    /** Operaci�n consultora del ISBN */
    public String getISBN() { return this.ISBN; } 
    /** Operaci�n consultora del t�tulo */
    public String getTitulo() { return this.titulo; }
    /** Operaci�n consultora del a�o de publicaci�n */
    public int getAnoPub() { return this.anoPub; }
   /** Operaci�n consultora del n�mero de ejemplares */
    public int getNumEjem() { return this.numEjem; }
    
    /** Incrementa en n el n�mero de ejemplares del libro*/
    public void modEjem(int n)
    { this.numEjem+=n;
    }
    
   /** String descriptiva del libro con el formato:<P>
    *  $Libro:               <P>
    *  ISBN                  <P>
    *  t�tulo                <P>
    *  autor                 <P>
    *  a�o                   <P>
    *  ejemplares          
    */
    public String toString() {
        return "$Libro:"+"\n"+this.ISBN +"\n"+ this.titulo +"\n"+
        this.autor +"\n"+ this.anoPub +"\n"+ this.numEjem;
    }
  
}