package atividade;

import java.util.Scanner;

/**
 * Crie um programa em linguagem Java que solicita ao usuário que digite a idade, 
 * armazene em uma variável do tipo byte e imprima uma mensagem para idade maior que 25 anos,
 * outra mensagem para idade menor que 25 e uma outra mensagem se idade igual a 25 anos.
 */
public class Exercicio1 {
    public static void main(String[] args) {
        byte idade = 0;
        
        do {
            idade = lerByte("Informe sua idade: ");
        } while (!Valida.isPositive(idade));

        if (idade > 25) {
            System.out.println("Você é jovem a mais tempo.");
        } else if (idade == 25) {
            System.out.println("Você é jovem.");
        } else {
            System.out.println("Você é muito jovem.");
        }

    }

    static byte lerByte(String mensagem){
        System.out.print(mensagem);

        Scanner scanner = new Scanner(System.in);
        byte numero = scanner.nextByte();

        return numero;
    }


}