class CPF{

    //algoritmo 20 - Cadastro de Pessoas Físicas (CPF)
    public CPF(int d[]) {
        int j = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6]
                + 8 * d[7] + 9 * d[8];
        int k = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7]
                + 8 * d[8] + 9 * d[9];
        int dj = (j % 11) % 10;
        int dk = (k % 11) % 10;
        return (dj == d[9] && dk == d[10]);
    }

}