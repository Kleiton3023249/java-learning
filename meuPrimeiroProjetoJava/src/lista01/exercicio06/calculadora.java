package lista01.exercicio06;

// Criar as funções recebendo dois parâmetros e com retorno:
// float adicao(float, float) - calcula a soma de dois números
// float subtracao(float, float) - calcula a subtração de dois números
// float multiplicacao(float, float) - calcula o produto de dois números
// float divisao(float, float) - calcula a divisão de dois números
// O usuário irá entrar com dois números inteiros ou reais. A função main() deve efetuar a
// chamada das funções e receber como retorno o resultado

public class calculadora {
    float n1;
    float n2;

    float calcularSoma (float n1, float n2) {
        float soma = n1 + n2;
        return soma;
    }

    float calcularSub (float n1, float n2) {
        float sub = n1 - n2;
        return sub;
    }

    float calcularMult (float n1, float n2) {
        float mult = n1 * n2;
        return mult;
    }

    float calcularDiv (float n1, float n2) {
        float div = n1/n2;
        return div;
    }
    
}
