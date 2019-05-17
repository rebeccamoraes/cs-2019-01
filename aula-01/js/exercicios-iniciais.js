class InvalidArgumentException extends Error {
    constructor(msg) {
        super("Argumento(s) inválido(s). " + msg);
    }
}

/**
 * Valida um argumento obrigatório.
 *
 * @throws {InvalidArgumentException} Caso o argumento seja nulo.
 */
function validaArgumentoObrigatorio(argumento){
    if(argumento == null){
        throw new InvalidArgumentException("Valor nulo.");
    }
}

/**
 * Valida um argumento numérico obrigatório.
 *
 * @throws {InvalidArgumentException} Caso o argumento seja nulo.
 * @throws {InvalidArgumentException} Caso o valor do argumento não seja
 * numérico.
 */
function validaArgumentoNumericoObrigatorio(numero){
    validaArgumentoObrigatorio(numero);
    if(isNaN(numero)){
        throw new RangeError("Valor não numérico.");
    }
}

/**
 * Verifica se o argumento é um número inteiro.
 *
 * @throws {TypeError} Caso o número não seja inteiro.
 */
function validaInteiro(numero) {
    if(numero%1 !== 0){
        throw new TypeError("Número não inteiro.");
    }
}

/**
 * Verifica se o argumento fornecido é um número que possui a propriedade 3025.
 *
 * @param {inteiro} n Número inteiro à ser verificado.
 *
 * @returns {boolean} Verdadeiro, caso o número possua a propriedade 3025, ou
 * falso, caso contrário.
 *
 * @throws {RangeError} Lança RangeError caso o valor do parâmetro não seja
 * numérico.
 * @throws {RangerError} Lança RangeError caso o valor do parâmetro seja menor
 * que 0 ou maior que 9999.
 */
function propriedade3025(n) {
    validaArgumentoNumericoObrigatorio(n);
    validaInteiro(n);
    if (n < 0 || n > 9999) {
        throw new RangeError("Número Inválido!");
    }

    const i = Math.floor(n / 100);
    const j = n % 100;

    return (i + j) * (i + j) == n;
}

/**
 * Verifica se o argumento fornecido é um número que possui a propriedade
 * 153, ou seja, a soma do cubo de seus dígitos é igual a ele próprio.
 * @param {number} cdu Número inteiro à ser verificado.
 *
 * @returns {boolean} Verdadeiro, caso o número possua a propriedade 153, ou
 * falso, caso contrário.
 *
 * @throws {InvalidArgumentException} Caso o argumento seja nulo.
 * @throws {InvalidArgumentException} Caso o valor do argumento não seja
 * numérico.
 * @throws {RangeError} Caso o argumento cdu seja menor que 100 ou maior que
 * 999.
 */
function propriedade153(cdu) {
    validaArgumentoNumericoObrigatorio(cdu);
    validaInteiro(cdu);
    if (cdu < 100 || cdu > 999) {
        throw new RangeError("Número Inválido!");
    }
    let c = Math.floor(cdu / 100);
    let du = cdu % 100;
    let d = Math.floor(du / 10);
    let u = du % 10;
    return (Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3)) == cdu;
}

/**
 * Valida uma data
 *
 * @param {number} dia Número inteiro referente ao dia
 * @param {number} mes Número inteiro referente ao mês
 * @param {number} ano Número inteiro referente ao ano
 *
 * @throws {InvalidArgumentException} Caso dia, mês ou ano seja(m) nulo(s).
 * @throws {TypeError} Caso dia, mês ou ano não seja(m) valore(s) numérico(s).
 * @throws {InvalidArgumentException} Caso valor de dia seja menor que 1 ou
 * maior que 31.
 * @throws {InvalidArgumentException} Caso valor de mes seja menor que 1 ou
 * maior que 12.
 * @throws {InvalidArgumentException} Caso valor de ano seja menor que 1753.
*/
function validaData(dia, mes, ano){
    if(dia == null || mes == null || ano == null){
        throw new InvalidArgumentException("Data inválida. Valor(es) nulo(s).");
    }

    if(isNaN(dia) || isNaN(mes) || isNaN(ano)){
        throw new TypeError("Data inválida. Valor(es) não numérico(s).");
    }

    validaInteiro(dia);
    validaInteiro(mes);
    validaInteiro(ano);

    if(dia < 1 || dia > 31){
        throw new RangeError("Dia inválido!");
    }
    if(mes < 1 || mes > 12){
        throw new RangeError("Mês inválido!");
    }
    if(ano < 1753){
        throw new RangeError("Ano inválido");
    }	
}

