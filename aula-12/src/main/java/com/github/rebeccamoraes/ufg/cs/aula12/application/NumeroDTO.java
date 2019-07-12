/*
 * Copyright (c) 2019.
 * Fábrica de Software - Instituto de Informática (UFG)
 * Creative Commons Attribution 4.0 International License.
 */

package com.github.rebeccamoraes.ufg.cs.aula12.application;

/**
 * Reúne características de um número.
 */
public class NumeroDTO {
    /**
     * Armazena valor do número por extenso.
     */
    private String numero;

    /**
     * Armazena o valor do número por extenso.
     * @param numero Número por Extenso.
     */
    public NumeroDTO(final String numero) {
        this.numero = numero;
    }

    public final String getNumero() {
        return numero;
    }

    public final void setNumero(final String numero) {
        this.numero = numero;
    }
}
