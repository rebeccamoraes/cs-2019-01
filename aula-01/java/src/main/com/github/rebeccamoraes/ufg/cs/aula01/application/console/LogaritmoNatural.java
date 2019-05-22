class LogaritmoNatural{

    //Algoritmo 10 - Logaritmo Natural
    public LogaritmoNatural(int n, int k) {
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

}