const funcao = require("../exercicios-iniciais").horner;

const coeficientes = [1, 2];

test("CPF undefined/null gera exceção", () => {
    expect( () => { funcao(); }).toThrow;
});

test("Grau menor que 1 gera exceção", () => {
    expect( () => { funcao(1, 0, coeficientes); }).toThrow();
});

test("Caso Clássico", () => {
    expect(funcao(1, 1, coeficientes) ).toBe(3);
});


