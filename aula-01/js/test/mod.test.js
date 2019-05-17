const funcao = require("../exercicios-iniciais").mod;

test("10 mod 1 = 0", () => {
    expect(() => {funcao(10,1)}).toBe(0);
});

test("10 mod 2 = 0", () => {
    expect(() => {funcao(10,2)}).toBe(0);
});

test("10 mod 3 = 1", () => {
    expect(() => {funcao(10,3)}).toBe(1);
});

test("10 mod 4 = 2", () => {
    expect(() => {funcao(10,4)}).toBe(2);
});

test("10 mod 5 = 0", () => {
    expect(() => {funcao(10,5)}).toBe(0);
});

test("10 mod 6 = 4", () => {
    expect(() => {funcao(10,6)}).toBe(4);
});

test("10 mod 7 = 3", () => {
    expect(() => {funcao(10,7)}).toBe(3);
});

test("10 mod 8 = 2", () => {
    expect(() => {funcao(10,8)}).toBe(2);
});

test("argumentos null/undefined", () => {
    expect(() => { funcao(); }).toThrow();
});

test("divisor null/undefined", () => {
    expect(() => { funcao(1); }).toThrow();
});

test("argumentos não numéricos", () => {
    expect(() => { funcao("abcd", "efgh"); }).toThrow();
});

test("divisor não numérico", () => {
    expect(() => { funcao(10, "efgh"); }).toThrow();
});

test("dividendo não numérico", () => {
    expect(() => { funcao("efgh", 10); }).toThrow();
});

test("Dividendo < 0", () =>{
    expect(() => { funcao(-1, 10); }).toThrow();
});

test("Divisor < 0", () =>{
    expect(() => { funcao(1, -1); }).toThrow();
});

test("Divisor = 0", () =>{
    expect(() => { funcao(1, 0); }).toThrow();
});
