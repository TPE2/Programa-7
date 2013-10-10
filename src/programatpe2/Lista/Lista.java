/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programatpe2.Lista;

/**
 *
 * @author Gui
 */
public class Lista {

    private int tam = 0;
    private No ini = null;
    private No fin = null;
    private No corr = null;

    public Lista(No o){
        ini = o;
        fin = o;
        tam++;
        
    }
    
    
    public boolean vazio() {
       if(tam == 0){
           return true;
       }
       else{
           return false;
       }
    }
    
    public int getTam(){
        
        return this.tam;
    }

    public boolean insIni(No x) {
        
        
       
        x.setProx(ini);
        ini = x;
        
        tam ++;
        
        
        if(ini == x)
            return true;        
        else
            return false;
        
        
        
        }

    public boolean insFin(No x) {
        
        x.setProx(ini);
        fin.setProx(x);
        
        tam++;
       
        if(fin.getProx() == x)
            return true;        
        else
            return false;
       
        
    }

    public No retIni() {
        No aux = ini;
        
        ini = ini.getProx();
        
        return ini;
    }

    public No retFin() {
        No  aux = fin;
        
        fin = fin.getProx();
        
        return aux;
    }

    public void posIni() {
        corr = ini;
    }

    public No prox() {
        No aux = corr;
        
        corr = corr.getProx();
        return aux;
    }
}
