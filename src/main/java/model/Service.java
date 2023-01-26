package model;

import java.util.Collection;

public class Service {
    private int id;
    private String libelle;

    private Collection<Medecin> medecins ;

    private  Collection<Specialite> specialites;

    public Collection<Specialite> getSpecialites() {
        return specialites;
    }

    public void setSpecialites(Collection<Specialite> specialites) {
        this.specialites = specialites;
    }

    public Collection<Medecin> getMedecins() {
        return medecins;
    }

    public void setMedecins(Collection<Medecin> medecins) {
        this.medecins = medecins;
    }

    public Service(int id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Service() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

}
