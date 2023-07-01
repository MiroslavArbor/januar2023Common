/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Mafija
 */
public class Angazovanje implements Serializable{
    private int id;
    private Predmet predmet;
    private Profesor profesor;
    private Date datum;
    private String emailKorisnika;
    private String status;

    public Angazovanje() {
    }

    public Angazovanje(int id, Predmet predmet, Profesor profesor, Date datum, String emailKorisnika, String status) {
        this.id = id;
        this.predmet = predmet;
        this.profesor = profesor;
        this.datum = datum;
        this.emailKorisnika = emailKorisnika;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getEmailKorisnika() {
        return emailKorisnika;
    }

    public void setEmailKorisnika(String emailKorisnika) {
        this.emailKorisnika = emailKorisnika;
    }
    
    
    
}
