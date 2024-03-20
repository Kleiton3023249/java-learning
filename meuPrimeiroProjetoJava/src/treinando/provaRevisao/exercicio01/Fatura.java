package provaRevisao.exercicio01;



public class Fatura {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura (String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        setPreco(preco);
        getTotalFatura();
    }
  
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {

        if ( preco < 0) {
            preco = 0.0;
            this.preco = preco;
        }
        else {
        this.preco = preco;
        }

    }

    public double getTotalFatura () {
        double fatura = quantidade * preco;

        if (fatura < 0) {
            fatura = 0;
            return fatura;
        }
        else {

        return fatura;
        }
    }

   
}
