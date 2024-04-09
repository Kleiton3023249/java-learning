package treinando.lista06.exercicio03;

public class Conta {
    double saldo;

    public void sacar(double saida) throws Exception {
        if (saldo <= saida) {
            throw new SaldoException("Ta gastando muito em")
        } else saldo -= saldo; 
    }

    public void depositar(double entrada) {
        saldo += entrada;
    }
}
