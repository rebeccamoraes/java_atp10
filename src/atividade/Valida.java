package atividade;

public class Valida {
    static boolean isPositive(byte numero) {
        if (numero < 0) {
            System.out.println("Valor inválido. O número não pode ser negativo.");
            return false;
        }
        return true;
    }

    static boolean isPositive(double numero) {
        if (numero <= 0) {
            System.out.println("Valor inválido. O número deve ser positivo.");
            return false;
        }
        return true;
    }
}
