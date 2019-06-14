package com.github.rebeccamoraes.ufg.cs.aula08;

import com.github.rebeccamoraes.ufg.cs.aula08.domain.AnalisadorArquivo;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrefixoHexadecimalTest {

    @Test
    void arquivoPontoClassRetornaCafebabe() throws IOException {
        assertEquals("cafebabe", AnalisadorArquivo.prefixoHexadecimal("Teste.class"));
    }

}
