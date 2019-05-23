//Algoritmo 1 - Propriedade 3025
class propriedade3025{

    public Propriedade3025(int n) {
        if (n < 0 || n > 9999) {
            throw new IllegalArgumentException("Número Inválido!");
        }

        final int i = n / 100;
        final int j = n % 100;

        return ((i + j) * (i + j)) == n;
    }

}
