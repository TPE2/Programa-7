/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programatpe2;

/**
 *
 * @author Gui
 */
public class PJuridica extends Contribuinte {
    
    protected String cnpj;
    PJuridica(String nome,String cnpj, double rendaBruta){
        super.nome = nome;
        super.rendaBruta = rendaBruta;
        this.cnpj = cnpj;        
    }
    
    PJuridica(){
        super.nome = "";
        super.rendaBruta = 0;
        this.cnpj = "";        
    }
    
    @Override
    public double calcImposto(){                 
        
        return (rendaBruta*10)/100;
    }
    
    public String toString(){
        return ("Nome: "+this.nome+" CNPJ: "+this.cnpj+" Imposto: "+ calcImposto());
    }
}
