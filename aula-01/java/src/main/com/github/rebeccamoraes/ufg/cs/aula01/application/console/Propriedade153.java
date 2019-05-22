class Propriedade153{
    public Propriedade153(int cdu) {
        if ((cdu < 100) || (cdu > 999)) {
            throw new IllegalArgumentException("Número Inválido!");
        }
        int c = cdu / 100;
        int du = cdu % 100;
        int d = du / 10;
        int u = du % 10;

        return (Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3)) == cdu;
    }
}