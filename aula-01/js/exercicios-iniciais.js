class InvalidArgumentException extends Error {
    constructor(msg) {
        super(msg);
    }
}

function propriedade3025(n) {
    if (n == null || isNaN(n)) {
        throw new InvalidArgumentException("argumento nao pode ser null");
    }

    if (n < 0 || n > 9999) {
        throw new InvalidArgumentException("Número Inválido!");
    }

    const i = Math.floor(n / 100);
    const j = n % 100;

    return (i + j) * (i + j) == n;
}

//Algoritmo 2 - Propriedade 153
function propriedade153(cdu) {
    if ((cdu < 100) || (cdu > 999) || isNaN(n)) {
        throw new InvalidArgumentException("Número Inválido!");
    }
    var c = Math.floor(cdu / 100);
    var du = cdu % 100;
    var d = Math.floor(du / 10);
    var u = du % 10;
    return (Math.pow(c, 3) + Math.pow(d, 3) + Math.pow(u, 3)) == cdu;
}


function dataInvalida(dia, mes, ano){
	if(isNaN(dia) || (dia<1) || (dia>31)
	|| (mes<1) || (mes>12) || isNaN(mes)
	|| ano < 1753 || isNaN(ano)){
		return true;
	}else{
		return false;
	}	
}

//Algoritmo 3 - Dia da Semana
function diaDaSemana(d, m, a) {
    if ((d < 1) || (d > 31) || isNaN(d)) {
        throw new InvalidArgumentException("Dia inválido!");
    } else if ((m < 1) || (m > 12) || isNaN(m)) {
        throw new InvalidArgumentException("Mês inválido!");
    } else if (a < 1753 || isNaN(a)) {
        throw new InvalidArgumentException("Ano inválido");
    }
    if (m == 1 || m == 2) {
        m += 12;
        a--;
    }
    s = d + 2 * m + Math.floor(3 * (m + 1) / 5) + a + Math.floor(a / 4) - Math.floor(a / 100) + Math.floor(a / 400);
    switch (s % 7) {
        case 0:
            console.log("Segunda-feira");
            break;
        case 1:
            console.log("Terça-feira");
            break;
        case 2:
            console.log("Quarta-feira");
            break;
        case 3:
            console.log("Quinta-feira");
            break;
        case 4:
            console.log("Sexta-feira");
            break;
        case 5:
            console.log("Sábado");
            break;
        case 6:
            console.log("Domingo");
            break;
    }
    return s % 7;
}

//Algoritmo 4 - Resto da Divisão Inteira
function mod(x, y) {
    if (y < 0 || x <= 0 || isNaN(x) || isNaN(y)) {
        throw new InvalidArgumentException("Argumentos inválidos.");
    }
    var s = x;
    while (y <= s) {
        s -= y;
    }
    return s;
}

//Algoritmo 5 - Soma dos primeiros naturais
function somaNaturais(n) {
    if (n < 1 || isNaN(n)) {
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

//Algoritmo 6 - Fatorial
function fatorial(n) {
    if (n < 1 || isNaN(n)) {
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

//Algoritmo 7 - Produto de Inteiros Usando Somas
function produto(a, b) {
    if (a < 0 || b < 0 || isNaN(n)) {
        throw new InvalidArgumentException("Argumento(s) inválido(s).");
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

//Algoritmo 8 - Potência Usando Somas
function potencia(x, y) {
    if (x < 0 || y < 0 || isNaN(n)) {
        throw new InvalidArgumentException("Argumento(s) inválido(s).");
    }
    var potencia = 1;
    var i = 1;
    while (i <= y) {
        potencia = produto(potencia, x);
    }
    return potencia;
}

//Algoritmo 9 -Valor de PI
function pi(n) {
    if (n < 1 || isNaN(n)) {
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

//Algoritmo 10 - Logaritmo Natural
function logaritmoNatural(n, k) {
    if (n < 1 || k < 2 || isNaN(n)) {
        throw new InvalidArgumentException("Argumento(s) inválido(s).");
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

//Algoritmo 11 - Razão Áurea
function razaoAurea(x, y, k) {
    if (x < 0 || x > y || k <= 0 || isNaN(n)) {
        throw new InvalidArgumentException("Argumento(s) inválido(s).");
    }
    var c = y;
    var a = x;
    var i = 1;
    while (i <= k) {
        t = c;
        c += a;
        a = t;
        i++;
    }
    return c / a;
}

//Algoritmo 12 - Quadrado Perfeito
function quadradoPerfeito(n) {
    if (n < 1 || isNaN(n)) {
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

//Algoritmo 13 - Raiz Quadrada
function raizQuadrada(n, i) {
    if (n <= 0 || isNaN(n) || isNaN(i)) {
        throw new InvalidArgumentException("Argumento(s) inválido(s).");
    }
    var r = 1;
    while (i > 0) {
        r = (r + n / r) / 2;
        ;
        i--;
    }
    return r;
}

//Algoritmo 14 - Número Primo
function primo(n) {
    if (n <= 1 || isNaN(n)) {
        throw new InvalidArgumentException("Número inválido.");
    }
    i = 2;
    while (i < n) {
        if (n % i == 0) {
            return false;
        }
        i++;
    }
    return true;
}

//Algoritmo 15 - Crivo de Eratóstenes
function crivoEratostenes(a, n) {
    if (n <= 1 || isNaN(n)) {
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

//Algoritmo 16 - Maior Divisor Comum
function mdc(a, b) {
    if (b > a || b <= 0 || isNaN(a) || isNaN(b)) {
        throw new InvalidArgumentException("Argumento(s) inválidos!");
    }
    while (b != 0) {
        var m = a % b;
        a = b;
        b = m;
    }
    return a;
}

//Algoritmo 17 - Maior Divisor Comum
function mdc2(b, a) {
    if (b > a || b <= 0 || isNaN(b) || isNaN(a)) {
        throw new InvalidArgumentException("Argumento(s) inválidos!");
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

//algoritmo 18 - Regra de Horner para avaliação de polinômio
function horner(x, g, a) {
    if (g < 1 || isNaN(x) || isNaN(g) || isNaN(a)) {
        throw new InvalidArgumentException("Número inválido!");
    }
    var p = a[g];
    var i = g - 1;
    while (0 <= i) {
        p = p * x + a[i];
        i--;
    }
    return p;
}

//algoritmo 19 - Fibonacci
function fibonacci(n) {
    if (n < 0 || isNaN(n)) {
        throw new InvalidArgumentException("Número inválido!");
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

//algoritmo 20 - Cadastro de Pessoas Físicas (CPF)
function cpf(d) {
    var j = d[0] + 2 * d[1] + 3 * d[2] + 4 * d[3] + 5 * d[4] + 6 * d[5] + 7 * d[6]
        + 8 * d[7] + 9 * d[8];
    var k = d[1] + 2 * d[2] + 3 * d[3] + 4 * d[4] + 5 * d[5] + 6 * d[6] + 7 * d[7]
        + 8 * d[8] + 9 * d[9];
    var dj = (j % 11) % 10;
    var dk = (k % 11) % 10;
    return (dj == d[9] && dk == d[10]);
}

//algoritmo 21 - Cadastro de Pessoas Físicas (CPF)
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
