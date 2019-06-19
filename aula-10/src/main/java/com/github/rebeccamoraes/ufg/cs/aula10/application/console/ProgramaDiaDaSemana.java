package com.github.rebeccamoraes.ufg.cs.aula10.application.console;
import com.github.rebeccamoraes.ufg.cs.aula10.domain.ConversorDeVetores;
import com.github.rebeccamoraes.ufg.cs.aula10.domain.DiaDaSemana;

/**
 * Programa para identificar o dia da semana de uma data.
 * Dada uma data e seu respectivo dia da semana, assim como um ano bissexto de
 * referência e a data de interesse, o programa calcula o dia da semana
 * referente a data de interesse.
 *
 * @author Rebecca Moraes
 */
public class ProgramaDiaDaSemana{

    public static void main(final String[] args){

        try {

            int[] argsToInt = ConversorDeVetores.converteStringsEmInteiros(args);
            final int resultado = DiaDaSemana.obtemDiaDaSemana(argsToInt);
            System.out.println(resultado);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}