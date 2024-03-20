package conceitoJAVA.construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos", "09906847417");
        Pessoa joao = new Pessoa();

        marcos.setEndereco("Rua das Palmeiras");

        System.out.println("Meu nome é " + marcos.getNome() + " meu cpf é " + marcos.getCpf() + " moro na rua " + marcos.getEndereco());

    }
}
