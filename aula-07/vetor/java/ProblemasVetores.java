package java;

import static java.lang.Double.NEGATIVE_INFINITY;

/**
 * Resolução de problemas envolvendo vetores na aula 7 da disciplina de
 * Construção de Software
 *
 * Created by Rebecca
 */
public class ProblemasVetores {

    /**
     * Encontrar a menor temperatura em um vetor de valores recebidos como
     * argumento.
     *
     * @param temperaturas Vetor de temperaturas.
     *
     * @return Retorna a menor temperatura.
     */
    public double menorTemperatura(final double[] temperaturas){
        double menor = NEGATIVE_INFINITY;

        for(int i = 0; i < temperaturas.length; i++){
            if(temperaturas[i] < menor){
                menor = temperaturas[i];
            }
        }

        return menor;
    }

    /**
     * Somar os números pares contidos na lista recebida como argumento.
     *
     * @param numeros Vetor de números inteiros.
     *
     * @return Retorna a soma dos ímpares.
     */
    public int somaImpares(final int[] numeros){
        int soma = 0;

        for (int numero: numeros) {
            if(numero % 2 == 0){
                soma += numero;
            }
        }

        return soma;
    }

    /**
     * Calcula a quantidade de números contidos no vetor que são menores
     * que o valor de referência.
     *
     * @param numeros Vetor com os números a serem comparados com o valor de
     *                referência.
     * @param referencia Número a ser comparado.
     *
     * @return Retorna a quantidade de números menores que o valor de
     * referência.
     */
    public int quantidadeMenores(final double numeros, final double referencia){
        int menores = 0;

        for(int i = 0; i < temperaturas.length; i++){
            if(temperaturas[i] < referencia){
                menores++;
            }
        }

        return menores;
    }

    

}

