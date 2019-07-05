/*
 * Copyright (c) 2018.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.rebeccamoraes.ufg.cs.aula11.application;


/**
 * Reúne a diferença entre duas datas.
 */
public class DiferencaDTO {
    /**
     * Armazena valor da diferença entre duas datas.
     */
    private int diferenca;

    public DiferencaDTO(final int diferenca) {
        this.diferenca = diferenca;
    }

    public final int getDiferenca() {
        return diferenca;
    }

    public final void setDiferenca(final int diferenca) {
        this.diferenca = diferenca;
    }
}
