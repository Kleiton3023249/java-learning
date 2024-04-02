public class PessoaJ extends Contato {
    public void exibirPessoaF() {}

    public void exibirPessoaJ(){
        System.out.println("Razão Social: " + getRazaoSocial());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Inscrição Estadual: " + getInscricaoEstadual());
    }
}
