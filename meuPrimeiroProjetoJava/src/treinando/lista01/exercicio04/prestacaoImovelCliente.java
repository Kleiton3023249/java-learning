package lista01.exercicio04;

import java.util.Scanner;

public class prestacaoImovelCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos calcular o valor da sua prestação!");
        
        System.out.print("Entre com o valor do capital: ");
        double capital = sc.nextDouble();
        
        sc.nextLine(); // o nextDouble deixa o caracter de nova linha (\n) no buffer que é consumido pelo próximo nextLine(), retornando uma string vazia, por isso é ideal executar um nextLine soltou logo depois. 

        System.out.print("Entre com o valor da taxa de juros: ");
        String entrada = sc.nextLine();
        entrada = entrada.trim().replace(",", ".");
        double taxa = Double.parseDouble(entrada);

        System.out.print("Por quanto tempo planeja financiar o imovel? informe em dias: ");
        double tempoAplicacao = sc.nextDouble();
        
        prestacaoImovel p = new prestacaoImovel();
        double ValorAPagar = p.CalcularValorPrestacao(capital, taxa, tempoAplicacao);

        System.out.println("O valor a pagar mensalmente: " + ValorAPagar);

        sc.close();
}

}