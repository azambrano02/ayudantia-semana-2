package test;

import modelo.Biblioteca;
import modelo.Bibliotecario;
import modelo.Libro;
import modelo.Usuario;

public class principal {

    public static void main(String[] args) {
        Inicializar();
    }

    public static void Inicializar(){
        Usuario usuario1 = new Usuario("Alan", "209599325", "965062873");
        Usuario usuario2 = new Usuario("Carolina", "212710385", "949204105");
        Bibliotecario empleado1 = new Bibliotecario("Ramon", "194320752", "Plc", "1234");
        Libro libro1 = new Libro("Calolina", "Lalan", "Amor", "6969");
        Libro libro2 = new Libro("Mi primera chamba", "Kilina", "Quiero money", "0000");
        Biblioteca biblioteca = new Biblioteca("Calolalan", "Temuco");

    }


}
