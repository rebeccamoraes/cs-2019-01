const funcao = require("../exercicios-iniciais").calculaPi;

test("caso clássico", () => {
    expect( funcao(100)).toBeCloseTo(3.14, 1);
});

test("precisao menor que 1 gera exceção", () => {
    expect( () => { funcao(0); }).toThrow(RangeError);
});