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
        for (Ticket a : patient1.getTickets() )
            System.out.println(a);
        /*for (int i = 0; i < patient1.getTickets().size(); i++)
            System.out.println(patient1.getTickets().get(i));*/

//        Autre methode
        /*patient1.getTickets().forEach(a -> {
            System.out.println(a.toString());
        });*/
     /*   System.out.println("Affichage des tickets");
        System.out.println(patient1.getTickets());
        System.out.println("end Message");*/
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
