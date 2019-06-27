package com.github.rebeccamoraes.ufg.cs.aula01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProdutoTest {
    @Test
    void produtoDe5E7Retorna35(){
        assertEquals(35, MatematicaUtils.produto(5, 7));
    }

    @Test
    void produtoDe7E5Retorna35(){
        assertEquals(35, MatematicaUtils.produto(7, 5));
    }

    @Test
    void fator1MenorQue0GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.produto(-1, 5));
    }

    @Test
    void fator2MenorQue0GeraExcecao(){
        assertThrows(IllegalArgumentException.class,
                () -> MatematicaUtils.produto(0, -1));
    }

}
