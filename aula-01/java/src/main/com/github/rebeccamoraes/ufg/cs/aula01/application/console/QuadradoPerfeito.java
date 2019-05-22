class QuadradoPerfeito{

    //Algoritmo 12 - Quadrado Perfeito
    public QuadradoPerfeito(int n) {
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

}