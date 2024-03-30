package provaRevisao.exercicio02;

public class AssistenteAdministrativo extends Assistente {

    public void exibeDados() {
        System.out.println ("Nome: " + getNome());
        System.out.println ("Rg: " + getRg());
        System.out.println ("CPF: " + getCpf());
        System.out.println ("Matricula: " + getMatricula());
        verificarTurno();
    }

    public void verificarTurno() {
        System.out.println("possuem turno de trabalho dia/noite e adicional noturno");
    }


}
