class Hoorner{

    //Algoritmo 18 - Regra de Horner para avaliação de polinômio
    public Horner(int x, int g, int a[]) {
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

}