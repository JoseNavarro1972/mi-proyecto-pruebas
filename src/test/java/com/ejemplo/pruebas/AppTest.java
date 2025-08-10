package com.ejemplo.pruebas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void suma_basica() {
        int a = 2 + 3;
        assertEquals(5, a);
    }
}
