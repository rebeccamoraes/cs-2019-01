class RaizQuadrada{

    //Algoritmo 13 - Raiz Quadrada
    public RaizQuadrada(int n, int i) {
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

}