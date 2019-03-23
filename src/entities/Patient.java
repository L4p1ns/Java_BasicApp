package entities;

import java.util.Date;
import java.util.List;

public class Patient extends Personne {
    private GroupeSanguin gs;
    private List<Ticket> tickets;

    public Patient(String matricule, String nom, Date dateNaissance, String telephone, String sexe, GroupeSanguin gs, List<Ticket> tickets) {
        super(matricule, nom, dateNaissance, telephone, sexe);
        this.gs = gs;
        this.tickets = tickets;
    }

    public GroupeSanguin getGs() {
        return gs;
    }

    public void setGs(GroupeSanguin gs) {
        this.gs = gs;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }
}
