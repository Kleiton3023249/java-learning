package provaRevisao.exercicio01;

public class FaturaTeste {
    public static void main(String[] args) {
        Fatura newFatura = new Fatura("123", "Fatura da aquisição de shampoos 20/03/2024", 20, -36);

        System.out.println("O numero da fatura é: " + newFatura.getNumero() + "\nDescricao: " + newFatura.getDescricao() + "\nQuantidade: " + newFatura.getQuantidade() + "\nPreco: " + newFatura.getPreco() + "\nO total da fatura: " + newFatura.getTotalFatura());
        
    }
}
