import java.util.Scanner;

public class Girokonto {
    static Scanner sc = new Scanner(System.in);
    private String kontonummer;
    private double kontostand;
    private double dispokredit;
    private static int anzahlkonten;

    Girokonto(double kontostand,double dispokredit){
        kontonummer = "0"+(822000000+ ++anzahlkonten);

        this.kontostand=kontostand;
        this.dispokredit=dispokredit;
        System.out.println();
    }


    public String getKontonummer() {
        return kontonummer;
    }

    public double getKontostand() {
        return kontostand;
    }

    public double getDispokredit() {
        return dispokredit;
    }

    public void setDispokredit(double kredit) {
        this.dispokredit = kredit;
    }
    public void einzahlen( double betrag){
        kontostand +=betrag;

    }

    public boolean auszahlen (double betrag){

        betrag =sc.nextDouble();
        if (betrag > 0){
        if (betrag<=kontostand && betrag<=dispokredit) {

                kontostand -= betrag;
                return true;
            }
            else return false;
        }else
        return false;
    }
    public boolean ueberweisung (Girokonto Zweiteskonto,double betrag){
        if (auszahlen(betrag)==true) {
          //  this.kontostand-=betrag;


            Zweiteskonto.einzahlen(betrag);

            return true;
        }else

        return false;
    }
    public String toString(){
        String tostring ="Kontonummer: "+kontonummer+','+" Kontostand: "+kontostand+','+" Dispokredit: "+dispokredit;

        return tostring;
    }
    public static int getAnzahlkonten() {

        return anzahlkonten;
    }

}
