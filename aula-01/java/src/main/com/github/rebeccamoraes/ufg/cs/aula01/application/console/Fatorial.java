class Fatorial{

    //Algoritmo 6 - Fatorial
    public Fatorial(int n) {
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

}