/**
 * Define o dia da semana para uma data
 *
 * @param {number} dia Número inteiro referente ao dia
 * @param {number} mes Número inteiro referente ao mês
 * @param {number} ano Número inteiro referente ao ano
 *
 * @returns {number} Número inteiro referente ao dia da semana correspondente
 * à data fornecida.
 *
 * @throws {InvalidArgumentException} Caso dia, mês ou ano seja(m) nulo(s).
 * @throws {TypeError} Caso dia, mês ou ano não seja(m) valore(s) numérico(s).
 * @throws {InvalidArgumentException} Caso valor de dia seja menor que 1 ou
 * maior que 31.
 * @throws {InvalidArgumentException} Caso valor de mes seja menor que 1 ou
 * maior que 12.
 * @throws {InvalidArgumentException} Caso valor de ano seja menor que 1753.
 */
function diaDaSemana(dia, mes, ano) {
    validaData(dia, mes, ano);
	
    if (mes == 1 || mes == 2) {
        mes += 12;
        ano --;
    }
    
    let s = dia + 2 * mes + Math.floor(3 * (mes + 1) / 5) + ano
    + Math.floor(ano / 4) - Math.floor(ano / 100) + Math.floor(ano / 400);

    return s % 7;
}

/**
 * Exibe o nome do dia da semana de acordo com a posição informada.
 */

function exibeNomeDiaDaSemana(s) {
    const nomes = [ "Segunda-feira", "Terça-feira", "Quarta-feira",
        "Quinta-feira", "Sexta-feira", "Sábado", "Domingo" ];

    console.log(nomes[s % 7]);
}

/**
 * Calcula o resto da divisão do "dividendo" pelo "divisor" informados.
 *
 * @param {number} dividendo número a ser dividido.
 * @param {number} divisor número pelo qual o dividendo será dividido.
 *
 * @returns {inteiro} Resto inteiro da divisão do divisor pelo dividendo.
 *
 * @throws {InvalidArgumentException} Caso o dividendo ou o divisor seja(m)
 * nulo(s).
 * @throws {InvalidArgumentException} Caso o valor do dividendo ou o divisor
 * não seja(m) numéricos.
 */
function mod(dividendo, divisor) {
    validaArgumentoNumericoObrigatorio(dividendo);
    validaArgumentoNumericoObrigatorio(divisor);
	
    if (dividendo < 0 || divisor <= 0 ) {
        throw new InvalidArgumentException("Argumentos inválidos.");
    }

    let resto = dividendo;
    
    while (resto >= divisor) {
        resto = resto - divisor;
    }

    return resto;
}

/**
 * Soma dos N primeiros números naturais
 *
 * @param {inteiro} n quantidade de números à serem somados.
 *
 * @returns {inteiro} Número correspondente à soma dos n primeiros números
 * naturais.
 * @throws {InvalidArgumentException} Caso n seja nulo.
 * @throws {InvalidArgumentException} Caso o valor de n não seja numérico.
 */
function somaNaturais(n) {
    validaArgumentoNumericoObrigatorio(n);
    validaInteiro(n);
    if (n < 1) {
        throw new RangeError("Número Inválido!");
    }
    let i = 2;
    let soma = 1;
    while (i < n) {
        soma += i;
        i++;
    }
    return soma;
}

/**
 * Fatorial de um número n
 *
 * @param {inteiro} n número inteiro sobre o qual deseja-se obter o fatorial.
 *
 * @returns {inteiro} Número inteiro correspondente ao fatorial do número n.
 * @throws {InvalidArgumentException} Caso o n seja nulo.
 * @throws {InvalidArgumentException} Caso o valor de n não seja numérico.
 */
