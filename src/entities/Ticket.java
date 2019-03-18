package entities;

import java.util.Date;

public class Ticket {
    private Long idTicket;
    private Date datePrise;
    private String specialiteMed;
    private Double montant;
    private Patient patient;

    public Ticket(Long idTicket, Date datePrise, String specialiteMed, Double montant, Patient patient) {
        this.idTicket = idTicket;
        this.datePrise = datePrise;
        this.specialiteMed = specialiteMed;
        this.montant = montant;
        this.patient = patient;
    }

    public Ticket() {
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

    public String getSpecialiteMed() {
        return specialiteMed;
    }

    public void setSpecialiteMed(String specialiteMed) {
        this.specialiteMed = specialiteMed;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "idTicket=" + idTicket +
                ", datePrise=" + datePrise +
                ", specialiteMed='" + specialiteMed + '\'' +
                ", montant=" + montant +
                ", patient=" + patient +
                '}';
    }
}
