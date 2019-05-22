class DiaDaSemana{

    public DiaDaSemana(int dia, int mes, int ano) {
        if ((dia < 1) || (dia > 31)) {
            throw new IllegalArgumentException("Dia inválido.");
        } else if ((mes < 1) || (mes > 12)) {
            throw new IllegalArgumentException("Mês inválido.");
        } else if (ano < 1753) {
            throw new IllegalArgumentException("Ano inválido.");
        }

        // TODO faça o equivalente no código em JS
        try {
            LocalDate.of(ano, mes, dia);
        } catch (DateTimeException excecao) {
            throw new IllegalArgumentException("data inválida", excecao);
        }

        if (mes == 1 || mes == 2) {
            mes += 12;
            ano += 1;
        }
        int s = dia + 2 * mes + (3 * (mes + 1)) / 5 + ano + ano / 4 - ano / 100 + ano / 400;
        return s % 7;
    }

}