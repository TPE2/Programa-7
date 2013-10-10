/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programatpe2.Lista;

/**
 *
 * @author Gui
 */
public class No {

    private Object elem;
    private No prox;

    public No(Object e) {
        elem = e;
               
    }

    public Object getElem() {
        return this.elem;
    }

    public No getProx() {
        return this.prox; 
    }

    public void setProx(No o) {
       this.prox = o;
    }
}
