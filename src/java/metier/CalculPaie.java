/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.SQLException;

/**
 *
 * @author Bae
 */
public class CalculPaie {
    public boolean calcul_paie(int matricule) throws SQLException{
        GetListGain glg = new GetListGain();
        GetListRetenues glr = new GetListRetenues();
        SelectInPersonnel sp = new SelectInPersonnel();
        CalculIrsa ci = new CalculIrsa();
        double sommeGain = glg.getGains(matricule);
        double sommeRet= glr.getRetenues(matricule);
        double salaire = sp.findPersonnel(matricule);
        double valeurRetenu = (salaire/173.33)* sommeRet;
        double valeurGain = (salaire/173.33)* sommeGain;
        double cnaps = (salaire)/100;
        double irsa = 0;
        InsertPaie ip = new InsertPaie();
        ip.insertPaie(matricule, sommeGain, sommeRet, irsa, cnaps, salaire);
        return false;
    }
}
