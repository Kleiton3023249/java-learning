package lista01.exercicio06;

import java.util.Scanner;

// Criar as funções recebendo dois parâmetros e com retorno:
// float adicao(float, float) - calcula a soma de dois números
// float subtracao(float, float) - calcula a subtração de dois números
// float multiplicacao(float, float) - calcula o produto de dois números
// float divisao(float, float) - calcula a divisão de dois números
// O usuário irá entrar com dois números inteiros ou reais. A função main() deve efetuar a
// chamada das funções e receber como retorno o resultado

public class calculadoraCliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com dois valorer para calcularmos\n soma, subtração, multiplicação e divisão");

        System.out.print("Entre com um valor: ");
        float n1 = sc.nextFloat();

        System.out.printf("Entre com um valor: ","\n");
        float n2 = sc.nextFloat();

        String s1 = "" + n1;
        String s2 = "" + n2;


        calculadora c = new calculadora();
        float resultadoSoma = c.calcularSoma(n1, n2);
        String somaEmString = "" + resultadoSoma;
        System.out.printf("%s + %s = %s \n", s1,s2,somaEmString);

        float resultadoSub = c.calcularSub(n1, n2);
        String subEmString = "" + resultadoSub;
        System.out.printf("%s - %s = %s \n", s1,s2,subEmString);

        float resultadoMult = c.calcularMult(n1, n2);
        String multEmString = "" + resultadoMult;
        System.out.printf("%s * %s = %s \n", s1,s2,multEmString);

        float resultadoDiv = c.calcularDiv(n1, n2);
        String divEmString = "" + resultadoDiv;
        System.out.printf("%s / %s = %s \n", s1,s2,divEmString);

        sc.close();
    }
    
}
