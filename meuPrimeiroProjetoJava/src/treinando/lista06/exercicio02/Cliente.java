package treinando.lista06.exercicio02;

import java.util.Scanner;

import lista01.exercicio06.calculadora;

public class Cliente {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Entra com um numero ai: ");
        int x = sc.nextInt();

        Calculadora cl = new Calculadora();
        cl.verificarNumero(x);

        sc.close();

    }
}
