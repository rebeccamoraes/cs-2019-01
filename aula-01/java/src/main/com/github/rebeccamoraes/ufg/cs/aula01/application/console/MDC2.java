class MDC2{

    //Algoritmo 17 - Maior Divisor Comum
    public MDC2(int a, int b) {
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

}