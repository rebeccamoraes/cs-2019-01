const funcao = require("../exercicios-iniciais").logaritmoNatural;

test("Expoente null/undefined gera exceção", () => {
    expect(() => {funcao(3);}).toThrow();
});

test("Argumentos null/undefined gera exceção", () => {
    expect(() => {funcao();}).toThrow();
});

test("Expoente menor que 1 gera exceção", () => {
    expect(() => {funcao(0, 3);}).toThrow();
});

test("Precisao menor que 2 gera exceção", () => {
    expect(() => {funcao(1, 1)}).toThrow();
});

test("Logaritmo natural de 2 retorna 5", () => {
    expect(funcao(2, 2)).toBe(5);
});

