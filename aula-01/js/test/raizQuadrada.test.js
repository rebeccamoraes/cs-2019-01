const funcao = require("../exercicios-iniciais").raizQuadrada;

test("Casos clássicos (1 a 10)", () => {
    expect( funcao(1, 10)).toBe(1);
    expect( funcao(4, 10)).toBe(2);
    expect( funcao(9, 10)).toBe(3);
    expect( funcao(16, 10)).toBe(4);
    expect( funcao(25, 10)).toBe(5);
    expect( funcao(36, 10)).toBe(6);
    expect( funcao(49, 10)).toBe(7);
    expect( funcao(64, 10)).toBe(8);
    expect( funcao(81, 10)).toBe(9);
    expect( funcao(100, 10)).toBe(10);
});

test("Número menor que zero gera exceção", () => {
    expect( () => { funcao(-1, 10); }).toThrow(RangeError);
});