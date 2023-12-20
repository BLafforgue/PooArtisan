import java.util.Date;

public abstract class Artisan {
    private String code;
    private String prenom;
    private String nom;
    private Date dateDebutCarriere;

    public Artisan(String code, String prenom, String nom, Date dateDebutCarriere) {
        this.code = code;
        this.prenom = prenom;
        this.nom = nom;
        this.dateDebutCarriere = dateDebutCarriere;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateDebutCarriere() {
        return dateDebutCarriere;
    }

    public void setDateDebutCarriere(Date dateDebutCarriere) {
        this.dateDebutCarriere = dateDebutCarriere;
    }

    public abstract String toStringArtisans();
}
