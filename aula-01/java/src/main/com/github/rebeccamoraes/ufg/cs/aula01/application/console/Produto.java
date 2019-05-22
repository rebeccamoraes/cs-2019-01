class Produto{

    //Algoritmo 7 - Produto de Inteiros Usando Somas
    public Produto(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }
        int totalParcelas = a;
        int parcela = b;
        if (b < a) {
            totalParcelas = b;
            parcela = a;
        }
        int i = 1;
        int s = 0;
        while (i <= totalParcelas) {
            s += parcela;
            i++;
        }
        return s;
    }

}