package com.github.rebeccamoraes.ufg.cs.aula10;

import com.github.rebeccamoraes.ufg.cs.aula10.domain.Data;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnoEhBissextoTest {

    @Test
    void casoClassicoAnoIgualAoDeReferencia() {
        for (int i = 1000; i <= 2200; i++) {
            assertTrue(Data.anoEhBissexto(i, i));
        }
    }

    @Test
    void casoClassicoAnoMultiploDe100MasNaoDe400RetornaFalse() {
        assertFalse(Data.anoEhBissexto(1700, 2000));
        assertFalse(Data.anoEhBissexto(1800, 1804));
        assertFalse(Data.anoEhBissexto(1900, 2000));
        assertFalse(Data.anoEhBissexto(2100, 2004));
    }

    @Test
    void casosClassicosFalsos() {
        assertFalse(Data.anoEhBissexto(2000, 2001));
        assertFalse(Data.anoEhBissexto(1900, 2000));
    }

    @Test
    void casosClassicosVerdadeiros() {
        assertTrue(Data.anoEhBissexto(2000, 2004));
        assertTrue(Data.anoEhBissexto(2008, 2004));
    }

}
