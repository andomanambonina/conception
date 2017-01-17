/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapping;

import java.sql.Date;

/**
 *
 * @author Bae
 */
public class Paie {
    private int idpaie;
    private int idpers;
    private double sommeGains;
    private double sommeRetenues;
    private double irsa;
    private double cnaps;
    private Date datePaiement;

    public Paie() {
    }

    public Paie(int idpaie, int idpers, double sommeGains, double sommeRetenues, double irsa, double cnaps, Date datePaiement) {
        this.idpaie = idpaie;
        this.idpers = idpers;
        this.sommeGains = sommeGains;
        this.sommeRetenues = sommeRetenues;
        this.irsa = irsa;
        this.cnaps = cnaps;
        this.datePaiement = datePaiement;
    }

    public int getIdpaie() {
        return idpaie;
    }

    public void setIdpaie(int idpaie) {
        this.idpaie = idpaie;
    }

    public int getIdpers() {
        return idpers;
    }

    public void setIdpers(int idpers) {
        this.idpers = idpers;
    }

    public double getSommeGains() {
        return sommeGains;
    }

    public void setSommeGains(double sommeGains) {
        this.sommeGains = sommeGains;
    }

    public double getSommeRetenues() {
        return sommeRetenues;
    }

    public void setSommeRetenues(double sommeRetenues) {
        this.sommeRetenues = sommeRetenues;
    }

    public double getIrsa() {
        return irsa;
    }

    public void setIrsa(double irsa) {
        this.irsa = irsa;
    }

    public double getCnaps() {
        return cnaps;
    }

    public void setCnaps(double cnaps) {
        this.cnaps = cnaps;
    }

    public Date getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(Date datePaiement) {
        this.datePaiement = datePaiement;
    }  
}
