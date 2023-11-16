package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;
    private String nombreBiblioteca;
    private String direccion;
    private List<Prestamo> prestamos;
    private List<Usuario> usuarios;
    private List<Bibliotecario> bibliotecarios;

    public Biblioteca(String nombreBiblioteca, String direccion) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.direccion = direccion;
        this.libros = new ArrayList<>();
        this.prestamos = new ArrayList<>();
        this.usuarios = new ArrayList<>();
        this.bibliotecarios = new ArrayList<>();
    }

    public void setNombreBiblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    public void setUsuarios(List<Usuario> usuarios){
        this.usuarios = usuarios;
    }
    public void setBibliotecarios(List<Bibliotecario> bibliotecarios){
        this.bibliotecarios = bibliotecarios;
    }

    public String getNombreBiblioteca() {
        return nombreBiblioteca;
    }
    public String getDireccion() {
        return direccion;
    }
    public List<Libro> getLibros() {
        return libros;
    }
    public List<Prestamo> getPrestamos() { return prestamos; }
    public List<Usuario> getUsuarios() {return usuarios; }
    public List<Bibliotecario> getBibliotecarios() { return bibliotecarios; }


    public boolean agregarUsuario(Usuario usuario) {
        if (!usuarioExiste(usuario)) {
            this.usuarios.add(usuario);
            return true;
        } else {
            return false;
        }
    }
    public boolean usuarioExiste(Usuario usuario){
        for(Usuario u : this.usuarios) {
            if(usuario.getRut().equals(u.getRut())) {
                return true;
            }
        }

        return false;
    }

    public boolean agregarEmpleado(Bibliotecario bibliotecario) {
        if (!empleadoExiste(bibliotecario)) {
            this.bibliotecarios.add(bibliotecario);
            return true;
        } else {
            return false;
        }
    }

    public boolean empleadoExiste(Bibliotecario empleado){
        for(Bibliotecario b : this.bibliotecarios) {
            if(empleado.getId().equals(b.getId())) {
                return true;
            }
        }

        return false;
    }
    public boolean agregarLibro(Libro libro) {
        if (!libroExiste(libro)) {
            this.libros.add(libro);
            return true;
        } else {
            return false;
        }
    }

    public Libro buscarLibro(String nombre) {
        for (Libro libro : this.libros) {
            if (libro.getNombre().equals(nombre)) {
                return libro;
            }
        }

        return null;
    }

    public List<Libro> buscarLibroPorAutor(String autor) {
        List<Libro> librosAutor = new ArrayList<Libro>();
        for (Libro libro : this.libros) {
            if (libro.getAutor().equals(autor))
                librosAutor.add(libro);
        }
        return librosAutor;
    }
    public boolean libroExiste(Libro libro){
        for(Libro l : this.libros) {
            if(libro.getISBN().equals(l.getISBN())) {
                return true;
            }
        }

        return false;
    }
    public void generarPrestamo(Bibliotecario bibliotecario, Usuario usuario, Libro libro, Date fechaInicio, Date fechaTermino) {
        if (!libroExiste(libro)) {
            System.out.println("El libro no existe en la biblioteca.");
            return;
        }
        for (Prestamo prestamo : prestamos) {
            if (prestamo.getLibro().equals(libro)) {
                System.out.println("El libro ya está prestado.");
                return;
            }
        }
        Prestamo nuevoPrestamo = new Prestamo(bibliotecario, usuario, libro, fechaInicio, fechaTermino);
        prestamos.add(nuevoPrestamo);
    }
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Nombre de la Biblioteca: ").append(nombreBiblioteca).append("\n");
        stringBuilder.append("Dirección: ").append(direccion).append("\n");

        stringBuilder.append("Libros en la Biblioteca:\n");
        for (Libro libro : libros) {
            stringBuilder.append(libro.getNombre()).append("\n");
        }

        stringBuilder.append("Préstamos en la Biblioteca:\n");
        for (Prestamo prestamo : prestamos) {
            stringBuilder.append(prestamo.toString()).append("\n");
        }

        stringBuilder.append("Usuarios en la Biblioteca:\n");
        for (Usuario usuario : usuarios) {
            stringBuilder.append(usuario.getNombre()).append("\n");
        }

        stringBuilder.append("Bibliotecarios en la Biblioteca:\n");
        for (Bibliotecario bibliotecario : bibliotecarios) {
            stringBuilder.append(bibliotecario.getNombre()).append("\n");
        }
        return stringBuilder.toString();
    }
}



