const funcao = require("../exercicios-iniciais").razaoAurea;

test("Primeiro número Menor que 0 gera exceção.", () => {
    expect( () => { funcao(-1, 1,2); }).toThrow(RangeError);
});

test("Segundo número menor que primeiro gera exceção", () => {
    expect( () => { funcao(2, 1, 2); }).toThrow(RangeError);
});

test("Tamanho da sequência igual a 0 gera exceção", () => {
    expect( () => { funcao(1, 2, 0); }).toThrow(RangeError);
});

test("Tamanho da sequência menor que 0 gera exceção", () => {
    expect( () => { funcao(1, 2, -1); }).toThrow(RangeError);
});

test("Caso clássico: Razão Áurea de 1 e 2, tamano 1, retorna 1", () => {
    expect( funcao(1, 2, 1)).toBe(1.5);
});

test("Argumento null/undefined gera exceção", () => {
    expect( () => { funcao(); }).toThrow();
});