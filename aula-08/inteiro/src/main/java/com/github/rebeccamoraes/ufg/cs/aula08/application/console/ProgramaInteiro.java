package com.github.rebeccamoraes.ufg.cs.aula08.application.console;
import com.github.rebeccamoraes.ufg.cs.aula08.domain.AnalisadorArquivo;

/**
 * Programa que retorna os 4 primeiros do informado arquivo bytes em
 * hexadecimal
 *
 */
public final class ProgramaInteiro {

    private ProgramaInteiro(){
        //evita criação de instância.
    }

    /**
     * Executa o analizador de arquivo e imprime o resultado.
     *
     * @param args [1] nome do arquivo a ser analizado.
     */
    public static void main(final String[] args){

        try {

            final String resultado = AnalisadorArquivo.prefixoHexadecimal(args[0]);
            System.out.println(resultado);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
