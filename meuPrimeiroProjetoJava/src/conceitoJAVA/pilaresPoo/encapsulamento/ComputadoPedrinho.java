package conceitoJAVA.pilaresPoo.encapsulamento;


public class ComputadoPedrinho {
    public static void main(String[] args) {
        // abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        // msn.validarConectadoInternet();
        msn.enviarMensagem();
        // msn.salvarHistoricoMensagem();

        msn.receberMensagem();

    }

}
