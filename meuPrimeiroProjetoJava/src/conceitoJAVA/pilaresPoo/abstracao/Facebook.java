package conceitoJAVA.pilaresPoo.abstracao;

public class Facebook extends SistemaMensagemInstantanea {

    public void enviarMensagem() {
        System.out.println("Enviar Mensagem pelo Facebook");
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Facebook");
    }
}
