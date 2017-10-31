/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author fouillard
 */
 
public class Ticket {
    private int hDep;
    private int mnDep;
    private int hArr;
    private int mnArr;
    private int nbKms;
    private double prixKm;
    private double prixTicket;
    private int dureeTrajet;
    
    /**
     * Constructeur de la classe Ticket
     * @param hDep Heure de l'horaire de départ (Integer)
     * @param mnDep Minute de l'horaire de départ (Integer)
     * @param hArr Heure de l'horaire de d'arrivée (Integer)
     * @param mnArr Minute de l'horaire de d'arrivée (Integer)
     * @param nbKms Nombre de kilomètres du trajet à parcourir (Integer)
     * @param prixKm Prix du kilomètre (double)
     */
    public Ticket(int hDep,int mnDep,int hArr,int mnArr,int nbKms,double prixKm){
        this.hDep = hDep;
        this.mnDep = mnDep;
        this.hArr = hArr;
        this.mnArr = mnArr;
        this.nbKms = nbKms;
        this.prixKm = prixKm;
        this.prixTicket = 0;
        this.dureeTrajet = 0;
    }
    
    /**
     * Affiche à la sortie standard le contenue de l'objet 
     */
    public void affichage(){
        System.out.println("Horaire de départ : "+this.hDep+"h"+this.mnDep);
        System.out.println("Horaire d'arrivée : "+this.hArr+"h"+this.mnArr);
        System.out.println("Prix du ticket : "+this.prixTicket);
        System.out.println("Durée du trajet : "+this.dureeTrajet+" minute(s)");
    }
    
    /**
     * Calcul le prix du ticket
     * @return Prix du ticket
     */
    public double calculPrix(){
        return this.prixKm * this.nbKms;
    }
    
    /**
     * Calcul la durée du trajet du ticket en minute
     * @return Durée du trajet en minutes
     */
    public int calculDuree(){
        return ((this.hArr * 60) + this.mnArr) - ((this.hDep * 60) + this.mnDep);
    }
    
    /**
     * Main du swag
     * @param args 
     */
    public static void main(String args[]){
        Ticket t = new Ticket(9,30,11,45,320,1);
        t.setDureeTrajet(t.calculDuree());
        t.setPrixTicket(t.calculPrix());
        t.affichage();
    }
    
    /**
     * @return the hDep
     */
    public int gethDep() {
        return hDep;
    }

    /**
     * @return the mnDep
     */
    public int getMnDep() {
        return mnDep;
    }

    /**
     * @return the hArr
     */
    public int gethArr() {
        return hArr;
    }

    /**
     * @return the mnArr
     */
    public int getMnArr() {
        return mnArr;
    }

    /**
     * @return the nbKms
     */
    public int getNbKms() {
        return nbKms;
    }

    /**
     * @return the prixKm
     */
    public double getPrixKm() {
        return prixKm;
    }

    /**
     * @return the prixTicket
     */
    public double getPrixTicket() {
        return prixTicket;
    }

    /**
     * @return the dureeTrajet
     */
    public int getDureeTrajet() {
        return dureeTrajet;
    }

    /**
     * @param prixTicket the prixTicket to set
     */
    public void setPrixTicket(double prixTicket) {
        this.prixTicket = prixTicket;
    }

    /**
     * @param dureeTrajet the dureeTrajet to set
     */
    public void setDureeTrajet(int dureeTrajet) {
        this.dureeTrajet = dureeTrajet;
    }

    /**
     * @param hDep the hDep to set
     */
    public void sethDep(int hDep) {
        this.hDep = hDep;
    }

    /**
     * @param mnDep the mnDep to set
     */
    public void setMnDep(int mnDep) {
        this.mnDep = mnDep;
    }

    /**
     * @param hArr the hArr to set
     */
    public void sethArr(int hArr) {
        this.hArr = hArr;
    }

    /**
     * @param mnArr the mnArr to set
     */
    public void setMnArr(int mnArr) {
        this.mnArr = mnArr;
    }

    /**
     * @param nbKms the nbKms to set
     */
    public void setNbKms(int nbKms) {
        this.nbKms = nbKms;
    }

    /**
     * @param prixKm the prixKm to set
     */
    public void setPrixKm(double prixKm) {
        this.prixKm = prixKm;
    }
}
