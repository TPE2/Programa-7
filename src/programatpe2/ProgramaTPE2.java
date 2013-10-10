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
        
        No ini = new No (new Vetor(1,3));
        Lista lista = new Lista(ini);
        
        //
        lista.insIni(new No(new Vetor(5,9)));
        lista.insIni(new No(new Vetor(2,4)));
        lista.insIni(new No(new Vetor(3,5)));
        lista.insFin(new No(new Vetor(4,9)));
        
        
        lista.posIni();       
        
        
        
        for(int i = 0; i < lista.getTam(); i++){
            
        System.out.println(lista.prox().getElem());
        
        }
        
        
    }
}
