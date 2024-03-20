package conceitoJAVA.construtores;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    /** Construtor que permite criar instâncias sem tem que passar parâmetros */
    public Pessoa() {
       
    }

    /** Construtor */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        
        return endereco;
    }

    public void setEndereco(String endereco) {
        /* caso deseje verificar... if (endereco == ...) */
        this.endereco = endereco;

    }
}
