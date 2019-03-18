package test;

import entities.Patient;
import entities.Ticket;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Testeur {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setIdPatient((long) 1);
        patient.setDateNaiss(new Date("05/06/1991"));
        patient.setNomPatient("Ndiaye");
        patient.setPrenomPatient("Modou");
        //
        Patient patient1 = new Patient((long)1,"Diop","Cheikh Tidiane",new Date("22/2/2001"));
        Patient patient2 = new Patient((long)2,"Gueye","Modou",new Date("22/2/1995"));

        // creation des tickets;
        List<Ticket>maListe = new ArrayList<Ticket>();
        Ticket ticket = new Ticket((long) 1, new Date("03/01/2019"), "Infirmier", (double) 1000, patient);
        Ticket ticket1 = new Ticket((long) 1, new Date("12/12/2018"), "Dentiste", (double) 2000, patient1);
        Ticket ticket2 = new Ticket((long) 1, new Date("12/12/2018"), "Dentiste", (double) 2000, patient2);
        System.out.println("Patirnt: ");
        System.out.println(patient.toString());
        System.out.println("Ticket:");
        System.out.println(ticket.toString());
        maListe.add(ticket);
        maListe.add(ticket1);
        maListe.add(ticket2);
//        System.out.println(maListe);

    }
}
