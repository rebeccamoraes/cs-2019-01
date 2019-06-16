package com.github.rebeccamoraes.ufg.cs.aula01;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;

/**
 *
 * @author Rebecca Moraes
 */
public final class Exercicios {
    /**
     * Maior valor possível para dia.
     */
    public static final int MAIOR_DIA = 31;

    /**
     * Menor valor possível para dia.
     */
    public static final int MENOR_DIA = 1;

    /**
     * Maior valor possível para mês.
     */
    public static final int MAIOR_MES = 12;


    /**
     * Menor valor possível para dia.
     */
    public static final int MENOR_MES = 1;

    /**
     * Não é permitido instanciar a classe.
     */
    private Exercicios() { }

    /**
     * Verifica se o argumento fornecido é um número que possui a propriedade
     * 3025.
     *
     * @param numero Número inteiro à ser verificado.
     *
     * @return Verdadeiro, caso o número possua a propriedade 3025, ou
     * falso, caso contrário.
     *
     * @throws IllegalArgumentException Lança exceção caso o valor do parâmetro
     * seja menor que 0 ou maior que 9999.
     */
    public static boolean propriedade3025(final int numero) {
        if (numero < 0 || numero > 9999) {
            throw new IllegalArgumentException("Número Inválido!");
        }

        final int doisPrimeirosDigitos = numero / 100;
        final int doisUltimosDigitos = numero % 100;

        return ((doisPrimeirosDigitos + doisUltimosDigitos) * (doisPrimeirosDigitos + doisUltimosDigitos)) == numero;
    }

    /**
     * Verifica se o argumento fornecido é um número que possui a propriedade
     * 153.
     *
     * @param numero Número inteiro à ser verificado.
     *
     * @return Verdadeiro, caso o número possua a propriedade 153, ou
     * falso, caso contrário.
     *
     * @throws IllegalArgumentException Lança exceção caso o valor do parâmetro
     * seja menor que 100 ou maior que 9999.
     */
    public static boolean propriedade153(final int numero) {
        if (numero < 100 || numero > 999) {
            throw new IllegalArgumentException("Número Inválido!");
        }

        final int centena = numero / 100;
        final int dezenaUnidade = numero % 100;
        final int dezena = dezenaUnidade / 10;
        final int unidade = dezenaUnidade % 10;

        return (Math.pow(centena, 3) + Math.pow(dezena, 3) + Math.pow(unidade, 3)) == numero;
    }

    /**
     * Define o dia da semana para uma data.
     *
     * @param dia Número inteiro referente ao dia
     * @param mes Número inteiro referente ao mês
     * @param ano Número inteiro referente ao ano
     *
     * @return Número inteiro referente ao dia da semana correspondente
     * à data fornecida.
     *
     * @throws  IllegalArgumentException Caso valor de dia seja menor que 1 ou
     * maior que 31.
     * @throws IllegalArgumentException Caso valor de mes seja menor que 1 ou
     * maior que 12.
     * @throws IllegalArgumentException Caso valor de ano seja menor que 1753.
     */
    public static int diaDaSemana(final int dia, final int mes, final int ano) {
        if (dia < MENOR_DIA || dia > MAIOR_DIA) {
            throw new IllegalArgumentException("Dia inválido.");
        } else if ((MENOR_MES < 1) || (mes > MAIOR_MES)) {
            throw new IllegalArgumentException("Mês inválido.");
        } else if (ano < 1753) {
            throw new IllegalArgumentException("Ano inválido.");
        }

        try {
            LocalDate.of(ano, mes, dia);
        } catch (DateTimeException excecao) {
            throw new IllegalArgumentException("data inválida", excecao);
        }

        int mesAuxiliar = mes;
        int anoAuxiliar = ano;

        if (mes == 1 || mes == 2) {
            mesAuxiliar += 12;
            anoAuxiliar -= 1;
        }

        final int indiceDoDia = dia + 2 * mesAuxiliar + (3 * (mesAuxiliar + 1)) / 5
                + anoAuxiliar + anoAuxiliar / 4 - anoAuxiliar / 100
                + anoAuxiliar / 400;
        return indiceDoDia % 7;
    }

    /**
     * Calcula o resto da divisão do "dividendo" pelo "divisor" informados.
     *
     * @param dividendo número a ser dividido.
     * @param divisor número pelo qual o dividendo será dividido.
     *
     * @return Resto inteiro da divisão do divisor pelo dividendo.
     *
     * @throws IllegalArgumentException Caso o valor do dividendo menor ou
     * igual a 0 ou o divisor não seja menor que zero.
     */
    public static int mod(final int dividendo, final int divisor) {
        if (divisor <= 0 || dividendo < 0) {
            throw new IllegalArgumentException("Argumentos inválidos.");
        }
        int resto = dividendo;
        while (divisor <= resto) {
            resto -= divisor;
        }

        return resto;
    }

