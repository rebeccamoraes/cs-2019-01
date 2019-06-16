const funcao = require("../exercicios-iniciais").fibonacci;

test("Caso clássico 0 retorna 0", () =>{
    expect(funcao(0)).toBe(0);
});

test("Caso clássico 1 retorna 1", () =>{
    expect(funcao(1)).toBe(1);
});

test("Caso clássico 2 retorna 1", () =>{
    expect(funcao(2)).toBe(1);
});

test("Caso clássico 3 retorna 2", () =>{
    expect(funcao(3)).toBe(2);
});

test("Caso clássico 4 retorna 3", () =>{
    expect(funcao(4)).toBe(3);
});

test("Caso clássico 5 retorna 5", () =>{
    expect(funcao(5)).toBe(5);
});

test("Caso clássico 6 retorna 8", () =>{
    expect(funcao(6)).toBe(8);
});

test("Caso clássico 7 retorna 13", () =>{
    expect(funcao(7)).toBe(13);
});

test("Caso clássico 8 retorna 21", () =>{
    expect(funcao(8)).toBe(21);
});

test("Caso clássico 9 retorna 34", () =>{
    expect(funcao(9)).toBe(34);
});

test("Caso clássico 10 retorna 55", () =>{
    expect(funcao(10)).toBe(55);
});

test("Numero menor que 0 gera excecao", () => {
    expect(() => {funcao(-1); }).toThrow(RangeError);
});
