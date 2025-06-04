package modell;

public class Auto {
    private String rndszam;
    private String datum;
    private String fizetesi_mod;
    private double tav;
    private int osszeg;
    private int borravalo;
    private String dohanyzas;

    public Auto(String sor) {
        String[] adatok = sor.split(";");
        rndszam = adatok[0];
        datum = adatok[1];
        fizetesi_mod = adatok[2];
        tav = Double.parseDouble(adatok[3]);
        osszeg = Integer.parseInt(adatok[4]);
        borravalo =  Integer.parseInt(adatok[5]);
        dohanyzas = adatok[6];
    }

    public Auto(String rndszam, String datum, String fizetesi_mod, double tav, int osszeg, int borravalo, String dohanyzas) {
        this.rndszam = rndszam;
        this.datum = datum;
        this.fizetesi_mod = fizetesi_mod;
        this.tav = tav;
        this.osszeg = osszeg;
        this.borravalo = borravalo;
        this.dohanyzas = dohanyzas;
    }

    public String getRndszam() {
        return rndszam;
    }

    public String getDatum() {
        return datum;
    }

    public String getFizetesi_mod() {
        return fizetesi_mod;
    }

    public double getTav() {
        return tav;
    }

    public int getOsszeg() {
        return osszeg;
    }

    public int getBorravalo() {
        return borravalo;
    }

    public String getDohanyzas() {
        return dohanyzas;
    }

    public String toString() {
        return "Auto{" + "rndszam=" + rndszam + ", datum=" + datum + ", fizetesi_mod=" + fizetesi_mod + ", tav=" + tav + ", osszeg=" + osszeg + ", borravalo=" + borravalo + ", dohanyzas=" + dohanyzas + '}';
    }
    
}
