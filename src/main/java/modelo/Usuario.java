package modelo;

public class Usuario extends Persona {
    private String numeroTelefonico;

    public Usuario(String nombre, String rut, String direccion, String numeroTelefonico){
        super(nombre, rut, direccion);
        this.numeroTelefonico = numeroTelefonico;
    }
    public void setNumeroTelefonico(String numeroTelefonico){
        this.numeroTelefonico = numeroTelefonico;
    }
    public String getNumeroTelefonico(){
        return numeroTelefonico;
    }

    public String toString() {
        return  nombre+rut+direccion+numeroTelefonico;
    }
}
