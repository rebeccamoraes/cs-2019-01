package com.github.rebeccamoraes.ufg.cs.aula10.domain;

/**
 * Programa para identificar o dia da semana de uma data.
 * Dada uma data e seu respectivo dia da semana, assim como um ano bissexto de
 * referência e a data de interesse, o programa calcula o dia da semana
 * referente a data de interesse.
 *
 * @author Rebecca Moraes
 */
public class DiaDaSemana{

    final static int ERRO = -1;

    /**
     * Obtem o dia da semana da data de interesse.
     *
     * @param args {dataInteresse, anoBissexto, dataReferencia,
     *             diaSemanaReferencia}
     *
     * @return dia da semana correspondente à data de interesse
     */
    public static int obtemDiaDaSemana(final int[] args){
        final int QUANTIDADE_ARGS = 4;

        if(args.length != QUANTIDADE_ARGS){
            return ERRO;
        }

        final int dataInteresse = args[0];
        final int anoBissexto = args[1];
        final int dataReferencia = args[2];;
        final int diaDaSemanaReferencia = args[3];



        return 10;
    }
}