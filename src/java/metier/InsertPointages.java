/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import connexion.Connexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import mapping.EmploiDuTemps;
import mapping.Pointage;

/**
 *
 * @author Bae
 */
public class InsertPointages {
    public boolean insertionPointage(Pointage p) throws SQLException{
        Connection c = Connexion.getConnexion();
        PreparedStatement ps = c.prepareStatement("insert into pointage(poste,matricule,datepointage,heurepointage,etat) values(?,?,?,?,?)");
        ps.setString(1,p.getPoste());
        ps.setInt(2, p.getMatricule());
        ps.setDate(3, p.getDatepointage());
        ps.setTime(4, p.getHeurepointage());
        ps.setString(5, p.getEtat());
        ps.executeUpdate();
        
        ///gain et retenue
        EmploiDuTemps e = new EmploiDuTemps();

        InsertRetenu ir = new InsertRetenu();
        InsertGains ig = new InsertGains();
        String poste = p.getPoste();
        if(poste.compareToIgnoreCase("commerciale")==0 || poste.compareToIgnoreCase("financiere")==0 || poste.compareToIgnoreCase("technique")==0){
            Time tbureau = new Time(8,0,0);
            double temps = ((double)tbureau.getTime() - p.getHeurepointage().getTime())/3600000;
            if(temps<0){
            ir.insertRetenu("retard",temps,p.getDatepointage(),p.getMatricule(),p.getPoste());
            }
            else if(temps>0){
                ig.insertGain("Heure supl",temps,p.getDatepointage(),p.getMatricule(),p.getPoste());
            }
        }
        if(poste.compareToIgnoreCase("nuit")==0){
            Time tnuit = new Time(17,0,0);
            double tempsn = ((double)tnuit.getTime() - p.getHeurepointage().getTime())/3600000;
            if(tempsn<0){
                    ir.insertRetenu("retard",tempsn,p.getDatepointage(),p.getMatricule(),p.getPoste());
                }
                else if(tempsn>0){
                    ig.insertGain("Heure supl",tempsn,p.getDatepointage(),p.getMatricule(),p.getPoste());
                }
        }
        
        return false;
    }
}
