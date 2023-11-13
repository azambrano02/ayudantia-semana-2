package modelo;

public class Libro {
    private String nombre;
    private String autor;
    private String editorial;
    private String ISBN;

    public Libro(String nombre, String autor, String editorial, String ISBN) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.ISBN = ISBN;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    public void setISBN(String ISBN) {this.ISBN = ISBN;}

    public String getNombre() {
        return nombre;
    }
    public String getAutor() {
        return autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public String getISBN() { return ISBN;}

    public String toString() {
        return  nombre+autor+editorial+ISBN;
    }

}