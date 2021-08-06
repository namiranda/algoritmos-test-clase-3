package com.redbee.academy.clase3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DigitosTests {

    @Test
    void testDigitos() {
        Assertions.assertEquals(1, Digitos.resolver(0L));
    }

    @Test
    void testDigitos2() {
        Assertions.assertEquals(15, Digitos.resolver(123456789012345L));
    }

    @Test
    void testDigitos3() {
        Assertions.assertEquals(6, Digitos.resolver(123456L));
    }
}
