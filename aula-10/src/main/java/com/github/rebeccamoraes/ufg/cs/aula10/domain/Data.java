package com.github.rebeccamoraes.ufg.cs.aula10.domain;

import java.time.DateTimeException;

/**
 * Estabelece funções específicas com datas.
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;
    private int diaDaSemana;
    private int anoBissextoReferencia;

    private final int JANEIRO = 1;
    private final int FEVEREIRO = 2;
    private final int MARCO = 3;
    private final int ABRIL = 4;
    private final int MAIO = 5;
    private final int JUNHO = 6;
    private final int JULHO = 7;
    private final int AGOSTO = 8;
    private final int SETEMBRO = 9;
    private final int OUTUBRO = 10;
    private final int NOVEMBRO = 11;
    private final int DEZEMBRO = 12;

    private final int[] mesesCom30Dias = {ABRIL, JUNHO, SETEMBRO, NOVEMBRO};
    private final int[] mesesCom31Dias = {JANEIRO, MARCO, MAIO, JULHO, AGOSTO,
                                            OUTUBRO, DEZEMBRO};

    /**
     * Cria uma instância de Data.
     *
     * @param data {@code String} contendo a data no formato aaaammdd.
     * @param anoBissextoReferencia ano bissexto de referência para calcular se
     *                              o ano da data é bissexto e suas
     *                              consequencias.
     *
     */
    public Data(final int data, final int anoBissextoReferencia) {
        final int dia = data % 100;
        final int mes = (int) (data / 100) % 100;
        final int ano = (int) (data / 10000);

        if (dataEhValida(dia, mes, ano, anoBissextoReferencia)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            this.anoBissextoReferencia = anoBissextoReferencia;
        } else {
            throw new DateTimeException("Data inválida.");
        }
    }

    /**
     * Efetua a validação da data
     */
    public static boolean dataEhValida(final int dia, final int mes,
                                       final int ano,
                                       int anoBissextoReferencia) {
        //validação da data

        //mes entre janeiro e dezembro
        //se mes é fevereiro e é ano bissexto, dia entre 1 e 29
        //se mes é fevereiro e não é ano bissexto, dia entre 1 e 28
        //se mes tem 30 dias, dia entre 1 e 30
        //se mes tem 31 dias, dia entre 1 e 31
        //ano com 4 digitos
        return true;
    }

    /**
     * Verifica se o ano é bissexto.
     * Anos bissextos ocorrem de 4 em 4 anos, exceto em anos multiplos de 100
     * e que não são múltiplos de 400.
     *
     * @return {@code true} se o ano for bissexto, ou {@code false} caso
     * contrário.
     */
    public static boolean anoEhBissexto(int ano, int anoBissextoReferencia) {
        if (ano == anoBissextoReferencia) {
            return true;
        } else {
            final int diferenca = ano - anoBissextoReferencia;

            final boolean difEhMultiploDe4 = diferenca % 4 == 0;

            final boolean anoEhMultiploDe100 = ano % 100 == 0;

            final boolean anoEhMultiploDe400 = ano % 400 == 0;

            final boolean bissexto = difEhMultiploDe4 && !(anoEhMultiploDe100
                    && anoEhMultiploDe400);

            return bissexto;
        }
    }

}
