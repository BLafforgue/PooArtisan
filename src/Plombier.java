import java.util.Date;

public class Plombier extends Artisan {
    private Integer nbMarqueCertifiee;

    public Plombier(String code, String prenom, String nom, Date dateDebutCarriere, Integer nbMarqueCertifiee) {
        super(code, prenom, nom, dateDebutCarriere);
        this.nbMarqueCertifiee = nbMarqueCertifiee;
    }

    public Integer getNbMarqueCertifiee() {
        return nbMarqueCertifiee;
    }

    public void setNbMarqueCertifiee(Integer nbMarqueCertifiee) {
        this.nbMarqueCertifiee = nbMarqueCertifiee;
    }

    @Override
    public String toString() {
        return " - Code : " + getCode() +
                "\n   Prénom : " + getPrenom() +
                "\n   Nom : " + getNom() +
                "\n   Date du début de carrière : " + getDateDebutCarriere() +
                "\n   Nombre de Marque Certifiée : " + nbMarqueCertifiee;
    }

    @Override
    public String toStringArtisans() {
        return "- "+ getNom() + " " + getPrenom() + " est certifiée de " + nbMarqueCertifiee + " marques";
    }
}
