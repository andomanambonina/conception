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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Exam13 e = new Exam13();
        System.out.println(e.getRetard(1, "2017-01-30", "2017-02-06"));
    }
    
}
