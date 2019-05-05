class InvalidArgumentException extends Error {
    constructor(msg) {
        super("Argumento(s) inválido(s). " + msg);
    }
}

function validaArgumentoObrigatorio(argumento){
    if(argumento == null){
        throw new InvalidArgumentException("Valor nulo.");
    }
}

function validaArgumentoNumericoObrigatorio(numero){
    validaArgumentoObrigatorio(numero);
    if(isNaN(numero)){
        throw new InvalidArgumentException("Valor não numérico.");
    }
}

/**
 * Verifica se o argumento fornecido é um número que possui a propriedade 3025.
 *
 * @param {inteiro} n Número inteiro à ser verificado.
 *
 * @returns {boolean} Verdadeiro, caso o número possua a propriedade 3025, ou falso, caso contrário.
 */

function propriedade3025(n) {
    validaArgumentoNumericoObrigatorio(n);

    if (n < 0 || n > 9999) {
        throw new InvalidArgumentException("Número Inválido!");
    }

    if (n % 1 != 0) {
        throw new InvalidArgumentException("Número não é inteiro.");
    }

    const i = Math.floor(n / 100);
    const j = n % 100;

    return (i + j) * (i + j) == n;
}

/**
 	* Verifica se o argumento fornecido é um número que possui a propriedade 153, ou seja, a soma do quadrado de seus dígitos é igual a ele próprio.
 	*
	* @param {number} cdu Número inteiro à ser verificado.
	* 
	* @returns {boolean} Verdadeiro, caso o número possua a propriedade 3025, ou falso, caso contrário.
	*/
	
function propriedade153(cdu) {
    validaArgumentoNumericoObrigatorio(cdu);
    if (cdu < 100 || cdu > 999) {
        throw new InvalidArgumentException("Número Inválido!");
    }
    var c = Math.floor(cdu / 100);
    var du = cdu % 100;
    var d = Math.floor(du / 10);
    var u = du % 10;
    return (Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3)) == cdu;
}

 
function validaData(dia, mes, ano){
	if(dia == null || mes == null || ano == null){
		throw new InvalidArgumentException("Data inválida. Valor(es) nulo(s).");
	}
	if(isNaN(dia) || isNaN(mes) || isNaN(ano)){
		throw new InvalidArgumentException("Data inválida. Valor(es) não numérico(s).");
	}
	if(dia < 1 || dia > 31){
		throw new InvalidArgumentException("Dia inválido!");
	}
	if(mes < 1 || mes > 12){
		throw new InvalidArgumentException("Mês inválido!");
	}
	if(ano < 1753){
		throw new InvalidArgumentException("Ano inválido");
	}	
}

 /**
	* Define o dia da semana para uma data
	*
	* @param {inteiro} dia Número inteiro referente ao dia
	* @param {number} mes Número inteiro referente ao mês
	* @param {number} ano Número inteiro referente ao ano
	*
	* @returns {number} Número inteiro referente ao dia da semana correspondente à data fornecida.
	*
	*/
	
function diaDaSemana(dia, mes, ano) {
	validaData(dia, mes, ano);
	
    if (mes == 1 || mes == 2) {
        mes += 12;
        ano --;
    }
    
    let s = dia + 2 * mes + Math.floor(3 * (mes + 1) / 5) + ano + Math.floor(ano / 4) - Math.floor(ano / 100) + Math.floor(ano / 400);

    return s % 7;
}

function exibeNomeDiaDaSemana(s) {
    const nomes = [ "Segunda-feira", "Terça-feira", "Quarta-feira",
        "Quinta-feira", "Sexta-feira", "Sábado", "Domingo" ];

    console.log(nomes[s % 7]);
}

/**
 * Calcula o resto da divisão do "dividendo" pelo "divisor" informados.
 *
 * @param {inteiro} dividendo número a ser dividido.
 * @param {inteiro} divisor número pelo qual o dividendo será dividido.
 *
 * @returns {inteiro} Resto inteiro da divisão do divisor pelo dividendo.
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
	* @returns {inteiro} Número correspondente à soma dos n primeiros números naturais.
	*/
function somaNaturais(n) {
	validaArgumentoNumericoObrigatorio(n);
    if (n < 1) {
        throw new InvalidArgumentException("Número Inválido!");
    }
    var i = 2;
    var s = 1;
    while (i < n) {
        s += i;
        i++;
    }
    return s;
}

/**
	* Fatorial de um número n
	*
	* @param {inteiro} n número inteiro sobre o qual deseja-se obter o fatorial.
	*
	* @returns {inteiro} Número inteiro correspondente ao fatorial do número n.
	*/
