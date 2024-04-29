
// Crie uma agenda de contatos. Nessa agenda, contatos podem ser adicionados,
// removidos, ou pesquisados por nome ou por CPF/CNPJ. Deve ser possível,
// também, visualizar todos os contatos da agenda. Dois tipos de contatos podem
// fazer parte da agenda: pessoa física e pessoa jurídica. A pessoa física tem os
// seguintes atributos: CPF, nome, endereço, data de nascimento, email, estado
// civil, e outros que você achar necessários. A pessoa jurídica possui: CNPJ, nome,
// endereço, email, inscrição estadual, razão social, e outros que você achar
// necessários. Na classe agenda, implemente um método ordena que coloca os
// objetos em ordem crescente de CPF/CNPJ. Além disso, todas as pessoas físicas
// devem aparecer antes das pessoas jurídicas


public abstract class Contato {

    private long cpf;
    private long cnpj;
    private String nome;
    private String razaoSocial;
    private String endereco;
    private String dataNascimento;
    private String email;
    private String estadoCivil;
    private int inscricaoEstadual;

    public abstract void  exibirPessoaF();
    public abstract void exibirPessoaJ();

    public void ordenarCrescente( long[] array) {
        long n = array.length;
        for(int i = 0; i < n - 1; i++);
    }


    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getCnpj() {
        return cnpj;
    }

    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(int inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }


}
