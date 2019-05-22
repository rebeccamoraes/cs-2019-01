class Potencia{

    //Algoritmo 8 - Potência Usando Somas
    public Potencia(int x, int y) {
        if (x < 0 || y < 0) {
            throw new IllegalArgumentException("Argumento(s) inválido(s).");
        }
        int potencia = 1;
        int i = 1;
        while (i <= y) {
            potencia = produto(potencia, x);
            i++;
        }
        return potencia;
    }

}