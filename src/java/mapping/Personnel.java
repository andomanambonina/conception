/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapping;

/**
 *
 * @author Bae
 */
public class Personnel {

    private int idpers;
    private String nom;
    private String prenom;
    private String cin;
    private String classe;
    private int iddepartement;

    public Personnel() {
    }

    public Personnel(int idpers, String nom, String prenom, String cin, String classe, int iddepartement) {
        this.idpers = idpers;
        this.nom = nom;
        this.prenom = prenom;
        this.cin = cin;
        this.classe = classe;
        this.iddepartement = iddepartement;
    }

    public int getIdpers() {
        return idpers;
    }

    public void setIdpers(int idpers) {
        this.idpers = idpers;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getIddepartement() {
        return iddepartement;
    }

    public void setIddepartement(int iddepartement) {
        this.iddepartement = iddepartement;
    }
    
    
}
