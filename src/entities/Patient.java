package entities;

import java.util.Date;
import java.util.List;

public class Patient {
    private Long idPatient;
    private String nomPatient;
    private String prenomPatient;
    private Date dateNaiss;
    private List<Ticket> tickets;

    public Patient() {
    }

    public Patient(Long idPatient, String nomPatient, String prenomPatient, Date dateNaiss) {
        this.idPatient = idPatient;
        this.nomPatient = nomPatient;
        this.prenomPatient = prenomPatient;
        this.dateNaiss = dateNaiss;
    }

    public Long getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Long idPatient) {
        this.idPatient = idPatient;
    }

    public String getNomPatient() {
        return nomPatient;
    }

    public void setNomPatient(String nomPatient) {
        this.nomPatient = nomPatient;
    }

    public String getPrenomPatient() {
        return prenomPatient;
    }

    public void setPrenomPatient(String prenomPatient) {
        this.prenomPatient = prenomPatient;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "idPatient=" + idPatient +
                ", nomPatient='" + nomPatient + '\'' +
                ", prenomPatient='" + prenomPatient + '\'' +
                ", dateNaiss=" + dateNaiss +
                ", tickets=" + tickets +
                '}';
    }
}
