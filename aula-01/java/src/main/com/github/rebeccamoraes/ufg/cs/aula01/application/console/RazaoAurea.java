class RazaoAurea{

    //Algoritmo 11 - Razão Áurea
    public RazaoAurea(int x, int y, int k) {
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

}