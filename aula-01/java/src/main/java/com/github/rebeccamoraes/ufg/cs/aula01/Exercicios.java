package com.github.rebeccamoraes.ufg.cs.aula01;

import com.sun.tools.javac.comp.Todo;

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
    public static boolean propriedade3025(int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("Número Inválido!");
        }

        final int i = n / 100;
        final int j = n % 100;

        return ((i + j) * (i + j)) == n;
    }

    public static boolean propriedade153(int cdu) {
        if ((cdu < 100) || (cdu > 999)) {
            throw new IllegalArgumentException("Número Inválido!");
        }
        int c = cdu / 100;
        int du = cdu % 100;
        int d = du / 10;
        int u = du % 10;

        return (Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3)) == cdu;
    }

    // TODO nao seria melhor ano em vez de a?
    // TODO nao seria melhor mes em vez de m?
    // TODO não seria melhor dia em vez de d?

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
    public static int diaDaSemana(int d, int m, int a) {
        if ((d < 1) || (d > 31)) {
            throw new IllegalArgumentException("Dia inválido.");
        } else if ((m < 1) || (m > 12)) {
            throw new IllegalArgumentException("Mês inválido.");
        } else if (a < 1753) {
            throw new IllegalArgumentException("Ano inválido.");
        }

        // TODO faça o equivalente no código em JS
        try {
            LocalDate.of(a, m, d);
        } catch (DateTimeException excecao) {
            throw new IllegalArgumentException("data inválida", excecao);
        }

        if (m == 1 || m == 2) {
            m += 12;
            a += 1;
        }
        int s = d + 2 * m + (3 * (m + 1)) / 5 + a + a / 4 - a / 100 + a / 400;
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
    public static int mod(int x, int y) {
        if (y < 0 || x <= 0) {
            throw new IllegalArgumentException("Argumentos inválidos.");
        }
        int s = x;
        while (y <= s) {
            s -= y;
        }

        return s;
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
    public static int somaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número Inválido!");
        }
        int i = 2;
        int s = 1;
        while (i <= n) {
            s += i;
            i++;
        }
        return s;
    }

    /**
     * Calcula o fatorial de um numero n
     * @param n número inteiro sobre o qual deseja-se obter o fatorial.
     *
     * @return Número inteiro correspondente ao fatorial do número n.
     *
     * @throws IllegalArgumentException Caso o valor de n seja menor que 1.
     */
    public static int fatorial(int n) {
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
     * @param a primeiro número inteiro à ser multiplicado.
     * @param b segundo número inteiro à ser multiplicado.
     *
     * @return Número inteiro correspondente ao produto dos dois inteiros
     * fornecidos.
     *
     * @throws IllegalArgumentException Caso o valor de a ou de b seja menor
     * que zero.
     */
    public static int produto(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }
        int totalParcelas = a;
        int parcela = b;
        if (b < a) {
            totalParcelas = b;
            parcela = a;
        }
        int i = 1;
        int s = 0;
        while (i <= totalParcelas) {
            s += parcela;
            i++;
        }
        return s;
    }

    //TODO renomear x e y como base e expoente
    /**
     * Calcula potencia utilizando somas
     *
     * @param x número inteiro usado como base da potência.
     * @param y número inteiro usado como expoente da potência.
     *
     * @return Resultado da base  elevada ao expoente.
     *
     * @throws IllegalArgumentException Caso o valor da base ou do expoente
     * seja(m) menor(es) que zero.
     */
    public static int potencia(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }
        int potencia = 1;
        int i = 1;
        while (i <= y) {
            potencia = produto(potencia, x);
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
    public static double pi(int n) {
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
     * @param n expoente natural positivo
     * @param k número inteiro que define a quantidade de termos empregados
     *         pelo somatório (precisão).
     *
     * @return Logaritmo natural (e^n).
     *
     * @throws IllegalArgumentException Caso os argumentos não atendam as
     * seguintes exigências: 1 <= n e 2 <= k.
     */
    public static double logaritmoNatural(int n, int k) {
        if (n < 1 || k < 2) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }
        double e = 1 + n;
        int i = 2, numerador = n, denominador = 1;
        while (i <= k) {
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
    public static double razaoAurea(int x, int y, int k) {
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
    public static boolean quadradoPerfeito(int n) {
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

    //TODO renomear i para precisao
    /**
     * Calcula a raiz quadrada de um número n, com precisão fornecida de
     * acordo com o Método Babilônico.
     *
     * @param n número para cálculo da raiz quadrada
     * @param i precisão
     *
     * @return Raiz quadrada do número n com precisão i.
     *
     * @throws IllegalArgumentException Caso n seja menor ou igual a 0.
     */
    public static double raiz(int n, int i) {
        if (n <= 0) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }
        int r = 1;
        while (0 <= i) {
            r = (r + n / r) / 2;
            i++;
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
    public static boolean primo(int n) {
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
    // TODO renomear n para tamanho
    // TODO renomear a para vetor
    /**
     * Identifica os índices primos de um array até a n-ésima posição
     * fornecida, através do método de determinação de números primos
     * conhecido por Crivo de Eratostenes.
     *
     * @param a vetor cujos índices serão verificados.
     * @param n tamanho do vetor.
     *
     * @throws IllegalArgumentException Caso o temanho do vetor seja menor
     * ou igual a 1.
     */
    public static void crivoEratostenes(int a[], int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }
        Arrays.fill(a, 2, n - 1, 0);

        int i = n, multiplo;
        double limite = Math.sqrt(n);
        while (i <= limite) {
            if (a[i] == 0) {
                multiplo = i + i;
                while (multiplo <= n) {
                    a[multiplo] = 1;
                    multiplo = multiplo + i;
                }
            }
            i++;
        }
    }

    /**
     * Calcula o Maior divisor comum entre dois inteiros fornecidos.
     *
     * @param a primeiro número inteiro.
     * @param b segundo número inteiro.
     *
     * @return Maior divisor comum entre os valores de a e b.
     *
     * @throws IllegalArgumentException  Caso os argumentos não atendam os
     * sequintes requisitos: b <= a e 0 < b.
     */
    public static int mdc(int a, int b) {
        if (b > a || b <= 0) {
            throw new IllegalArgumentException("Argumento(s) inválidos!");
        }
        int m;
        while (b != 0) {
            m = a % b;
            a = b;
            b = m;
        }
        return a;
    }

    /**
     * Calcula o Maior divisor comum entre dois inteiros fornecidos.
     * (Implementação alternativa)
     *
     * @param a primeiro número inteiro.
     * @param b segundo número inteiro.
     *
     * @return Maior divisor comum entre os valores de a e b.
     *
     * @throws IllegalArgumentException  Caso os argumentos não atendam os
     * sequintes requisitos: b <= a e 0 < b.
     */
    public static int mdc2(int a, int b) {
        if (b > a || b <= 0) {
            throw new IllegalArgumentException("Argumento(s) inválidos!");
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }

    //TODO alterar nome do método para AvaliacaoPolinomialHorner
    //TODO renomear g para grau
    /**
     * Avalia um polinômio de acordo com a Regra de Horner.
     *
     * @param x valor da incógnita para avaliação do polinômio.
     * @param g grau do polinômio
     * @param a vetor com os coeficientes do polinômio.
     *
     * @return Resultado da somatória dos produtos e potências do polinômio.
     *
     * @throws IllegalArgumentException Caso o grau do polinômio seja menor
     * que 1.
     */
    public static int horner(int x, int g, int a[]) {
        if (g < 1) {
            throw new IllegalArgumentException("Número inválido!");
        }
        int p = a[g];
        int i = g - 1;
        while (0 <= i) {
            p = p * x + a[i];
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
    public static int fibonacci(int n) {
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
     * @param d vetor contendo os dígitos do CPF a ser verificado.
     *
     * @return True caso o cpf informado seja válido, ou false, caso contrário.
     */
    public static boolean cpf(int d[]) {
        int j = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6]
                + 8 * d[7] + 9 * d[8];
        int k = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7]
                + 8 * d[8] + 9 * d[9];
        int dj = (j % 11) % 10;
        int dk = (k % 11) % 10;
        return (dj == d[9] && dk == d[10]);
    }

    /**
     * Valida CPF (Cadastro de Pessoas Físicas) - Versão Alternativa
     *
     * @param d vetor contendo os dígitos do CPF a ser verificado.
     *
     * @return True caso o cpf informado seja válido, ou false, caso contrário.
     */
    public static boolean cpf2(int d[]) {
        int c = 7, p = d[8], s = d[8];
        while (0 <= c) {
            p += d[c];
            s += p;
            c--;
        }
        int j = (s % 11) % 10;
        int k = ((s - p + 9 * d[9]) % 11) % 10;
        return (j == d[9]) && (k == d[10]);
    }
}
