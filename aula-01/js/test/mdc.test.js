const funcao = require("../exercicios-iniciais").mdc;

test("MDC entre 10 e 5 = 5", () => {
    expect(funcao(10,5)).toBe(5);
});

test("MDC entre 11 e 5 = 1", () => {
    expect(funcao(11, 5)).toBe(1);
});

test("Segundo número = 0 gera exceção", () => {
    expect(() => { funcao(10, 0)} ).toThrow();
});

test("Segundo número < 0 gera exceção", () => {
    expect(() => { funcao(10, -1)} ).toThrow();
});

test("Segundo número > primeiro número gera exceção", () => {
    expect(() => { funcao(5, 10)} ).toThrow();
});