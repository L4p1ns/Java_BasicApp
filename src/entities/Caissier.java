package entities;

import java.util.Date;

public class Caissier extends Personne {
    private String email;
    private String password;

    public Caissier(String matricule, String nom, Date dateNaissance, String telephone, String sexe, String email, String password) {
        super(matricule, nom, dateNaissance, telephone, sexe);
        this.email = email;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
