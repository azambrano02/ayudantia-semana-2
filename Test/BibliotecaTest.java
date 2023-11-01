import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class BibliotecaTest {

    private Biblioteca biblioteca;
    private Libro libro1;
    private Libro libro2;
    private Bibliotecario bibliotecario;
    private Usuario usuario;

    @BeforeEach
    public void setUp() {
        biblioteca = new Biblioteca("Biblioteca Test", "Dirección Test");
        libro1 = new Libro("Libro 1", "Autor 1", "Editorial 1", "ISBN1");
        libro2 = new Libro("Libro 2", "Autor 2", "Editorial 2", "ISBN2");
        bibliotecario = new Bibliotecario("Bibliotecario Test", "RUT123", "Dirección Biblio", "ID123");
        usuario = new Usuario("Usuario Test", "RUT456", "123456789");
    }

    @Test
    public void agregarLibroDeberiaAñadirLibro() {
        assertTrue(biblioteca.agregarLibro(libro1));
        assertTrue(biblioteca.getLibros().contains(libro1));
        assertTrue(biblioteca.agregarLibro(libro2));
    }
    @Test
    public void agregarLibroDuplicadoDeberiaFallar() {
        biblioteca.agregarLibro(libro1);
        assertFalse(biblioteca.agregarLibro(libro1));
    }

    @Test
    public void buscarLibroExistenteDeberiaEncontrarLibro() {
        biblioteca.agregarLibro(libro1);
        Libro libroEncontrado = biblioteca.buscarLibro("Libro 1");
        assertNotNull(libroEncontrado);
        assertEquals(libro1, libroEncontrado);
    }

    @Test
    public void buscarLibroNoExistenteDeberiaRetornarNull() {
        Libro libroNoEncontrado = biblioteca.buscarLibro("Libro Inexistente");
        assertNull(libroNoEncontrado);
    }

    @Test
    public void generarPrestamoDeberiaAñadirPrestamo() {
        biblioteca.agregarLibro(libro1);
        Date fechaInicio = new Date();
        Date fechaTermino = new Date();
        biblioteca.generarPrestamo(bibliotecario, usuario, libro1, fechaInicio, fechaTermino);
        assertTrue(biblioteca.getPrestamos().size() == 1);
    }

    @Test
    public void generarPrestamoDeLibroInexistenteDeberiaMostrarMensaje() {
        Date fechaInicio = new Date();
        Date fechaTermino = new Date();
        biblioteca.generarPrestamo(bibliotecario, usuario, libro1, fechaInicio, fechaTermino);
        // Asegúrate de que se imprima el mensaje de "El libro no existe en la biblioteca."
        // y que no se haya añadido un préstamo.
        assertTrue(biblioteca.getPrestamos().isEmpty());
    }
}