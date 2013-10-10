/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package programatpe2;

/**
 *
 * @author Gui
 */
public class Vetor {

    private double x, y;

    public Vetor(double x, double y) {
        this.x = x;
        this.y = y;
    }

    private Vetor() {
    }

    public Vetor clone() {
        
        return this;
    }

    public String toString() {
        return String.format(" ( %s , %s ) ",this.x,this.y);
    }
}
