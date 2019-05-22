class SomaNaturais{

    //Algoritmo 5 - Soma dos primeiros naturais
    public SomaNaturais(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Número Inválido!");
        }
        int i = 2;
        int s = 1;
        while (i <= n) {
            s += i;
            i++;
        }
        return s;
    }

}