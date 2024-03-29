package conceitoJAVA.pilaresPoo.heranca;

public class SistemaMensagemInstantanea {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviar Mensagem");
        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem");
    }

    //essa parte não precisa ser público:
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
    
}
