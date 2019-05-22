class Fibonacci{

    //algoritmo 19 - Fibonacci
    public Fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Número inválido!");
        }
        int a = 0;
        int c = 1;
        if (n == 0 || n == 1) {
            return n;
        }
        int i = 2;
        while (i <= n) {
            int t = c;
            c += a;
            a = t;
            i++;
        }
        return c;
    }

}