import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private String nombreBiblioteca;
    private String direccion;
    public Biblioteca (String nombreBiblioteca, String direccion){
        this.nombreBiblioteca = nombreBiblioteca;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
    }
    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setLibros(List<Libro> libros) {this.libros = libros;}
    public String getNombreBiblioteca(){
        return nombreBiblioteca;
    }
    public String getDireccion(){
        return direccion;
    }

    public List<Libro> getLibros() {return libros;}
    public boolean agregarLibro(String nombre, String autor, String editorial, String ISBN){
        if(buscarLibro(nombre, autor, editorial, ISBN) == null){
            Libro libro = new Libro(nombre, autor, editorial, ISBN);
            this.libros.add(libro);
            return true;
        }
        else{
            return false;
        }
    }
    public Libro buscarLibro(String nombre, String autor, String editorial, String ISBN){
        for(Libro libro : this.libros){
            if(libro.getISBN().equals(ISBN) && libro.getNombre().equals(nombre)&& libro.getAutor().equals(autor)&&libro.getEditorial().equals(editorial)) {
              return libro;
            }
        }
        return null;
    }
    public List<Libro> buscarLibroPorAutor(String autor){
        List<Libro> librosAutor = new ArrayList<Libro>();
        for(Libro libro : this.libros){
            if(libro.getAutor().equals(autor))
                librosAutor.add(libro);
        }
        return librosAutor;
    }

}
