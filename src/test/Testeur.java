package test;

import entities.Patient;
import entities.Ticket;

import java.util.Date;

public class Testeur {
    public static void main(String[] args) {
        //
        Patient patient1 = new Patient(1L, "Diop", "Cheikh Tidiane", new Date("22/2/2001"));
        Patient patient2 = new Patient(2L, "Gueye", "Modou", new Date("22/2/1995"));

        Ticket t = new Ticket(1L, new Date("22/2/1995"), "Infirmier", 2000D);
        Ticket t1 = new Ticket(2L, new Date("22/2/2019"), "Infirmier", 2000D);
//        Affectation du ticket t au patient patient1.
        patient1.getTickets().add(t);
        patient1.getTickets().add(t1);

       /* List<Ticket> maListe = new ArrayList<Ticket>();
        Ticket ticket = new Ticket(1L, new Date("03/01/2019"), "Infirmier", (double) 1000, patient);
        Ticket ticket1 = new Ticket(1L, new Date("12/12/2018"), "Dentiste", (double) 2000, patient1);
        // ticket2 = new Ticket(1L, new Date("12/12/2018"), "Dentiste", (double) 2000, patient2);
        System.out.println("Patirnt: ");
        System.out.println(patient);
        System.out.println("Ticket:");
        System.out.println(ticket);
        maListe.add(ticket);
        maListe.add(ticket1);
        maListe.add(ticket2);*/
//        System.out.println("Affichage de ma Liste: " + maListe);

    }
}
