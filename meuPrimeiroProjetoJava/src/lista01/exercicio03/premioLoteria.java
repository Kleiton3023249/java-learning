package lista01.exercicio03;

public class premioLoteria {

    double valorPremio;
    double numerosAcertos;
    

    double CalcularValorPremio(double valorPremio, double numerosAcertos) {

        double valorParaReceber;

        if (numerosAcertos == 6) {
            valorParaReceber = valorPremio * 0.06;
            
        }
        else if ( numerosAcertos == 5) {
            valorParaReceber = valorPremio * 0.03;
           
        }
        else if ( numerosAcertos == 4) {
            valorParaReceber = valorPremio * 0.01;
           
        }
        else {
        throw new IllegalArgumentException ("Numero Invalido, tente 6 (seno), 5 (quina), 4 (quatro)");
        }

        return valorParaReceber;
    }
    
}