function fatorial(n) {
    validaArgumentoNumericoObrigatorio(n);
    validaInteiro(n);
    if (n < 1) {
        throw new RangeError("Número inválido.");
    }
    let i = 2;
    let f = 1;
    while (i <= n) {
        f *= i;
        i++;
    }
    return f;
}
/**
 * Produto de Inteiros Usando Somas
 *
 * @param {inteiro} a primeiro número inteiro à ser multiplicado.
 * @param {inteiro} b segundo número inteiro à ser multiplicado.
 *
 * @returns {number} Número inteiro correspondente ao produto dos dois
 * inteiros fornecidos.
 *
 * @throws {InvalidArgumentException} Caso a ou b seja(m) nulo(s).
 * @throws {InvalidArgumentException} Caso o valor de a ou b não seja(m)
 * numérico(s).
 */
function produto(a, b){
    validaArgumentoNumericoObrigatorio(a);
    validaArgumentoNumericoObrigatorio(b);
    if (a < 0 || b < 0) {
        throw new RangeError("Número(s) inválido(s).");
    }
    let totalParcelas = a;
    let parcela = b;
    if (b < a) {
        totalParcelas = b;
        parcela = a;
    }
    let i = 1;
    let s = 0;
    while (i <= totalParcelas) {
        s += parcela;
        i++;
    }
    return s;
}
/**
 * Potência Usando Somas
 *
 * @param {inteiro} x número inteiro usado como base da potência.
 * @param {inteiro} y número inteiro usado como expoente da potência.
 *
 * @returns {inteiro} Resultado do número x elevado a y.
 *
 * @throws {InvalidArgumentException} Caso x ou y seja(m) nulo(s).
 * @throws {InvalidArgumentException} Caso o valor de x ou y não seja(m)
 * numérico(s).
 */
function potencia(x, y) {
    validaArgumentoNumericoObrigatorio(x);
    validaArgumentoNumericoObrigatorio(y);
	
    if (x < 0 || y < 0) {
        throw new RangeError("Número(s) inválido(s).");
    }
    let potencia = 1;
    let i = 1;
    while (i <= y) {
        potencia = produto(potencia, x);
    }
    return potencia;
}

/**
 * Valor de PI
 *
 * @param {inteiro} n
 *
 * @returns {decimal} Valor de PI, com precisão n.
 *
 * @throws {InvalidArgumentException} Caso o argumento n seja nulo.
 * @throws {InvalidArgumentException} Caso o valor do argumento n não seja
 * numérico.
 */
function pi(n) {
    validaArgumentoNumericoObrigatorio(n);
	
    if (n < 1) {
        throw new RangeError("Número inválido.");
    }
    let i = 1;
    let s = -1;
    let d = -1;
    let p = 0;
    while (i <= n) {
        d += 2;
        s *= -1;
        p = p + 4 * s / d;
        i++;
    }
    return p;
}

/**
 * Logaritmo Natural
 *
 * @param {inteiro} n
 * @param {inteiro} k
 *
 * @returns {decimal} Logaritmo natual
 *
 * @throws {InvalidArgumentException} Caso n ou k seja(m) nulo(s).
 * @throws {InvalidArgumentException} Caso o(s) valor(es) de n ou k não seja(m)
 * numérico(s).
 */
function logaritmoNatural(n, k) {
    validaArgumentoNumericoObrigatorio(n);
    validaArgumentoNumericoObrigatorio(k);
    if (n < 1 || k < 2) {
        throw new RangeError("Número(s) inválido(s).");
    }
    let i = 2;
    let e = 1 + n;
    let numerador = n;
    let denominador = 1;
    while (i <= k) {
        numerador *= numerador;
        denominador *= i;
        e += numerador / denominador;
        i++;
    }
    return e;
}

/**
 * Razão Áurea
 *
 * @param {inteiro} x
 * @param {inteiro} y
 * @param {inteiro} k
 *
 * @returns {decimal} Razão áurea obtida através dos números fornecidos.
 *
 * @throws {InvalidArgumentException} Caso x, y ou k seja(m) nulo(s).
 * @throws {InvalidArgumentException} Caso o(s) valor(es) x, y ou k não seja(m)
 * numérico(s).
 */
function razaoAurea(x, y, k) {
    validaArgumentoNumericoObrigatorio(x);
    validaArgumentoNumericoObrigatorio(y);
    validaArgumentoNumericoObrigatorio(k);
    if (x < 0 || x > y || k <= 0) {
        throw new RangeError("Número(s) inválido(s).");
    }
    let c = y;
    let a = x;
    let i = 1;
    while (i <= k) {
        let t = c;
        c += a;
        a = t;
        i++;
    }
    return c / a;
}

