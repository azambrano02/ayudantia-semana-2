class Usuario {
    private String nombre;
    private String rut;
    private String numeroTelefonico;

    public Usuario(String nombre, String rut, String numeroTelefonico){
        this.nombre = nombre;
        this.rut = rut;
        this.numeroTelefonico = numeroTelefonico;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setRut(String rut){
        this.rut = rut;
    }
    public void setNumeroTelefonico(String numeroTelefonico){
        this.numeroTelefonico = numeroTelefonico;
    }

    public String getNombre(){
        return nombre;
    }
    public String getRut(){
        return rut;
    }
    public String getNumeroTelefonico(){
        return numeroTelefonico;
    }

}
