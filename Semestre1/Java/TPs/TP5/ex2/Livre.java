package ex2;

public class Livre {
    private String titre;
    private String auteur;
    private int nbpages;
    private int anneedition;
    private boolean disponible;
    private Lecteur emprunteur; // nom corrigé : 'emprunteur' (pas 'Emprunter')

    // Constructeur
    public Livre(String titre, String auteur, int nbpages, int anneedition) {
        this.titre = titre;
        this.auteur = auteur;
        this.nbpages = nbpages;
        this.anneedition = anneedition;
        this.disponible = true;
        this.emprunteur = null;
    }

    // Getters et setters
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Lecteur getEmprunteur() {
        return emprunteur;
    }

    public void setEmprunteur(Lecteur emprunteur) {
        this.emprunteur = emprunteur;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNbpages() {
        return nbpages;
    }

    public int getAnneedition() {
        return anneedition;
    }

    // ---- Classe d'affichage ----
    public void afficher() {
        System.out.println("Titre : " + titre);
        System.out.println(" Auteur : " + auteur);
        System.out.println("Nombre de pages : " + nbpages);
        System.out.println("Année d’édition : " + anneedition);
        System.out.println("Disponible : " + (disponible ? "Oui" : "Non"));
        if (!disponible && emprunteur != null) {

    }
}

}
