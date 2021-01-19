package test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
public class TestMetodos {
    //METODO 1
    @Test
    @DisplayName("Obtenemos texto "Face" si el parametro que pasamos es multiplo)
    void testMultiplo3() {
        // 1 - preracion del test
        Metodos metodo = new Metodos();
        // 2 - Ejecutar lo que vamos a validar
        int result = metodo.metodo1(3);
        // 3 - Aserciones
        assertEquals(3, result, "Face");
    }

    @Test
    @DisplayName("Obtenemos texto "Book" si el parametro que pasamos es multiplo)
    void testMultiplo5() {
        // 1 - preracion del test
        Metodos metodo = new Metodos();
        // 2 - Ejecutar lo que vamos a validar
        int result = metodo.metodo1(5);
        // 3 - Aserciones
        assertEquals(5, result, "Book");
    }

    @Test
    @DisplayName("Obtenemos texto "Facebook" si el parametro que pasamos es multiplo)
    void testMultiplo15() {
        // 1 - preracion del test
        Metodos metodo = new Metodos();
        // 2 - Ejecutar lo que vamos a validar
        int result = metodo.metodo1(15);
        // 3 - Aserciones
        assertEquals(15, result, "Facebook");
    }

    @Test
    @DisplayName("Obtenemos el mismo parametro enviado si o es multiplo de 3, 5, ni de 15)
    void testMultiplo() {
        // 1 - preracion del test
        Metodos metodo = new Metodos();
        // 2 - Ejecutar lo que vamos a validar
        int result = metodo.metodo1(x);
        // 3 - Aserciones
        assertEquals(15, result, x);
    }

//METODO 2
@Test
@DisplayName("Obtenemos el valor "1 2 Face" cuando pasamos un array con los valores{1,2,3})
void testValores1() {
    // 1 - preracion del test
    Metodos metodo = new Metodos();
    // 2 - Ejecutar lo que vamos a validar
    int result = metodo.metodo2({1,2,3});
    // 3 - Aserciones
    assertEquals({1,2,3}, result, "1 2 Face");
}

@Test
@DisplayName("Obtenemos el valor "Face Book Facebook" cuando pasamos un array con los valores{6,10,30})
void testValores2() {
    // 1 - preracion del test
    Metodos metodo = new Metodos();
    // 2 - Ejecutar lo que vamos a validar
    int result = metodo.metodo2({6,10,30});
    // 3 - Aserciones
    assertEquals({6,10,30}, result, "Face Book Facebook");
}

@Test
@DisplayName("Obtenemos el valor "4 6 8" cuando pasamos un array con los valores{4,6,8})
void testValores3() {
    // 1 - preracion del test
    Metodos metodo = new Metodos();
    // 2 - Ejecutar lo que vamos a validar
    int result = metodo.metodo2({1,2,3});
    // 3 - Aserciones
    assertEquals({4,6,8}, result, "4 6 8");
}

}
