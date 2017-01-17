/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import connexion.Connexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import mapping.Personnel;

/**
 *
 * @author Bae
 */
public class SelectInPersonnel {
    public double findPersonnel(int matricule) throws SQLException{
        Connection  c = Connexion.getConnexion();
        String req = "select salairedebase from personnel where matricule= "+matricule;
        ResultSet rs = c.createStatement().executeQuery(req);
        double salaire= 0;
        while(rs.next()){
            salaire =rs.getDouble(1);
        }
        return salaire;
    }
}
