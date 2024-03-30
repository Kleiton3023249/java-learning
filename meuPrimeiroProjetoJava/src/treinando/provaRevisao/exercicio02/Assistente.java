package provaRevisao.exercicio02;

// Considere a classe Funcionario (atributos: nome, rg, cpf) e a classe Gerente (atributo: nivelDeGerencia).
// O Gerente é um Funcionario, ambos podem receber aumento de salário porém o Gerente recebe aumento de 0,15 e o funcionário de 0,10. 
// A classe Assistente também é um Funcionario e possui um número de matrícula. Adicionalmente, existem assistentes técnicos (que possuem bônus salarial)
// e os assistentes administrativos (que possuem turno de trabalho dia/noite e adicional noturno). Usando os conceitos de herança e polimorfismo, crie a
// hierarquia de classes acima com todos os métodos necessários e um método exibeDados que exibe cada atributo de cada funcionário.

// Crie um programa de teste em que sejam inseridos todos os tipos de funcionários e posteriormente exiba todas informações
// de cada um deles (usando o método exibeDados).

public class Assistente extends Colaborador {

    private long matricula;

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public void exibeDados() {
        System.out.println ("Nome: " + getNome());
        System.out.println ("Rg: " + getRg());
        System.out.println ("CPF: " + getCpf());
        System.out.println ("Matricula: " + getMatricula());
        verificarAumento();
    }

    public void verificarAumento() {

        System.out.println("Naõ possui aumento");
    }
}
