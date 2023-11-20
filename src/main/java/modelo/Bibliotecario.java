package modelo;

public class Bibliotecario extends Persona{
    private String id;

    public Bibliotecario(String nombre, String rut, String direccion, String id) {
       super(nombre, rut, direccion);
        this.id = id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public String toString() {
        return  "Nombre: "+nombre+ "\nRut: "+ rut + "\nDireccion: " + direccion + "\nID: " + id;
    }

    public String getTipo() {
        return "Buibliotecario";
    }
}
