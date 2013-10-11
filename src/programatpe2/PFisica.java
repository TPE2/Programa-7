/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programatpe2;

/**
 *
 * @author Gui
 */
public class PFisica extends Contribuinte{
    
    protected String cpf;
    PFisica(String nome,String cpf, double rendaBruta){
        super.nome = nome;
        super.rendaBruta = rendaBruta;
        this.cpf = cpf;        
    }
    
    PFisica(){
        super.nome = "";
        super.rendaBruta = 0;
        this.cpf = "";        
    }
    
    @Override
    public double calcImposto(){
        double imposto=0;
        
        if(rendaBruta >0 && rendaBruta<=1400)
            imposto = 0;
        else
            if(rendaBruta >1400 && rendaBruta<=2100)
                imposto = ((rendaBruta/100)*10)-100;
        else
                if(rendaBruta >2100 && rendaBruta<=2800)
                    imposto = ((rendaBruta/100)*15)-270;
        else
                    if(rendaBruta >2800 && rendaBruta<=3600)
                        imposto = ((rendaBruta/100)*25)-500;
        else
                        imposto = ((rendaBruta/100)*30)-700;
            
        
        return imposto;
    }
    
    public String toString(){
        return String.format("Nome: "+this.nome+" CPF: "+this.cpf+" Imposto: %.2f", calcImposto());
    }
    
}
