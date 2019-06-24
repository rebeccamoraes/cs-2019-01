const funcao = require("../exercicios-iniciais").primo;

test("Caso clássico: 2 retorna true", () => {
    expect(funcao(2)).toBe(true);
});

test("Caso clássico: 5 retorna true", () => {
    expect(funcao(5)).toBe(true);
});

test("4 retorna false", () => {
    expect(funcao(4)).toBe(false);
});

test("Número menor que 2 gera exceção", () => {
    expect( () => {funcao(1)}).toThrow(RangeError);
});