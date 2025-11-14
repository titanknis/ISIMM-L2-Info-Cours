package ex4;

public class TestMetiers {
  public static void main(String[] args) {
    Personne[] personnes = new Personne[3];
    personnes[0] = new Menuisier("Paul");
    personnes[1] = new Plombier("Jean");
    personnes[2] = new Menuisier("Andrien");
    for (int i = 0; i < personnes.length; i++) {
      personnes[i].afficher();
    }
  }
}

abstract class Personne {
  protected String nom;

  public Personne(String nom) {
    this.nom = nom;
  }

  public abstract void afficher();
}

class Menuisier extends Personne {
  public Menuisier(String nom) {
    super(nom);
  }

  public void afficher() {
    System.out.println("Je suis " + nom + " le Menuisier");
  }
}

class Plombier extends Personne {
  public Plombier(String nom) {
    super(nom);
  }

  public void afficher() {
    System.out.println("Je suis " + nom + " le Plombier");
  }
}
