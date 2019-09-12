package catalogo;

import java.util.*;
import java.io.*;


public class Catalogo {
  /** Capacidad m�xima del cat�logo 
   */
  public static final  int MAXLIBROS = 4;//Capacidad m�xima del cat�logo
  
  private Libro[] elArray = new Libro[MAXLIBROS]; // Los libros del
  //cat�logo se disponen consecutivos en el array. 
  // Para mejorar la b�squeda, el array se mantendr� ordenado por ISBN.
  private int numLibros = 0; //N�mero de libros en el cat�logo
  
  /** Inserta el libro l en el cat�logo. 
   *  Si el cat�logo est� lleno, da un aviso.
   */
  public boolean insertar (Libro l) {
    if (numLibros==MAXLIBROS){
        System.out.println("ERROR al insertar: Catalogo lleno");
    return false;
    	}
    else { //La inserci�n mantiene ordenado el array de libros por isbn
      int pos=numLibros-1;
      while (pos>=0 && (l.getISBN().compareTo(elArray[pos].getISBN())) < 0)
      {
        elArray[pos+1] = elArray[pos];
        pos--;
    }
    elArray[pos+1]=l;
    numLibros++;
    return true;
   } 
  }
  
  /* Devuelve la posicion del libro si existe o
   * -1 en el caso de que no exista. Aplica b�squeda binaria.
   */
  public int buscarLibro (String isbn) {
    int ini = 0; int m = 0;
    int fin = numLibros - 1;
    boolean enc = false;
    while (ini<=fin && !enc) {
        m = (ini+fin)/2;
        int c = isbn.compareTo(elArray[m].getISBN());
        if (c == 0) enc = true;
        else if (c < 0) fin = m-1;
        else ini = m+1;
    }
    if (enc) return m; else return -1;
  }
   
 /** Busca en el cat�logo el libro por su ISBN 
  */
  public Libro buscarPorIsbn (String isbn) {  
    int aux = this.buscarLibro(isbn);
    if (aux == -1) return null; else return elArray[aux];
  }
 
  /** Elimina el libro l del cat�logo. 
   *  Si el libro no existe, no se hace nada
   */
  public void eliminar (Libro l) {
    // Mantiene ordenado el array de libros
    int aux = this.buscarLibro(l.getISBN());
    if (aux!=-1) {
      int ult = numLibros-1;
      for (int i = aux; i < ult; i++)
            elArray[i] = elArray[i+1];
      numLibros--;
    }
  }

  public String toString() {
    String res = "";
    for (int i=0; i<numLibros-1; i++)
        res += elArray[i].toString() +"\n";
     
    if (numLibros>0) res += elArray[numLibros-1];
    return res;
  }
  
  
   
}