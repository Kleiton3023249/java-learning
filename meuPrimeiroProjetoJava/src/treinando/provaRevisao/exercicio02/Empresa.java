package provaRevisao.exercicio02;

public class Empresa {
    public static void main(String[] args) {
        
        //Funcionario
        System.out.println("Funcionário:");
        Colaborador junior = new Funcionario();
        junior.setNome("Junior");
        junior.setCpf(26584411656l);
        junior.setRg(654465l);

        junior.exibeDados();

        System.out.println("\n");

        //Gerente
        System.out.println("Gerente:");
        Colaborador claudio = new Gerente();
        claudio.setNome("Claudio");
        claudio.setCpf(12456897725l);
        claudio.setRg(12546845l);

        claudio.exibeDados();

        System.out.println("\n");

        //Assistente
        /* Nesse caso usa a classe Assistente para receber
         * as instância uma vez que Colaborador não reconhece
         * a propriedade setMatricula().
         */

        System.out.println("Assistente:");
        Assistente regina = new Assistente();
        regina.setNome("Regina");
        regina.setCpf(65894328714l);
        regina.setRg(58963265l);
        regina.setMatricula(25649);
        
        regina.exibeDados();

        System.out.println("\n");

        //Assistente Administrativo
        System.out.println("Assistente Administrativo: ");
        Assistente kleiton = new AssistenteAdministrativo();
        kleiton.setNome("Kleiton");
        kleiton.setCpf(95175325813l);
        kleiton.setRg(95175387l);
        kleiton.setMatricula(548965);

        kleiton.exibeDados();

        System.out.println("\n");

        //Assistente Técnico
        System.out.println("Assistente Técnico");
        Assistente larissy = new AssistenteTecnico();
        larissy.setNome("Larissy");
        larissy.setCpf(84226859173l);
        larissy.setRg(2036598l);
        larissy.setMatricula(96635);

        larissy.exibeDados();

        System.out.println("\n");



    }

}
