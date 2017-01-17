/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import connexion.Connexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Bae
 */
public class InsertPaie {
    public boolean insertPaie(int idpers, double sommeGains, double sommeRetenues,double irsa,double cnaps, double salairedebase) throws SQLException {
        Connection c = Connexion.getConnexion();
        String sql = "insert into paie(idpers,gains,retenues,irsa,cnaps,salairedebase) "
                + "values("+idpers+","+sommeGains+","+sommeRetenues+","+irsa+","+cnaps+","+salairedebase+")";
        Statement s = c.createStatement();
        s.executeUpdate(sql);
//        c.commit();
//        c.close();
        return false;
    }
}
