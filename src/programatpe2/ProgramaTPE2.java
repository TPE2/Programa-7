/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programatpe2;

import programatpe2.Lista.Lista;
import programatpe2.Lista.No;

/**
 *
 * @author Gui
 */
public class ProgramaTPE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        No ini = new No (new PFisica("Guilherme","Qualquercoisa", 3645));
        Lista lista = new Lista(ini);
        
        //
        lista.insIni(new No(new PJuridica("Guilherme1","Qualquercoisa1", 6500)));
        lista.insIni(new No(new PFisica("Guilherme2","Qualquercoisa2", 200)));
        lista.insIni(new No(new PJuridica("Guilherme3","Qualquercoisa3", 200)));
        lista.insFin(new No(new PFisica("Guilherme4","Qualquercoisa4", 1456)));
        
        
        lista.posIni();       
        
        
        
        for(int i = 0; i < lista.getTam(); i++){
            
        System.out.println(lista.prox().getElem());
        
        }
        
        
    }
}
