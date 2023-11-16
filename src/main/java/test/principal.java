package test;

import modelo.Biblioteca;
import modelo.Bibliotecario;
import modelo.Libro;
import modelo.Usuario;

import java.sql.SQLOutput;

public class principal {

    public static void main(String[] args) {
        Inicializar();
    }

    public static void Inicializar(){
        Usuario usuario1 = new Usuario("Alan", "1234567-8", "912312312");
        Usuario usuario2 = new Usuario("Carolina", "8765432-1", "93213213");
        Bibliotecario empleado1 = new Bibliotecario("Ramon", "19432075-2", "Plc", "1234");
        Libro libro1 = new Libro("Calolina", "Lalan", "Amor", "1111");
        Libro libro2 = new Libro("Mi primera chamba", "Kilina", "Quiero money", "0000");
        Biblioteca biblioteca = new Biblioteca("Calolalan", "Temuco");

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.buscarLibro("Calolina");
        biblioteca.buscarLibro("Alan");
        biblioteca.libroExiste(libro2);
        biblioteca.buscarLibroPorAutor("Kilina");
        biblioteca.agregarUsuario(usuario2);
        biblioteca.agregarUsuario(usuario1);
        biblioteca.agregarEmpleado(empleado1);

        System.out.println(biblioteca.toString());

        System.out.println(usuario1.toString());

        System.out.println(libro1.toString());

        System.out.println(empleado1.toString());


    }


}
