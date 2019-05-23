class MDC{

    //Algoritmo 16 - Maior Divisor Comum
    public MDC(int a, int b) {
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

}