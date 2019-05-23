class CPF2{

    //algoritmo 21 - Cadastro de Pessoas Físicas (CPF)
    public CPF2(int d[]) {
        int c = 7, p = d[8], s = d[8];
        while (0 <= c) {
            p += d[c];
            s += p;
            c--;
        }
        int j = (s % 11) % 10;
        int k = ((s - p + 9 * d[9]) % 11) % 10;
        return (j == d[9]) && (k == d[10]);
    }

}