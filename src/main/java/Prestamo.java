import java.util.Date;

class Prestamo {
    Bibliotecario bibliotecario;
    Usuario usuario;
    Libro libro;
    private Date fechaInicio;
    private Date fechaTermino;


    public Prestamo (Bibliotecario bibliotecario, Usuario usuario, Libro libro, Date fechaInicio, Date fechaTermino){
        this.bibliotecario = bibliotecario;
        this.usuario = usuario;
        this.libro = libro;
        this.fechaInicio = fechaInicio;
        this.fechaTermino = fechaTermino;
    }

    public void setBibliotecario(Bibliotecario bibliotecario){
        this.bibliotecario = bibliotecario;
    }
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }
    public void setLibro(Libro libro){
        this.libro = libro;
    }
    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio = fechaInicio;
    }
    public void setFechaTermino(Date fechaTermino){
        this.fechaTermino = fechaTermino;
    }

    public Bibliotecario getBibliotecario(){
        return bibliotecario;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    public Libro getLibro() {
        return libro;
    }
    public Date getFechaInicio(){
        return fechaInicio;
    }
    public Date getFechaTermino(){
        return fechaTermino;
    }
}
