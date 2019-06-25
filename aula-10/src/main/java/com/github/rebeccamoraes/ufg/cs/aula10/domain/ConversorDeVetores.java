package com.github.rebeccamoraes.ufg.cs.aula10.domain;

public class ConversorDeVetores {

    /**
     * Converte vetor de strings em vetor de inteiros.
     *
     * @param args vetor de strings à ser convertido.
     *
     * @return  vetor args convertido em inteiros.
     */
    public static int[] converteStringsEmInteiros(final String[] args){
        int[] inteiros = new int[args.length];

        for(int i = 0; i < args.length; i++){
            inteiros[i] = Integer.parseInt(args[i]);
        }

        return inteiros;
    }
}