    /**
     * Calcula a soma dos N primeiros números naturais.
     *
     * @param numero quantidade de números à serem somados.
     *
     * @return Número correspondente à soma dos n primeiros números naturais.
     *
     * @throws IllegalArgumentException Caso n seja menor que 1.
     */
    public static int somaNaturais(final int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("Número Inválido!");
        }
        int parcela = 2;
        int soma = 1;
        while (parcela <= numero) {
            soma += parcela;
            parcela++;
        }
        return soma;
    }

    /**
     * Calcula o fatorial de um numero n.
     *
     * @param numero número inteiro sobre o qual deseja-se obter o fatorial.
     *
     * @return Número inteiro correspondente ao fatorial do número n.
     *
     * @throws IllegalArgumentException Caso o valor de n seja menor que 1.
     */
    public static int fatorial(final int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        int fator = 2;
        int fatorialParcial = 1;
        while (fator <= numero) {
            fatorialParcial *= fator;
            fator++;
        }
        return fatorialParcial;
    }

    /**
     * Calcula o produto de dois números inteiros usando somas.
     *
     * @param fator1 primeiro número inteiro à ser multiplicado.
     * @param fator2 segundo número inteiro à ser multiplicado.
     *
     * @return Número inteiro correspondente ao produto dos dois inteiros
     * fornecidos.
     *
     * @throws IllegalArgumentException Caso o valor de fator1 ou de fator2
     * seja(m) menor(e) que zero.
     */
    public static int produto(final int fator1, final int fator2) {
        if (fator1 < 0 || fator2 < 0) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }

        int totalParcelas = fator1;
        int parcela = fator2;

        if (fator2 < fator1) {
            totalParcelas = fator2;
            parcela = fator1;
        }

        int indice = 1;
        int soma = 0;

        while (indice <= totalParcelas) {
            soma += parcela;
            indice++;
        }

        return soma;
    }

    /**
     * Calcula potencia utilizando somas.
     *
     * @param base número inteiro usado como base da potência.
     * @param expoente número inteiro usado como expoente da potência.
     *
     * @return Resultado da base  elevada ao expoente.
     *
     * @throws IllegalArgumentException Caso o valor da base ou do expoente
     * seja(m) menor(es) que zero.
     */
    public static int potenciaUtilizandoSomas(final int base, final int expoente) {
        if (base < 0 || expoente < 0) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }

        int potencia = 1;
        int indice = 1;

        while (indice <= expoente) {
            potencia = produto(potencia, base);
            indice++;
        }

        return potencia;
    }

    /**
     * Calcula o valor de PI de acordo com a precisão fornecida.
     *
     * @param precisao número de precisão de PI.
     *
     * @return Valor de PI, com a precisão fornecida.
     *
     * @throws IllegalArgumentException Caso o valor de precisão seja menor
     * que 1.
     */
    public static double calculaPi(final int precisao) {
        if (precisao < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }

        double contador = 1;
        double s = -1;
        double d = -1;
        double piParcial = 0;

        while (contador <= precisao) {
            d += 2;
            s *= -1;
            piParcial = piParcial + 4 * s / d;
            contador++;
        }
        return piParcial;
    }

    /**
     * Calcula o valor do logaritmo natural, dados n e k.
     *
     * @param expoente número natural positivo.
     * @param precisao número inteiro que define a quantidade de termos empregados
     *         pelo somatório (precisão).
     *
     * @return Logaritmo natural (e^n).
     *
     * @throws IllegalArgumentException Caso os argumentos não atendam as
     * seguintes exigências: 1 <= n e 2 <= k.
     */
    public static double logaritmoNatural(final int expoente, final int precisao) {
        if (expoente < 1 || precisao < 2) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }

        double logaritmo = 1 + expoente;
        int precisaoParcial = 2;
        int numerador = expoente;
        int denominador = 1;

        while (precisaoParcial <= precisao) {
            numerador *= numerador;
            denominador *= precisaoParcial;
            logaritmo = logaritmo + numerador / denominador;
            precisaoParcial++;
        }
        return logaritmo;
    }

    /**
     * Calcula a Razão Áurea da sequência iniciada por X e y e finalizada no
     * k-ésimo número.
     *
     * @param primeiroNumero primeiro número da sequência.
     * @param segundoNumero segundo número da sequência.
     * @param tamanhoSequencia posição do último número da sequência.
     *
     * @return Razão entre o o k-ésimo e o (k-1)-ésimo número da sequência.
     *
     * @throws IllegalArgumentException Caso os argumentos não atendam os
     * sequintes requisitos 0 <= x, x < y e 0 < k.
     */
    public static double razaoAurea(final int primeiroNumero, final int segundoNumero, final int tamanhoSequencia) {
        if (primeiroNumero < 0 || primeiroNumero > segundoNumero || tamanhoSequencia <= 0) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }

        int auxiliar;
        int ultimoNumero = segundoNumero;
        int penultimoNumero = primeiroNumero;
        int contador = 1;

        while (contador <= tamanhoSequencia) {
            auxiliar = ultimoNumero;
            ultimoNumero += penultimoNumero;
            penultimoNumero = auxiliar;
            contador++;
        }
        return ultimoNumero / penultimoNumero;
    }

    /**
     * Verifica se o número fornecido satisfaz a equação que define um quadrado
     * perfeito.
     *
     * @param numero número a ser verificado.
     *
     * @return True, caso o número satisfaça a equação, ou False, caso contrário.
     *
     * @throws IllegalArgumentException Caso o número seja menor que 1.
     */
    public static boolean quadradoPerfeito(final int numero) {
        if (numero < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int i = 1;
        int s = 1;

        while (s < numero) {
            i += 2;
            s += i;
        }

        return s == numero;
    }

    /**
     * Calcula a raiz quadrada de um número n, com precisão fornecida de
     * acordo com o Método Babilônico.
     *
     * @param numero número para cálculo da raiz quadrada.
     * @param precisao numero inteiro.
     *
     * @return Raiz quadrada do número n com precisão i.
     *
     * @throws IllegalArgumentException Caso n seja menor ou igual a 0.
     */
    public static double raizQuadrada(final int numero, final int precisao) {
        if (numero <= 0) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }

        int raiz = 1;
        int precisaoAuxiliar = precisao;

        while (0 <= precisaoAuxiliar) {
            raiz = (raiz + numero / raiz) / 2;
            precisaoAuxiliar--;
        }

        return raiz;
    }

    /**
     * Verifica se o número fornecido é primo.
     *
     * @param numero número a ser verificado.
     *
     * @return True caso o número seja primo, ou false, caso contrário.
     *
     * @throws IllegalArgumentException Caso n seja menor ou igual a 1.
     */
    public static boolean primo(final int numero) {
        if (numero <= 1) {
            throw new IllegalArgumentException("Número inválido.");
        }

        int divisor = 2;

        while (divisor < numero) {
            if (numero % divisor == 0) {
                return false;
            }
            divisor++;
        }

        return true;
    }

    /**
     * Identifica os índices primos de um array até a n-ésima posição
     * fornecida, através do método de determinação de números primos
     * conhecido por Crivo de Eratostenes.
     *
     * @param vetor vetor cujos índices serão verificados.
     * @param tamanho tamanho do vetor.
     *
     * @return vetor cujos valores das posições cos índices primos são igual a 0.
     *
     * @throws IllegalArgumentException Caso o temanho do vetor seja menor
     * ou igual a 1.
     */
    public static int[] crivoEratostenes(final int[] vetor, final int tamanho) {
        if (tamanho <= 1) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }

        Arrays.fill(vetor, 2, tamanho - 1, 0);

        int indice = 2;
        int multiplo;
        final double limite = Math.sqrt(tamanho);

        while (indice <= limite) {
            if (vetor[indice] == 0) {
                multiplo = indice + indice;
                while (multiplo <= tamanho) {
                    vetor[multiplo] = 1;
                    multiplo = multiplo + indice;
                }
            }
            indice++;
        }

        return vetor;
    }

    /**
     * Calcula o Maior divisor comum entre dois inteiros fornecidos.
     *
     * @param primeiroNumero primeiro número inteiro.
     * @param segundoNumero segundo número inteiro.
     *
     * @return Maior divisor comum entre os dois inteiros fornecidos.
     *
     * @throws IllegalArgumentException  Caso os argumentos não atendam os
     * sequintes requisitos: segundoNumero <= primeiroNumero e
     * 0 < segundoNumero.
     */
    public static int mdc(final int primeiroNumero, final int segundoNumero) {
        if (segundoNumero > primeiroNumero || segundoNumero <= 0) {
            throw new IllegalArgumentException("Argumento(s) inválidos!");
        }

        int resto;
        int aux1 = primeiroNumero;
        int aux2 = segundoNumero;

        while (aux2 != 0) {
            resto = aux1 % aux2;
            aux1 = aux2;
            aux2 = resto;
        }

        return aux1;
    }

    /**
     * Calcula o Maior divisor comum entre dois inteiros fornecidos.
     * (Implementação alternativa).
     *
     * @param primeiroNumero primeiro número inteiro.
     * @param segundoNumero segundo número inteiro.
     *
     * @return Maior divisor comum entre os valores de a e b.
     *
     * @throws IllegalArgumentException  Caso os argumentos não atendam os
     * sequintes requisitos: segundoNumero <= primeiroNumero
     * e 0 < segundoNumero.
     */
    public static int mdc2(final int primeiroNumero, final int segundoNumero) {
        if (segundoNumero > primeiroNumero || segundoNumero <= 0) {
            throw new IllegalArgumentException("Argumento(s) inválidos!");
        }

        int aux1 = primeiroNumero;
        int aux2 = segundoNumero;

        while (aux1 != aux2) {
            if (aux1 > aux2) {
                aux1 -= aux2;
            } else {
                aux2 -= aux1;
            }
        }

        return aux1;
    }

    /**
     * Avalia um polinômio de acordo com a Regra de Horner.
     *
     * @param incognita valor da incógnita para avaliação do polinômio.
     * @param grau grau do polinômio
     * @param coeficientes vetor com os coeficientes do polinômio.
     *
     * @return Resultado da somatória dos produtos e potências do polinômio.
     *
     * @throws IllegalArgumentException Caso o grau do polinômio seja menor
     * que 1.
     */
    public static int avaliacaoPolinomialHorner(final int incognita, final int grau, final int[] coeficientes) {
        if (grau < 1) {
            throw new IllegalArgumentException("Número inválido!");
        }

        int parcelaAcumulada = coeficientes[grau];
        int indice = grau - 1;

        while (0 <= indice) {
            parcelaAcumulada = parcelaAcumulada * incognita + coeficientes[indice];
            indice--;
        }

        return parcelaAcumulada;
    }

    /**
     * Calcula o n-ésimo termo da sequência de Fibonacci.
     *
     * @param n posição do termo a ser obtido.
     *
     * @return n-ésimo termo da sequência de Fibonacci.
     *
     * @throws IllegalArgumentException Caso n seja menor que 0.
     */
    public static int fibonacci(final int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número inválido!");
        }

        int a = 0;
        int c = 1;

        if (n == 0 || n == 1) {
            return n;
        } else {

            int i = 2;

            while (i <= n) {
                final int t = c;
                c += a;
                a = t;
                i++;
            }

            return c;
        }
    }

    /**
     * Valida CPF (Cadastro de Pessoas Físicas).
     *
     * @param cpf vetor contendo os dígitos do CPF a ser verificado.
     *
     * @return True caso o cpf informado seja válido, ou false, caso contrário.
     */
    public static boolean validaCPF(final int[] cpf) {
        if (cpf.length < 11) {
            throw new IllegalArgumentException("CPF inválido. O CPF precisa"
                    + " ter 11 dígitos.");
        }

        final int j = cpf[0] + 2 * cpf[1] + 3 * cpf[2] + 4 * cpf[3] + 5 * cpf[4] + 6 * cpf[5] + 7 * cpf[6]
                + 8 * cpf[7] + 9 * cpf[8];
        final int k = cpf[1] + 2 * cpf[2] + 3 * cpf[3] + 4 * cpf[4] + 5 * cpf[5] + 6 * cpf[6] + 7 * cpf[7]
                + 8 * cpf[8] + 9 * cpf[9];

        final int digitoVerificador1 = (j % 11) % 10;
        final int digitoVerificador2 = (k % 11) % 10;

        return digitoVerificador1 == cpf[9] && digitoVerificador2 == cpf[10];
    }

    /**
     * Valida CPF (Cadastro de Pessoas Físicas) - Versão Alternativa.
     *
     * @param cpf vetor contendo os dígitos do CPF a ser verificado.
     *
     * @return True caso o cpf informado seja válido, ou false, caso contrário.
     */
    public static boolean validaCPF2(final int[] cpf) {
        if (cpf.length < 11) {
            throw new IllegalArgumentException("CPF inválido. O CPF precisa"
                    + " ter 11 dígitos.");
        }

        int indiceDigito = 7;
        int p = cpf[8];
        int s = cpf[8];

        while (0 <= indiceDigito) {
            p += cpf[indiceDigito];
            s += p;
            indiceDigito--;
        }

        final int digitoVerificador1 = (s % 11) % 10;
        final int digitoVerificador2 = ((s - p + 9 * cpf[9]) % 11) % 10;

        return (digitoVerificador1 == cpf[9]) && (digitoVerificador2 == cpf[10]);
    }
}
