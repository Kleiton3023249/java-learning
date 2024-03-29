package conceitoJAVA.pilaresPoo.interfaces.multifuncional;

import conceitoJAVA.pilaresPoo.interfaces.copiadora.Copiadora;
import conceitoJAVA.pilaresPoo.interfaces.digitalizadora.Digitalizar;
import conceitoJAVA.pilaresPoo.interfaces.impressora.Impressora;

public class Ricohpy implements Copiadora, Digitalizar, Impressora {
    public void copiar() {
        System.out.println("Copiar via Ricohpy");
    }

    public void digitalizar() {
        System.out.println("Digitalizar via Ricohpy");
    }

    public void imprimir() {
        System.out.println("Imprimir via Ricphpy");
    }

}
