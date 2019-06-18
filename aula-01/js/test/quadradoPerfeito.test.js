const funcao = require("../exercicios-iniciais").quadradoPerfeito;

test("Caso Classíco 4 retorna true", () => {
    expect( funcao(4)).toBe(true);
});

test("Caso Classíco 9 retorna true", () => {
    expect( funcao(9)).toBe(true);
});

test("Caso Classíco 5 retorna false", () => {
    expect( funcao(5)).toBe(false);
});

test("Número menor que 1 gera exceção", () => {
    expect( () => { funcao(0); }).toThrow
});