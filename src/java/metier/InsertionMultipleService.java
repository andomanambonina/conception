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
public class InsertionMultipleService {
    
    public int nbrPersParDepart(int departement) throws SQLException{
        Connection  c = Connexion.getConnexion();
        String req = "select count(*) from personnel where iddepartement = "+departement+"";
        System.out.println("count ===== "+req);
        ResultSet rs = c.createStatement().executeQuery(req);
        int i = 0;
        rs.next();
        i=rs.getInt(1);
        return i;
    }
    //nombre personnel par departement
    public ArrayList<Personnel> findPersonnel(int departement) throws SQLException{
        Connection  c = Connexion.getConnexion();
        String req = "select * from personnel where iddepartement = "+departement+"";
        ResultSet rs = c.createStatement().executeQuery(req);
        System.out.println("requette ===== "+req);
        ArrayList<Personnel> pers = new ArrayList<>();
        while(rs.next()){
            pers.add(new Personnel(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getInt(6) ));
        }
        c.close();
        return pers;
    }
    //liste des employes par departement
    
    ///select poste
    
    public String getPost(int id) throws SQLException{
        String poste="";
        Connection  c = Connexion.getConnexion();
        String req = "select designation from departement where iddepartement = "+id+"";
        ResultSet rs = c.createStatement().executeQuery(req);
        rs.next();
        poste = rs.getString(1);
        c.close();
        return poste;
    }

    public Personnel getPersonnel(int matricule) throws SQLException{
        Connection  c = Connexion.getConnexion();
        String req  = "select * from personnel where idpers = "+matricule+"";
        ResultSet rs = c.createStatement().executeQuery(req);
        rs.next();
        return new Personnel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getInt(6));
    }
    
}
