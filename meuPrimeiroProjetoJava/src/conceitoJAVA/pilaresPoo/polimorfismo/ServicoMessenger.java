package conceitoJAVA.pilaresPoo.polimorfismo;

import conceitoJAVA.pilaresPoo.polimorfismo.aplicativos.Facebook;
import conceitoJAVA.pilaresPoo.polimorfismo.aplicativos.MSN;
import conceitoJAVA.pilaresPoo.polimorfismo.aplicativos.SistemaMessengerInstantanea;
import conceitoJAVA.pilaresPoo.polimorfismo.aplicativos.Telegram;

public class ServicoMessenger {
    public static void main(String[] args) {

        SistemaMessengerInstantanea smi = null;

        String appEscolhido = "facebook";


        if(appEscolhido.equals("msn") ) {
            smi = new MSN();
        }
        else if (appEscolhido.equals("facebook")) {
            smi = new Facebook();
        }
        else if (appEscolhido.equals("telegram")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