/**
 * Quadrado Perfeito
 *
 * @param {inteiro} n
 *
 * @returns {boolean} Verdadeiro, caso o número fornecido seja um quadrado
 * perfeito, ou falso, caso contrário.
 *
 * @throws {InvalidArgumentException} Caso o argumento n seja nulo.
 * @throws {InvalidArgumentException} Caso o valor do argumento n não seja
 * numérico.
 */
function quadradoPerfeito(n) {
    validaArgumentoNumericoObrigatorio(n);
    if (n < 1) {
        throw new RangeError("Número inválido.");
    }
    let i = 1;
    let s = 1;
    while (s < n) {
        i += 2;
        s += i;
    }
    return (s == n);
}

/**
 * Raiz Quadrada
 *
 * @param {inteiro} n
 * @param {inteiro} i grau de precisão desejado.
 *
 * @returns {decimal} Raiz quadrada do número n, com a precisão informada.
 *
 * @throws {InvalidArgumentException} Caso n ou i seja(m) nulo(s).
 * @throws {InvalidArgumentException} Caso o(s) valor(es) de x ou i não seja(m)
 * numérico(s).
 * @throws {RangeError} Caso n seja menor ou igual a 0.
 */
function raizQuadrada(n, i) {
    validaArgumentoNumericoObrigatorio(n);
    validaArgumentoNumericoObrigatorio(i);
    if (n <= 0) {
        throw new RangeError("Número(s) inválido(s).");
    }
    let r = 1;
    while (i > 0) {
        r = (r + n / r) / 2;
        i--;
    }
    return r;
}

/** 
 * Verifica se o número fornecido é primo.
 *
 * @param {inteiro} n número à ser verificado.
 *
 * @returns {boolean} Verdadeiro, caso o número seja primo, ou falso, caso contrário.
 *
 * @throws {InvalidArgumentException} Caso o argumento n seja nulo.
 * @throws {InvalidArgumentException} Caso o valor do argumento n não seja
 * numérico.
 * @throws {RangeError} Caso n seja menor ou igual a 0.
 */
function primo(n) {
    validaArgumentoNumericoObrigatorio(n);
    if (n <= 1) {
        throw new RangeError("Número inválido.");
    }
    let i = 2;
    while (i < n) {
        if (n % i == 0) {
            return false;
        }
        i++;
    }
    return true;
}

/**
 * Crivo de Eratóstenes
 *
 * @param {Array} a
 * @param {inteiro} n
 *
 * @returns {Array} Array com as posições cujos índices são números primos marcadas com 0.
 *
 * @throws {InvalidArgumentException} Caso o argumento n seja nulo.
 * @throws {InvalidArgumentException} Caso o valor do argumento n não seja
 * numérico.
 * @throws {RangeError} Caso n seja menor ou igual a 0.
 */
function crivoEratostenes(a, n) {
    validaArgumentoNumericoObrigatorio(n);
    if (n <= 1) {
        throw new RangeError("Argumento inválido.");
    }
    let i = 2;
    let limite = Math.sqrt(n);
    while (i <= limite) {
        if (a[i] == 0) {
            let multiplo = i + i;
            while (multiplo <= n) {
                a[multiplo] = 1;
                multiplo = multiplo + i;
            }
        }
        i++;
    }
    return a;
}

/**
 * Maior Divisor Comum
 *
 * @param {inteiro} a número inteiro
 * @param {inteiro} b número inteiro
 *
 * @returns {inteiro} Maior divisor comum entre os inteiros fornecidos.
 * @throws {InvalidArgumentException} Caso a ou b seja(m) nulo(s).
 * @throws {InvalidArgumentException} Caso o(s) valor(es) de a ou b não seja(m)
 * numérico(s).
 * @throws {RangeError} Caso b seja maior que a, ou caso b seja menor ou igual a 0.
 */
function mdc(a, b) {
    validaArgumentoNumericoObrigatorio(a);
    validaArgumentoNumericoObrigatorio(b);
    if (b > a || b <= 0) {
        throw new RangeError("Número(s) inválidos.");
    }
    while (b != 0) {
        let m = a % b;
        a = b;
        b = m;
    }
    return a;
}

