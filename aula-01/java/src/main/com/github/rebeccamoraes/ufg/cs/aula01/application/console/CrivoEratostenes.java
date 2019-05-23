class CrivoEratostenes{

    //Algoritmo 15 - Crivo de Eratóstenes
    public CrivoEratostenes(int a[], int n) {
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

}