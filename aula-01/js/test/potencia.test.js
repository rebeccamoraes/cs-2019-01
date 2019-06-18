const funcao = require("../exercicios-iniciais").potencia;

test("Potencia de 5 ^2 = 25", () => {
    expect(funcao(5, 2)).toBe(25);
});

test("Base menor que 0 gera exceção", () => {
    expect(() => { funcao(-1, 1)}).toThrow(RangeError);
});

test("Expoente menor que 0 gera exceção", () => {
    expect(() => { funcao(1, -1)}).toThrow(RangeError);
});