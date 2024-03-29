package conceitoJAVA.pilaresPoo.abstracao;

public class Telegram extends SistemaMensagemInstantanea {
    
    public void enviarMensagem() {
        System.out.println("Enviar Mensagem pelo Telegram");
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo Telegram");
    }

}
