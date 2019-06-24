const funcao = require("../exercicios-iniciais").produto;

test("Produto de 5 e 7 = 35", () => {
    expect( funcao(5, 7) ).toBe(35);
});

test("Produto de 7 e 5 = 35", () => {
    expect( funcao(7, 5) ).toBe(35);
});

test("Fator 1 menor qe 0 gera exceção", () =>{
    expect( () => { funcao(-1, 5); } ).toThrow(RangeError);
});

test("Fator 2 menor qe 0 gera exceção", () =>{
    expect( () => { funcao(5, -1); } ).toThrow(RangeError);
});