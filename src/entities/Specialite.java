package entities;

public class Specialite {
    private int id;
    private String nom;
    private int tarifConsultation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getTarifConsultation() {
        return tarifConsultation;
    }

    public void setTarifConsultation(int tarifConsultation) {
        this.tarifConsultation = tarifConsultation;
    }
}
