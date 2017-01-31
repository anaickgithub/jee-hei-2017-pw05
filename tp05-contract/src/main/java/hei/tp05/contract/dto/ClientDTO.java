package hei.tp05.contract.dto;

/**
 * Created by Anaïck on 31/01/2017.
 */
public class ClientDTO {

    private String nom;
    private String prenom;

    public ClientDTO() {
    }

    public ClientDTO(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Client [nom=" + nom + ", prenom=" + prenom + "]";
    }
}
