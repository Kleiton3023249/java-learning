package provaRevisao.exercicio02;

public class AssistenteTecnico extends Assistente {
    public void exibeDados() {
        System.out.println ("Nome: " + getNome());
        System.out.println ("Rg: " + getRg());
        System.out.println ("CPF: " + getCpf());
        System.out.println ("Matricula: " + getMatricula());
        verificarBonusSalarial();
    }

    public void verificarBonusSalarial() {
        System.out.println("Recebe bonus salarial");
    }
}
