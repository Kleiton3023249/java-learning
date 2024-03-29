package conceitoJAVA.pilaresPoo.polimorfismo.aplicativos;

public class MSN extends SistemaMessengerInstantanea {
    public void enviarMensagem() {
        verificarConexao(); //chamando método protected
        System.out.println("Enviando Mensagem pelo MSN");
    }

    public void receberMensagem() {
        System.out.println("Recebendo Mensagem pelo MSN");
    }
}
