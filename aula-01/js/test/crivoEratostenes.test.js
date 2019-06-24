const funcao = require("../exercicios-iniciais").crivoEratostenes;

const vetorInferior = [0];
const vetor5Zerado = [0, 0, 0, 0, 0, 0];
const vetor5Esperado = [0, 0, 0, 0, 1, 0];

test("CPF undefined/null gera exceção", () => {
    expect( () => { funcao(); }).toThrow;
});

test("Tamanho menor que 1 gera exceção", () => {
    expect( () => { funcao(vetorInferior, 1); }).toThrow();
});

test("Vetor até 5", () => {
    expect( funcao(vetor5Zerado, 5)).toStrictEqual(vetor5Esperado);
});