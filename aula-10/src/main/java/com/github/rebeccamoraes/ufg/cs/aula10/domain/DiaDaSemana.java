package com.github.rebeccamoraes.ufg.cs.aula10.domain;

/**
 * Programa para identificar o dia da semana de uma data.
 * Dada uma data e seu respectivo dia da semana, assim como um ano bissexto de
 * referência e a data de interesse, o programa calcula o dia da semana
 * referente a data de interesse.
 *
 * @author Rebecca Moraes
 */
public final class DiaDaSemana {

    /**
     * Valor padrão para casos de erro.
     */
    private static final int ERRO = -1;

    /**
     * Construtor privado para evitar a instanciação da classe.
     */
    private DiaDaSemana() { }

    /**
     * Obtem o dia da semana da data de interesse.
     *
     * @param args {dataInteresse, anoBissexto, dataReferencia,
     *             diaSemanaReferencia}
     *
     * @return dia da semana correspondente à data de interesse
     */
    public static int obtemDiaDaSemana(final String[] args) {
        final int quantidadeArgs = 4;
        final int posicaoDataInteresse = 0;
        final int posicaoAnoBissexto = 1;
        final int posicaoDataReferencia = 2;
        final int posicaoDiaDaSemanaRef = 3;

        int[] argsToInt;

        if (args.length != quantidadeArgs) {
            return ERRO;
        }

        try {
            argsToInt = ConversorDeVetores.converteStringsEmInteiros(args);
        } catch (NumberFormatException excecao) {
            return ERRO;
        }

        final int dataInteresse = argsToInt[posicaoDataInteresse];
        final int anoBissexto = argsToInt[posicaoAnoBissexto];
        final int dataReferencia = argsToInt[posicaoDataReferencia];
        final int diaDaSemanaRef = argsToInt[posicaoDiaDaSemanaRef];

        return 10;
    }
}