function fatorial(n) {
	validaArgumentoNumericoObrigatorio(n);
    if (n < 1) {
        throw new InvalidArgumentException("Número inválido.");
    }
    var i = 2;
    var f = 1;
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
	* @returns {number} Número inteiro correspondente ao produto dos dois inteiros fornecidos.
	*/
function produto(a, b) {
	validaArgumentoNumericoObrigatorio(a);
	validaArgumentoNumericoObrigatorio(b);
    if (a < 0 || b < 0) {
        throw new InvalidArgumentException("Número(s) inválido(s).");
    }
    var totalParcelas = a;
    var parcela = b;
    if (b < a) {
        totalParcelas = b;
        parcela = a;
    }
    var i = 1;
    var s = 0;
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
	*/
function potencia(x, y) {
	validaArgumentoNumericoObrigatorio(x);
	validaArgumentoNumericoObrigatorio(y);
	
    if (x < 0 || y < 0) {
        throw new InvalidArgumentException("Número(s) inválido(s).");
    }
    var potencia = 1;
    var i = 1;
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
 	*/
function pi(n) {
	validaArgumentoNumericoObrigatorio(n);
	
    if (n < 1) {
        throw new InvalidArgumentException("Número inválido.");
    }
    var i = 1;
    var s = -1;
    var d = -1;
    var p = 0;
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
 	*/
function logaritmoNatural(n, k) {
	validaArgumentoNumericoObrigatorio(n);
	validaArgumentoNumericoObrigatorio(k);
    if (n < 1 || k < 2) {
        throw new InvalidArgumentException("Número(s) inválido(s).");
    }
    var i = 2;
    var e = 1 + n;
    var numerador = n;
    var denominador = 1;
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
 	*/
function razaoAurea(x, y, k) {
	validaArgumentoNumericoObrigatorio(x);
	validaArgumentoNumericoObrigatorio(y);
	validaArgumentoNumericoObrigatorio(k);
    if (x < 0 || x > y || k <= 0) {
        throw new InvalidArgumentException("Número(s) inválido(s).");
    }
    var c = y;
    var a = x;
    var i = 1;
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
  * @returns {boolean} Verdadeiro, caso o número fornecido seja um quadrado perfeito, ou falso, caso contrário.
 	*/
function quadradoPerfeito(n) {
	validaArgumentoNumericoObrigatorio(n);
    if (n < 1) {
        throw new InvalidArgumentException("Número inválido.");
    }
    var i = 1;
    var s = 1;
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
 	*/
function raizQuadrada(n, i) {
	validaArgumentoNumericoObrigatorio(n);
	validaArgumentoNumericoObrigatorio(i);
    if (n <= 0) {
        throw new InvalidArgumentException("Número(s) inválido(s).");
    }
    var r = 1;
    while (i > 0) {
        r = (r + n / r) / 2;
        i--;
    }
    return r;
}

/** 
	* Número Primo
	*
	* @param {inteiro} n número à ser verificado.
  *
  * @returns {boolean} Verdadeiro, caso o número seja primo, ou falso, caso contrário.
 	*/
function primo(n) {
  validaArgumentoNumericoObrigatorio(n);
    if (n <= 1) {
      throw new InvalidArgumentException("Número inválido.");
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
  * @param {vetor} a
  * @param {inteiro} n
  *
  * @returns {vetor} Vetor com as posições cujos índices são números primos marcadas com 0.
 	*/
function crivoEratostenes(a, n) {
	validaArgumentoNumericoObrigatorio(n);
    if (n <= 1) {
        throw new InvalidArgumentException("Argumento(s) inválido(s).");
    }
    var i = 2;
    var limite = Math.sqrt(n);
    while (i <= limite) {
        if (a[i] == 0) {
            var multiplo = i + i;
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
 	*/
function mdc(a, b) {
	validaArgumentoNumericoObrigatorio(a);
	validaArgumentoNumericoObrigatorio(b);
    if (b > a || b <= 0) {
        throw new InvalidArgumentException("Número(s) inválidos.");
    }
    while (b != 0) {
        var m = a % b;
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
 	*/
function mdc2(b, a) {
	validaArgumentoNumericoObrigatorio(a);
	validaArgumentoNumericoObrigatorio(b);
    if (b > a || b <= 0) {
        throw new InvalidArgumentException("Número(s) inválidos!");
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
 	*/
function horner(x, g, a) {
	validaArgumentoNumericoObrigatorio(x);
	validaArgumentoNumericoObrigatorio(g);
	validaArgumentoNumericoObrigatorio(a);
    if (g < 1) {
        throw new InvalidArgumentException("Número inválido.");
    }
    var p = a[g];
    var i = g - 1;
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
 	*/
function fibonacci(n) {
	validaArgumentoNumericoObrigatorio(n);
    if (n < 0) {
        throw new InvalidArgumentException("Número inválido.");
    }
    var a = 0;
    var c = 1;
    if (n == 0 || n == 1) {
        return n;
    }
    var i = 2;
    while (i <= n) {
        var t = c;
        c += a;
        a = t;
        i++;
    }
    return c;
}

/**
  * Cadastro de Pessoas Físicas (CPF)
  *
  * @param {vetor} d
  *
  * @return {boolean} Verdadeiro, caso o cpf informado seja válido, ou falso, caso contrário.
 	*/
function cpf(d) {
    var j = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6]
        + 8 * d[7] + 9 * d[8];
    var k = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7]
        + 8 * d[8] + 9 * d[9];
    var dj = (j % 11) % 10;
    var dk = (k % 11) % 10;
    return (dj == d[9] && dk == d[10]);
}

/**
  * Cadastro de Pessoas Físicas (CPF)
  *
  * @param {vetor} d
  *
  * @return {boolean} Verdadeiro, caso o cpf informado seja válido, ou falso, caso contrário.
 	*/
function cpf2(d) {
    var c = 7;
    var p = d[8];
    var s = d[8];
    while (0 <= c) {
        p += d[c];
        s += p;
        c--;
    }
    var j = (s % 11) % 10;
    var k = ((s - p + 9 * d[9]) % 11) % 10;
    return (j == d[9]) && (k == d[10]);
}

module.exports = { propriedade3025 : propriedade3025 };
