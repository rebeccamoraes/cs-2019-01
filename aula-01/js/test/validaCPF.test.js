const funcao = require("../exercicios-iniciais").cpf;

const cpfValido = [9,3,3,3,0,0,1,4,0,9,1];
const cpfUltimoDigitoInvalido = [9,3,3,3,0,0,1,4,0,9,9];
const cpfDigitosInvalidos = [9,3,3,3,0,0,1,4,0,0,9];
const cpfMenor = [1, 2, 3, 4];

test("CPF válido retorna true", () => {
    expect( funcao(cpfValido)).toBe(true);
});

test("CPF com último dígito inválido retorna false", () => {
    expect( funcao(cpfUltimoDigitoInvalido)).toBe(false);
});

test("CPF com dígitos inválidos retorna false", () => {
    expect( funcao(cpfDigitosInvalidos)).toBe(false);
});

test("CPF com dígitos insuficientes gera exceção", () => {
    expect( () => { funcao(cpfMenor); }).toThrow();
});

test("CPF undefined/null gera exceção", () => {
    expect( () => { funcao(); }).toThrow;
});