/**
 * Maior Divisor Comum
 *
 * @param {inteiro} a número inteiro
 * @param {inteiro} b número inteiro
 *
 * @returns {inteiro} Maior divisor comum entre os inteiros fornecidos.
 *
 * @throws {InvalidArgumentException} Caso a ou b seja(m) nulo(s).
 * @throws {InvalidArgumentException} Caso o(s) valor(es) de a ou b não seja(m)
 * numérico(s).
 * @throws {RangeError} Caso b seja maior que a, ou caso b seja menor ou igual a 0.
 */
function mdc2(b, a) {
    validaArgumentoNumericoObrigatorio(a);
    validaArgumentoNumericoObrigatorio(b);
    if (b > a || b <= 0) {
        throw new RangeError("Número(s) inválidos!");
    }
    while (a != b) {
        if (a > b) {
            a -= b;
        } else {
            b -= a;
        }
    }
    return a;
}

/**
 * Regra de Horner para avaliação de polinômio
 *
 * @param {inteiro} n
 * @param {inteiro} g
 * @param {decimal} a
 *
 * @returns {number}
 *
 * @throws {InvalidArgumentException} Caso x ou g seja(m) nulo(s).
 * @throws {InvalidArgumentException} Caso o(s) valor(es) de x ou g não seja(m)
 * numérico(s).
 * @throws {RangeError} Caso g seja menor que 1.
 */
function horner(x, g, a) {
    validaArgumentoNumericoObrigatorio(x);
    validaArgumentoNumericoObrigatorio(g);
    if (g < 1) {
        throw new RangeError("Número inválido.");
    }
    let p = a[g];
    let i = g - 1;
    while (0 <= i) {
        p = p * x + a[i];
        i--;
    }
    return p;
}

/**
 * Fibonacci
 *
 * @param {inteiro} n
 *
 * @returns {inteiro} n-ésimo número de Fibonacci.
 *
 * @throws {InvalidArgumentException} Caso o argumento n seja nulo.
 * @throws {InvalidArgumentException} Caso o valor do argumento n não seja
 * numérico.
 */
function fibonacci(n) {
    validaArgumentoNumericoObrigatorio(n);
    if (n < 0) {
        throw new RangeError("Número inválido.");
    }
    let a = 0;
    let c = 1;
    if (n == 0 || n == 1) {
        return n;
    }
    let i = 2;
    while (i <= n) {
        let t = c;
        c += a;
        a = t;
        i++;
    }
    return c;
}

/**
 * Verificação de CPF (Cadastro de Pessoas Físicas)
 *
 * @param {Array} d
 *
 * @return {boolean} Verdadeiro, caso o cpf informado seja válido, ou falso, caso contrário.
 */
function cpf(d) {
    let j = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6]
        + 8 * d[7] + 9 * d[8];
    let k = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7]
        + 8 * d[8] + 9 * d[9];
    let dj = (j % 11) % 10;
    let dk = (k % 11) % 10;
    return (dj == d[9] && dk == d[10]);
}

/**
 * Implementação alternativa de verificação de CPF (Cadastro de Pessoas Físicas)
 *
 * @param {Array} d
 *
 * @return {boolean} Verdadeiro, caso o cpf informado seja válido, ou falso, caso contrário.
 */
function cpf2(d) {
    let c = 7;
    let p = d[8];
    let s = d[8];
    while (0 <= c) {
        p += d[c];
        s += p;
        c--;
    }
    let j = (s % 11) % 10;
    let k = ((s - p + 9 * d[9]) % 11) % 10;
    return (j == d[9]) && (k == d[10]);
}

module.exports = {
    propriedade3025 : propriedade3025,
    propriedade153 : propriedade153,
    diaDaSemana : diaDaSemana,
    mod : mod,
    produto : produto,
    potencia : potencia,
    pi : pi,
    somaNaturais : somaNaturais,
    fatorial : fatorial,
    primo : primo,
    logaritmoNatural : logaritmoNatural,
    razaoAurea : razaoAurea,
    quadradoPerfeito : quadradoPerfeito,
    raizQuadrada : raizQuadrada,
    crivoEratostenes : crivoEratostenes,
    mdc : mdc,
    mdc2 : mdc2,
    fibonacci : fibonacci,
    horner : horner,
    cpf : cpf,
    cpf2 : cpf2
};
