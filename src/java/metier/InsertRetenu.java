/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import connexion.Connexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Bae
 */
public class InsertRetenu {
    public boolean insertRetenu(String motif,double duree, Date datesaisie,int employe,String poste) throws SQLException{
        Connection c = Connexion.getConnexion();
        String sql="insert into retenues(motif,duree,datesaisie,employe,poste) values('"+motif+"',"+duree+",'"+datesaisie+"',"+employe+",'"+poste+"')";
        Statement s = c.createStatement();
        s.executeUpdate(sql);
//        c.commit();
        c.close();
        return false;
    }
}
