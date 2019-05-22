class Pi{

    //Algoritmo 9 -Valor de PI
    public Pi(int n) {
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

}