package modelo;

public class Libro {
    private String nombre;
    private String autor;
    private String editorial;
    private String ISBN;
    private Especialidad especialidad;;

    public Libro(String nombre, String autor, String editorial, String ISBN, Especialidad especialidad) {
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.ISBN = ISBN;
        this.especialidad = especialidad;
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
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

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
    public Especialidad getEspecialidad() {
        return this.especialidad;}


    public String toString() {
        return  nombre+autor+editorial+ISBN+especialidad;
    }

}