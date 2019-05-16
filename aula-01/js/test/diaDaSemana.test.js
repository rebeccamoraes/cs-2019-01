const funcao = require("../exercicios-iniciais").diaDaSemana;

test("01/01/2019 retorna 1 (caso clássico)", () => {
    expect(funcao(01,01,2019)).toBe(1);
});

test("02/01/2019 retorna 2 (caso clássico)", () => {
    expect(funcao(02,01,2019)).toBe(2);
});

test("03/01/2019 retorna 3 (caso clássico)", () => {
    expect(funcao(02,01,2019)).toBe(3);
});

test("04/01/2019 retorna 4 (caso clássico)", () => {
    expect(funcao(03,01,2019)).toBe(4);
});

test("05/01/2019 retorna 5 (caso clássico)", () => {
    expect(funcao(04,01,2019)).toBe(5);
});

test("06/01/2019 retorna 6 (caso clássico)", () => {
    expect(funcao(05,01,2019)).toBe(6);
});

test("07/01/2019 retorna 0 (caso clássico)", () => {
    expect(funcao(06,01,2019)).toBe(7);
});


test("argumentos null/undefined", () => {
    expect(() => {funcao(); }).toThrow();
});

test("ano null/undefined", () => {
    expect(() => { funcao(1,1); }).toThrow();
});

test("mês e ano null/undefined", () => {
    expect(() => { funcao(1); }).toThrow();
});

test("argumento dia não numérico", () =>{
    expect( () => { funcao("abcd", 12, 2019); }).toThrow();
});

test("argumento mes não numérico", () =>{
    expect( () => { funcao(1, "abcd", 2019); }).toThrow();
});

test("argumento ano não numérico", () =>{
    expect( () => { funcao(1, 12, "abcd"); }).toThrow();
});

test("valor de dia fora da faixa (menor que 1)", () => {
    expect(() => { funcao(0, 1, 2019); }).toThrow(RangeError);
});

test("valor de dia fora da faixa (maior que 31)", () => {
    expect(() => { funcao(32, 1, 2019); }).toThrow(RangeError);
});

test("valor de mês fora da faixa (menor que 1)", () => {
    expect(() => { funcao(1, 0, 2019); }).toThrow(RangeError);
});

test("valor de mês fora da faixa (maior que 12)", () => {
    expect(() => { funcao(1, 13, 2019); }).toThrow(RangeError);
});

test("valor de ano fora da faixa (menor que 1753)", () => {
    expect(() => { funcao(1, 1, 1752); }).toThrow(RangeError);
});

test("valor de mês com mais de 4 digitos fora da faixa", () => {
    expect(() => { funcao(1, 13, 10000); }).toThrow(RangeError);
});

test("valor de dia deve ser inteiro", () => {
    expect(() => funcao(10.3, 1, 2019)).toThrow(TypeError);
});

test("valor de mês deve ser inteiro", () => {
    expect(() => funcao(1, 1.2, 2019)).toThrow(TypeError);
});

test("valor de ano deve ser inteiro", () => {
    expect(() => funcao(1, 12, 2019.11)).toThrow(TypeError);
});
