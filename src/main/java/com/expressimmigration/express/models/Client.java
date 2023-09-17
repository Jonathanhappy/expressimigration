package com.expressimmigration.express.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Objects;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Client {
    @Id
    private Integer clientId;
    private String nom ;
    private String prenom;
    private String email;
/*
    public Client() {
    }

    public Client(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(nom, client.nom) && Objects.equals(prenom, client.prenom) && Objects.equals(email, client.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, email);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                '}';
    }*/

}
