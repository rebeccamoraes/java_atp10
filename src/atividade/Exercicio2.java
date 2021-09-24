package atividade;

import java.util.Scanner;

/**
 * Exercício 2
 * - solicite ao usuário que digite o salário 
 * - armazene em uma variável do tipo double 
 * - imprima uma mensagem caso o salário seja maior que R$ 1997,58, 
 * - imprima uma mensagem se o salário for maior que R$5399,99 
 * - imprima uma mensagem se o salário digitado for menor ou igual a zero.
 * 
 * Caso o salário seja menor igual a zero o sistema deve solicitar que o usuário digite o salário novamente 
 * para então realizar as validações de faixas salariais mais uma vez 
 * até que o usuário digite um valor acima de zero.
 */
public class Exercicio2 {
    public static void main(String[] args) {
        double salario = 0;
        
        do {
            salario = lerDouble("Informe o salario: ");
        } while (!Valida.isPositive(salario));

        if (salario > 1997.58) {
            System.out.println("Você ganha mais que R$1997,58.");
        }
        if (salario > 5399.99) {
            System.out.println("Você ganha mais que R$5399,99.");
        }
    }

    static double lerDouble(String mensagem){
        System.out.print(mensagem);

        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();

        return numero;
    }
}