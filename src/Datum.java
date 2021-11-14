public class Datum {
    private int tag;
    private int monat;

    public Datum() {}
    public String berechneTag(String Datum){
        String tage;
       // int tag=0;
        tage = Datum.substring(1,3);
        tag=Integer.parseInt(tage);
        return tage;
    }
}
