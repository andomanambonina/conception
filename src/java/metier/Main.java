/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import connexion.Connexion;
import java.sql.SQLException;
import java.sql.Time;

/**
 *
 * @author Bae
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        String str = "2h30";
        Time t = new Time(8,0,0);
        Time t2 = Time.valueOf(parser.ParseTime.parse_String_to_Time(str));
        long h = t2.getHours()+t.getHours();
        long m =t2.getMinutes()+t.getMinutes();
        System.out.println(h+":"+m);
    }
    
}
