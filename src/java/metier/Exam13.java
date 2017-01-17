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
import java.sql.Time;

/**
 *
 * @author Bae
 */
public class Exam13 {
    // get retard par id employe
    public double getRetard(int id, String dateIni, String dateFinal) throws SQLException{
        Connection  c = Connexion.getConnexion();
        String req = "select sum(duree) from retenues where employe = "+id+" and datesaisie >= '"+dateIni+"' and datesaisie <= '"+dateFinal+"' ";
        ResultSet rs = c.createStatement().executeQuery(req);
                System.out.println(req);
        rs.next();
        double duree =0;
        duree = rs.getDouble(1);
        c.close();
//        System.out.println(duree);
        return duree;
    }
    //getEntreeparService maka ny heure d entree isak le departement
    public Time getEntreeParService(int dep) throws SQLException{
        Connection  c = Connexion.getConnexion();
        String req = "select hentree from emploidutemps where departement = "+dep+"";
        System.err.println(req);
        ResultSet rs = c.createStatement().executeQuery(req);
        Time tt;
        rs.next();
        tt=rs.getTime(1);
        c.close();
        return tt;
    }
    //convertir retard en heure
    //le azo avy an am rp string de avadika time
    //efa hazo le get entree par service de iny no ampifanampina am le retard de aveo inserena anaty base
    //public String insertRetard(Pointage p)
    //ip.insertionPointage(new Pointage(0, poste, matr, lundi, hlundi, "entree"));
    public String calculRetard(String retard, int id) throws SQLException{
        Time t = this.getEntreeParService(id);
        Time tr = Time.valueOf(parser.ParseTime.parse_String_to_Time(retard));
        long heure = t.getHours()+tr.getHours();
        long minute = t.getMinutes() + tr.getMinutes();
        String h = String.valueOf(heure);
        String m = String.valueOf(minute);
        String res = h+":"+m;
        return res;
    }
}
