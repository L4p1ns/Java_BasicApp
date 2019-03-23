package entities;

import java.util.Date;

public class Ticket {
    private Long idTicket;
    private Date datePrise;
    private Specialite specialite;
    private Patient patient;
    private Caissier caissier;

    public Ticket() {
    }

    public Ticket(Long idTicket, Date datePrise, Specialite specialite, Patient patient, Caissier caissier) {
        this.idTicket = idTicket;
        this.datePrise = datePrise;
        this.specialite = specialite;
        this.patient = patient;
        this.caissier = caissier;
    }

    public Long getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Long idTicket) {
        this.idTicket = idTicket;
    }

    public Date getDatePrise() {
        return datePrise;
    }

    public void setDatePrise(Date datePrise) {
        this.datePrise = datePrise;
    }

    public Specialite getspecialite() {
        return specialite;
    }

    public void setspecialite(Specialite specialite) {
        this.specialite = specialite;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Caissier getCaissier() {
        return caissier;
    }

    public void setCaissier(Caissier caissier) {
        this.caissier = caissier;
    }
}
