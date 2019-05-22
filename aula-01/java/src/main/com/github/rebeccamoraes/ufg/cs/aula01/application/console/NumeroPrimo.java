class NumeroPrimo{

    //Algoritmo 14 - Número Primo
    public NumeroPrimo(int n) {
        if (n <= 1) {
            throw new IllegalArgumentException("Número inválido.");
        }
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

}