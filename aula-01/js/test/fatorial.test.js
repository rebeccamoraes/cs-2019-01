const funcao = require("../exercicios-iniciais").fatorial;

test("Fatorial de 5 retorna 120", () => {
    expect( funcao(5)).toBe(120);
});

test("Número menor que 1 gera exceção", () =>{
    expect( () => { funcao(0)}).toThrow(RangeError);
});