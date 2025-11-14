package ex2;

import java.time.LocalDate;

public class Date {
  private int jour;
  private int mois;
  private int annee;

  public Date(int jour, int mois, int annee) {
    this.jour = jour;
    this.mois = mois;
    this.annee = annee;
  }

  public Date() {
    LocalDate aujourdhui = LocalDate.now();
    this.jour = aujourdhui.getDayOfMonth();
    this.mois = aujourdhui.getMonthValue();
    this.annee = aujourdhui.getYear();
  }

  public Date ajouterJour(int nbjours) {
    LocalDate d = LocalDate.of(annee, mois, jour);
    LocalDate nouvelledate = d.plusDays(nbjours);
    return new Date(
        nouvelledate.getDayOfMonth(), nouvelledate.getMonthValue(), nouvelledate.getYear());
  }

  public String toString() {
    return jour + "/" + mois + "/" + annee;
  }
}
