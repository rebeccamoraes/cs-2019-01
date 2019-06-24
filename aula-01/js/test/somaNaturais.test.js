const funcao = require("../exercicios-iniciais").somaNaturais;

test("Soma dos 5 primeiros naturais retorna 15", () => {
    expect( funcao(5)).toBe(15);
});

test("Número menor que 1 gera exceção", () => {
    expect( () => { funcao(0); }).toThrow(RangeError);
});

test("Argumento null/undefined gera exceção", () => {
    expect( () => { funcao(); }).toThrow();
});