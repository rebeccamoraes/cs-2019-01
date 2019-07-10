package com.github.rebeccamoraes.ufg.cs.aula12.application.console;

import com.github.rebeccamoraes.ufg.cs.aula12.domain.NumeroUtils;

public class ProgramaNumeral {
    public static void main(final String[] args) {
        final int numero = Integer.parseInt(args[0]);
        NumeroUtils.porExtenso(numero);
    }
}
