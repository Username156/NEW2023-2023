package Les;

public class Strom {

    int vyska_stromu;
    String typ_stromu;
    String nazov_stromu;

    public int getVyska_stromu() {
        return vyska_stromu;
    }

    public void setVyska_stromu(int vyska_stromu) {
        this.vyska_stromu = vyska_stromu;
    }

    public String getTyp_stromu() {
        return typ_stromu;
    }

    public void setTyp_stromu(String typ_stromu) {
        this.typ_stromu = typ_stromu;
    }

    public String getNazov_stromu() {
        return nazov_stromu;
    }

    public void setNazov_stromu(String nazov_stromu) {
        this.nazov_stromu = nazov_stromu;
    }

    public Strom(int vyska_stromu, String typ_stromu, String nazov_stromu) {
        this.vyska_stromu = vyska_stromu;
        this.typ_stromu = typ_stromu;
        this.nazov_stromu = nazov_stromu;


         new Strom(14,"Smrek","strom",);
    }
}