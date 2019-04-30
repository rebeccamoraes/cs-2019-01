package com.github.rebeccamoraes.ufg.cs.aula01;

import java.util.Arrays;

public class Exercicios {
    public static void main(String[] args) {
        System.out.println("Isso NAO É um teste!");
        System.out.println("Propriedade 3025 do número 3025 :" + propriedade3025(3025));
        //System.out.println("Propriedade 3025 do número 10000 :" + propriedade3025(10000));
        System.out.println("Propriedade 153 do número 153 :" + propriedade153(153));
        System.out.println("Dia da semana: " + diaDaSemana(26, 4, 2019));
        System.out.println("Resto 10/6: " + mod(10, 6));
        System.out.println("Soma dos 13 primeiros numeros naturais: " + somaNaturais(13));
        System.out.println("Fatorial de 6: " + fatorial(6));
        System.out.println("Produto de 7 e 9: " + produto(7, 9));
        System.out.println("Potencia 2 ^ 10: " + potencia(2, 10));
        System.out.println("Valor de pi(10): " + pi(10));
    }

    /**
     * Verifica se o inteiro fornecido satisfaz a propriedade 3025
     * (algoritmo 1).
     *
     * @param n O número inteiro a ser verificado.
     *
     * @return {@code true} se e somente se o número satisfaz a propriedade
     * 3025.
     *
     * @throws IllegalArgumentException Se o número fornecido está fora da
     * faixa admitida, ou seja, negativo ou maior que 9999.
     */
    public static boolean propriedade3025(int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("Número Inválido!");
        }
        int i = n / 100;
        int j = n % 100;
        return Math.pow(i + j, 2) == n;
    }

    //Algoritmo 2 - Propriedade 153
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

    //Algoritmo 3 - Dia da Semana
    public static int diaDaSemana(int d, int m, int a) {
        if ((d < 1) || (d > 31)) {
            throw new IllegalArgumentException("Dia inválido.");
        } else if ((m < 1) || (m > 12)) {
            throw new IllegalArgumentException("Mês inválido.");
        } else if (a < 1753) {
            throw new IllegalArgumentException("Ano inválido.");
        }
        if (m == 1 || m == 2) {
            m += 12;
            a += 1;
        }
        int s = d + 2 * m + (3 * (m + 1)) / 5 + a + a / 4 - a / 100 + a / 400;
        return s % 7;
    }

    //Algoritmo 4 - Resto da Divisão Inteira
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

    //Algoritmo 5 - Soma dos primeiros naturais
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

    //Algoritmo 6 - Fatorial
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

    //Algoritmo 7 - Produto de Inteiros Usando Somas
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

    //Algoritmo 8 - Potência Usando Somas
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

    //Algoritmo 9 -Valor de PI
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

    //Algoritmo 10 - Logaritmo Natural
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

    //Algoritmo 11 - Razão Áurea
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

    //Algoritmo 12 - Quadrado Perfeito
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

    //Algoritmo 13 - Raiz Quadrada
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

    //Algoritmo 14 - Número Primo
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

    //Algoritmo 15 - Crivo de Eratóstenes
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

    //Algoritmo 16 - Maior Divisor Comum
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

    //Algoritmo 17 - Maior Divisor Comum
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

    //Algoritmo 18 - Regra de Horner para avaliação de polinômio
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

    //algoritmo 19 - Fibonacci
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

    //algoritmo 20 - Cadastro de Pessoas Físicas (CPF)
    public static boolean cpf(int d[]) {
        int j = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6]
                + 8 * d[7] + 9 * d[8];
        int k = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7]
                + 8 * d[8] + 9 * d[9];
        int dj = (j % 11) % 10;
        int dk = (k % 11) % 10;
        return (dj == d[9] && dk == d[10]);
    }

    //algoritmo 21 - Cadastro de Pessoas Físicas (CPF)
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
