class Mod{

    //Algoritmo 4 - Resto da Divisão Inteira
    public Mod(int x, int y) {
        if (y < 0 || x <= 0) {
            throw new IllegalArgumentException("Argumentos inválidos.");
        }
        int s = x;
        while (y <= s) {
            s -= y;
        }

        return s;
    }

}