const funcao = require("../exercicios-iniciais").propriedade153;

test("153 satisfaz (caso classico)", () => {
    expect(funcao(153)).toBe(true);
});

test("111 nao satisfaz", () => {
    expect(funcao(111)).toBe(false);
});

test("argumento null/undefined", () => {
    expect(() => { funcao(); }).toThrow();
});

test("argumento nao numerico", () => {
    expect(() => { funcao("abcd"); }).toThrow();
});


test("valor com menos de 3 digitos fora da faixa", () => {
    expect(() => { funcao(99); }).toThrow(RangeError);
});

test("valor com mais de 3 digitos fora da faixa", () => {
    expect(() => funcao(1000)).toThrow(RangeError);
});

test("valor deve ser inteiro", () => {
    expect(() => funcao(101.3)).toThrow(TypeError);
});
