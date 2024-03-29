package conceitoJAVA.pilaresPoo.interfaces.loja;

import conceitoJAVA.pilaresPoo.interfaces.copiadora.Copiadora;
import conceitoJAVA.pilaresPoo.interfaces.copiadora.Xerox;
import conceitoJAVA.pilaresPoo.interfaces.digitalizadora.Digitalizar;
import conceitoJAVA.pilaresPoo.interfaces.impressora.Impressora;
import conceitoJAVA.pilaresPoo.interfaces.multifuncional.Ricohpy;

public class Loja {

    public static void main(String[] args) {

        Xerox xe = new Xerox();

        xe.copiar();
        // xe.digitalizar(); Xerox apenas herda copiar
        // xe.imprimir();

    Ricohpy rp = new Ricohpy();

    rp.imprimir();
    rp.copiar();
    rp.digitalizar();


    /** Funciona pois rp tem os métodos necessário a cada interface:  */
    
    
    // Impressora imp = rp;
    // imp.imprimir();

    // Digitalizar dig = rp;
    // rp.digitalizar();

    // Copiadora cop = rp;
    // cop.copiar();
        


    /** Nesse caso não funciona para imprimir, pois xerox apenas tem o método copiar */

    
    // Impressora imp = xe;
    // xe.imprimir();

    // Copiadora cop = xe;
    // xe.copiar();

    }
}