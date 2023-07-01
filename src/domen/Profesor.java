/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domen;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Mafija
 */
public class Profesor implements Serializable{
    private int profesorID;
    private String ime;
    private String prezime;
    private String zvanje;
    private String emailKorisnika;
    ArrayList<Angazovanje> lista;

    public Profesor() {
        lista = new ArrayList<>();
    }

    public Profesor(int profesorID, String ime, String prezime, String zvanje, String emailKorisnika, ArrayList<Angazovanje> lista) {
        this.profesorID = profesorID;
        this.ime = ime;
        this.prezime = prezime;
        this.zvanje = zvanje;
        this.emailKorisnika = emailKorisnika;
        this.lista = lista;
    }

    

    public String getEmailKorisnika() {
        return emailKorisnika;
    }

    public void setEmailKorisnika(String emailKorisnika) {
        this.emailKorisnika = emailKorisnika;
    }

    public int getProfesorID() {
        return profesorID;
    }

    public void setProfesorID(int profesorID) {
        this.profesorID = profesorID;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getZvanje() {
        return zvanje;
    }

    public void setZvanje(String zvanje) {
        this.zvanje = zvanje;
    }

    @Override
    public String toString() {
        return ime + " " + prezime;
    }

    public ArrayList<Angazovanje> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Angazovanje> lista) {
        this.lista = lista;
    }
    
    
}
