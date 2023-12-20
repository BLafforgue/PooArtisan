import java.util.Date;

public class Electricien extends Artisan {
    private Integer nbPuissanceMaitrisee;

    public Electricien(String code, String prenom, String nom, Date dateDebutCarriere, Integer nbPuissanceMaitrisee) {
        super(code, prenom, nom, dateDebutCarriere);
        this.nbPuissanceMaitrisee = nbPuissanceMaitrisee;
    }

    public Integer getNbPuissanceMaitrisee() {
        return nbPuissanceMaitrisee;
    }

    public void setNbPuissanceMaitrisee(Integer nbPuissanceMaitrisee) {
        this.nbPuissanceMaitrisee = nbPuissanceMaitrisee;
    }

    @Override
    public String toString() {
        return " - Code : " + getCode() +
                "\n   Prénom : " + getPrenom() +
                "\n   Nom : " + getNom() +
                "\n   Date du début de carrière : " + getDateDebutCarriere() +
                "\n   Nombre de Puissance Maitrisée : " + nbPuissanceMaitrisee;
    }

    @Override
    public String toStringArtisans() {
        return "- "+ getNom() + " " + getPrenom() + " possède l'agrément " + nbPuissanceMaitrisee + " volts";
    }
}
