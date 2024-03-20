package lista01.exercicio04;

public class prestacaoImovel {

    double capital;
    double juros;
    double taxa;
    double tempoAplicacao;

    double CalcularValorPrestacao (double capital, double taxa, double tempoAplicacao) {
        juros = (capital * taxa) * tempoAplicacao;
        double valorPrestacao = (capital + juros)/ tempoAplicacao;

        valorPrestacao = Math.round(valorPrestacao * 100.0) / 100.0;
       
        return valorPrestacao;
    }

}
