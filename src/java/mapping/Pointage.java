/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapping;

import java.sql.Date;
import java.sql.Time;
import parser.ParseDate;
import parser.ParseTime;

/**
 *
 * @author Bae
 */
public class Pointage {
    private int idpointage;
    private String poste;
    private int matricule;
    private Date datepointage;
    private Time heurepointage;
    private String etat;

    public Pointage() {
    }

    public Pointage(int idpointage, String poste, int matricule, Date datepointage, Time heurepointage, String etat) {
        this.idpointage = idpointage;
        this.poste = poste;
        this.matricule = matricule;
        this.datepointage = datepointage;
        this.heurepointage = heurepointage;
        this.etat = etat;
    }
    
        public Pointage(int idpointage, String poste, int matricule, String datepointage, String heurepointage, String etat) {
        this.idpointage = idpointage;
        this.poste = poste;
        this.matricule = matricule;
        this.setDatepointage(datepointage); 
        this.setHeurepointage(heurepointage);
        this.etat = etat;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getIdpointage() {
        return idpointage;
    }

    public void setIdpointage(int idpointage) {
        this.idpointage = idpointage;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getMatricule() {
        return matricule;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }
    
    public void setMatricule(String matricule) {
        this.matricule = Integer.parseInt(matricule);
    }

    public Date getDatepointage() {
        return datepointage;
    }

    public void setDatepointage(Date datepointage) {
        this.datepointage = datepointage;
    }
    //////set String to date via ParseDate
    public void setDatepointage(String datepointage) {
        ParseDate parse = new ParseDate();
        this.datepointage = Date.valueOf(parse.parse_String_to_Date(datepointage));
    }

    public Time getHeurepointage() {
        return heurepointage;
    }

    public void setHeurepointage(Time heurepointage) {
        this.heurepointage = heurepointage;
    }
    ///// set string to time via parseTime
    public void setHeurepointage(String heurepointage) {
        this.heurepointage =Time.valueOf(ParseTime.parse_String_to_Time(heurepointage));
    }
}
