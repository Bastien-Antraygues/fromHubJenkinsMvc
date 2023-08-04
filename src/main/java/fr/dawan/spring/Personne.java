package fr.dawan.spring;

import java.time.LocalDate;

public class Personne {

    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private int age;
    
    public Personne() {
        
    }
    
    public Personne(String nom, String prenom, LocalDate dateNaissance, int age) {
        super();
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.age = age;
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

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    
}
