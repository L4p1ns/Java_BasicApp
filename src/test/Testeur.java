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
        for (Ticket a : patient1.getTickets())
            System.out.println(a);
    }
}
