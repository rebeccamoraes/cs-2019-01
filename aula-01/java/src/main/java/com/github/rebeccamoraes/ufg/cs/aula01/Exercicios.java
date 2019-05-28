package com.github.rebeccamoraes.ufg.cs.aula01;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Arrays;

public class Exercicios {

    public static void main(String[] args) {

    }

    /**
     * Verifica se o argumento fornecido é um número que possui a propriedade 3025.
     *
     * @param n Número inteiro à ser verificado.
     *
     * @return Verdadeiro, caso o número possua a propriedade 3025, ou
     * falso, caso contrário.
     *
     * @throws IllegalArgumentException Lança exceção caso o valor do parâmetro seja menor
     * que 0 ou maior que 9999.
     */
    public static boolean propriedade3025(final int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("Número Inválido!");
        }

        final int i = n / 100;
        final int j = n % 100;

        return ((i + j) * (i + j)) == n;
    }

    public static boolean propriedade153(final int cdu) {
        if ((cdu < 100) || (cdu > 999)) {
            throw new IllegalArgumentException("Número Inválido!");
        }
        int c = cdu / 100;
        int du = cdu % 100;
        int d = du / 10;
        int u = du % 10;

        return (Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3)) == cdu;
    }

    /**
     * Define o dia da semana para uma data
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
        if ((dia < 1) || (dia > 31)) {
            throw new IllegalArgumentException("Dia inválido.");
        } else if ((mes < 1) || (mes > 12)) {
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
            anoAuxiliar += 1;
        }
        int s = dia + 2 * mesAuxiliar + (3 * (mesAuxiliar + 1)) / 5
                + anoAuxiliar + anoAuxiliar / 4 - anoAuxiliar / 100
                + anoAuxiliar / 400;
        return s % 7;
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
        if (divisor < 0 || dividendo <= 0) {
            throw new IllegalArgumentException("Argumentos inválidos.");
        }
        int resto = dividendo;
        while (divisor <= resto) {
            resto -= divisor;
        }

        return resto;
    }

    /**
     * Calcula a soma dos N primeiros números naturais
     *
     * @param n quantidade de números à serem somados.
     *
     * @return Número correspondente à soma dos n primeiros números naturais.
     *
     * @throws IllegalArgumentException Caso n seja menor que 1.
     */
    public static int somaNaturais(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número Inválido!");
        }
        int i = 2;
        int soma = 1;
        while (i <= n) {
            soma += i;
            i++;
        }
        return soma;
    }

    /**
     * Calcula o fatorial de um numero n
     * @param n número inteiro sobre o qual deseja-se obter o fatorial.
     *
     * @return Número inteiro correspondente ao fatorial do número n.
     *
     * @throws IllegalArgumentException Caso o valor de n seja menor que 1.
     */
    public static int fatorial(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        int i = 2;
        int f = 1;
        while (i <= n) {
            f *= i;
            i++;
        }
        return f;
    }

    /**
     * Calcula o produto de dois números inteiros usando somas
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
        int i = 1;
        int soma = 0;
        while (i <= totalParcelas) {
            soma += parcela;
            i++;
        }
        return soma;
    }
    
    /**
     * Calcula potencia utilizando somas
     *
     * @param base número inteiro usado como base da potência.
     * @param expoente número inteiro usado como expoente da potência.
     *
     * @return Resultado da base  elevada ao expoente.
     *
     * @throws IllegalArgumentException Caso o valor da base ou do expoente
     * seja(m) menor(es) que zero.
     */
    public static int potencia(final int base, final int expoente) {
        if (base < 0 || expoente < 0) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }
        int potencia = 1;
        int i = 1;
        while (i <= expoente) {
            potencia = produto(potencia, base);
            i++;
        }
        return potencia;
    }

    //TODO renomear n para precisão
    /**
     * Calcula o valor de PI de acordo com a precisão fornecida
     *
     * @param n número de precisão de PI.
     *
     * @return Valor de PI, com a precisão fornecida.
     *
     * @throws IllegalArgumentException Caso o valor de precisão seja menor
     * que 1.
     */
    public static double pi(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        double i, s, d, p;
        i = 1;
        s = -1;
        d = -1;
        p = 0;
        while (i <= n) {
            d += 2;
            s *= -1;
            p = p + 4 * s / d;
            i++;
        }
        return p;
    }

    /**
     * Calcula o valor do logaritmo natural, dados n e k
     *
     * @param expoente número natural positivo
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
        double e = 1 + expoente;
        int i = 2, numerador = expoente, denominador = 1;
        while (i <= precisao) {
            numerador *= numerador;
            denominador *= i;
            e = e + numerador / denominador;
            i++;
        }
        return e;
    }

    /**
     * Calcula a Razão Áurea da sequência iniciada por X e y e finalizada no
     * k-ésimo número.
     *
     * @param x primeiro número da sequência
     * @param y segundo número da sequência
     * @param k posição do último número da sequência
     *
     * @return Razão entre o o k-ésimo e o (k-1)-ésimo número da sequência.
     *
     * @throws IllegalArgumentException Caso os argumentos não atendam os
     * sequintes requisitos 0 <= x, x < y e 0 < k
     */
    public static double razaoAurea(final int x, final int y, final int k) {
        if (x < 0 || x > y || k <= 0) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }
        int t, c = y, a = x, i = 1;
        while (i <= k) {
            t = c;
            c += a;
            a = t;
            i++;
        }
        return c / a;
    }

    /**
     * Verifica se o número fornecido satisfaz a equação que define um quadrado
     * perfeito.
     *
     * @param n número a ser verificado
     *
     * @return True, caso o número satisfaça a equação, ou False, caso contrário.
     *
     * @throws IllegalArgumentException Caso o número seja menor que 1.
     */
    public static boolean quadradoPerfeito(final int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        int i = 1, s = 1;
        while (s < n) {
            i += 2;
            s += i;
        }
        return s == n;
    }

    /**
     * Calcula a raiz quadrada de um número n, com precisão fornecida de
     * acordo com o Método Babilônico.
     *
     * @param n número para cálculo da raiz quadrada
     * @param precisao numero inteiro
     *
     * @return Raiz quadrada do número n com precisão i.
     *
     * @throws IllegalArgumentException Caso n seja menor ou igual a 0.
     */
    public static double raizQuadrada(final int n, final int precisao) {
        if (n <= 0) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }
        int r = 1;
        int precisaoAuxiliar = precisao;
        while (0 <= precisaoAuxiliar) {
            r = (r + n / r) / 2;
            precisaoAuxiliar--;
        }
        return r;
    }

    /**
     * Verifica se o número fornecido é primo.
     *
     * @param n número a ser verificado.
     *
     * @return True caso o número seja primo, ou false, caso contrário.
     *
     * @throws IllegalArgumentException Caso n seja menor ou igual a 1.
     */
    public static boolean primo(final int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                return false;
            }
            i++;
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
     * @throws IllegalArgumentException Caso o temanho do vetor seja menor
     * ou igual a 1.
     */
    public static void crivoEratostenes(final int[] vetor, final int tamanho) {
        if (tamanho <= 1) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }
        Arrays.fill(vetor, 2, tamanho - 1, 0);

        int i = tamanho, multiplo;
        double limite = Math.sqrt(tamanho);
        while (i <= limite) {
            if (vetor[i] == 0) {
                multiplo = i + i;
                while (multiplo <= tamanho) {
                    vetor[multiplo] = 1;
                    multiplo = multiplo + i;
                }
            }
            i++;
        }
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
     * sequintes requisitos: segundoNumero <= primeiroNumero e 0 < segundoNumero.
     */
    public static int mdc(final int primeiroNumero, final int segundoNumero) {
        if (segundoNumero > primeiroNumero || segundoNumero <= 0) {
            throw new IllegalArgumentException("Argumento(s) inválidos!");
        }
        int m;
        int aux1 = primeiroNumero;
        int aux2 = segundoNumero;
        while (aux2 != 0) {
            m = primeiroNumero % segundoNumero;
            aux1 = aux2;
            aux2 = m;
        }
        return aux1;
    }

    /**
     * Calcula o Maior divisor comum entre dois inteiros fornecidos.
     * (Implementação alternativa)
     *
     * @param primeiroNumero primeiro número inteiro.
     * @param segundoNumero segundo número inteiro.
     *
     * @return Maior divisor comum entre os valores de a e b.
     *
     * @throws IllegalArgumentException  Caso os argumentos não atendam os
     *      * sequintes requisitos: segundoNumero <= primeiroNumero e 0 < segundoNumero.
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
     * @param x valor da incógnita para avaliação do polinômio.
     * @param grau grau do polinômio
     * @param coeficientes vetor com os coeficientes do polinômio.
     *
     * @return Resultado da somatória dos produtos e potências do polinômio.
     *
     * @throws IllegalArgumentException Caso o grau do polinômio seja menor
     * que 1.
     */
    public static int AvaliacaoPolinomialHorner(finaç int x, final int grau, final int[] coeficientes) {
        if (grau < 1) {
            throw new IllegalArgumentException("Número inválido!");
        }

        int p = coeficientes[grau];
        int i = grau - 1;

        while (0 <= i) {
            p = p * x + coeficientes[i];
            i--;
        }

        return p;
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
        }

        int i = 2;

        while (i <= n) {
            int t = c;
            c += a;
            a = t;
            i++;
        }

        return c;
    }

    /**
     * Valida CPF (Cadastro de Pessoas Físicas)
     *
     * @param cpf vetor contendo os dígitos do CPF a ser verificado.
     *
     * @return True caso o cpf informado seja válido, ou false, caso contrário.
     */
    public static boolean validaCPF(final int[] cpf) {
        int j = cpf[0] + 2 * cpf[1] + 3 * cpf[2] + 4 * cpf[3] + 5 * cpf[4] + 6 * cpf[5] + 7 * cpf[6]
                + 8 * cpf[7] + 9 * cpf[8];
        int k = cpf[1] + 2 * cpf[2] + 3 * cpf[3] + 4 * cpf[4] + 5 * cpf[5] + 6 * cpf[6] + 7 * cpf[7]
                + 8 * cpf[8] + 9 * cpf[9];
        int dj = (j % 11) % 10;
        int dk = (k % 11) % 10;
        return (dj == cpf[9] && dk == cpf[10]);
    }

    /**
     * Valida CPF (Cadastro de Pessoas Físicas) - Versão Alternativa
     *
     * @param cpf vetor contendo os dígitos do CPF a ser verificado.
     *
     * @return True caso o cpf informado seja válido, ou false, caso contrário.
     */
    public static boolean validaCPF2(final int[] cpf) {
        int c = 7, p = cpf[8], s = cpf[8];
        while (0 <= c) {
            p += cpf[c];
            s += p;
            c--;
        }
        int j = (s % 11) % 10;
        int k = ((s - p + 9 * cpf[9]) % 11) % 10;
        return (j == cpf[9]) && (k == cpf[10]);
    }
}
