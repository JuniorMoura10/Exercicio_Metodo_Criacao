package com.metodos.exerciicio;

public class Exercicio_01 {

    public static void main(String[] args) {

        // Exercício da calculadora

        System.out.println("Exercício Calculadora");

        Calculadora.soma(3, 6);
        Calculadora.subtracao(6, 3);
        Calculadora.multiplicacao(6, 3);
        Calculadora.divisao(6, 3);

        // Exercício da mensagem

        System.out.println("Exercício Mensagem");

        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(19);

        // Exercício do Empréstimo

        System.out.println("Exercício Empréstimo");

        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 3);



    }
}
