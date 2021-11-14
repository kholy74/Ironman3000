public class GirokontoTest {
    public static void main(String[] args) {
    Girokonto erstesKonto = new Girokonto(10000,1000);
    Girokonto zweitesKonto = new Girokonto(2000.5,1000);

    System.out.println("erste Kontonummer: "+erstesKonto.getKontonummer());
    System.out.println("Kontostand: "+erstesKonto.getKontostand());
    System.out.println("Dispokredit: "+erstesKonto.getDispokredit());
    System.out.println("zweite Kontonummer: "+ zweitesKonto.getKontonummer());
    erstesKonto.einzahlen(250);//weil die Methode "einzahlen" keine return anweisung erfasst
    System.out.println("Kontostand des ersten Kontos nach der Einzahlung: "+erstesKonto.getKontostand());
    System.out.println(erstesKonto.auszahlen(500));
    System.out.println(erstesKonto.auszahlen(1001));
    System.out.println(erstesKonto.ueberweisung(zweitesKonto,500));
    System.out.println(zweitesKonto.ueberweisung(erstesKonto,5000));
    System.out.println(erstesKonto.toString());
    System.out.println(zweitesKonto.toString());
    System.out.println("Anzahl der Konten: "+erstesKonto.getAnzahlkonten());




    }
}
