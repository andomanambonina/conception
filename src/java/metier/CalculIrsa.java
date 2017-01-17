/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Bae
 */
public class CalculIrsa {
    public double calculIrsa(double salaire){
        double irsa = 0;
        if(salaire <= 250000){
            irsa = 2000;
        }else if(salaire > 250000){
            irsa = ((salaire - 25000)*1.20)+2000;
        }
        return irsa;
    }
}
