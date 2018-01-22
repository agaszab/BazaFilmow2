package pl.javastart.model;

public class Aktor {
    private String imie;
    private String nazwisko;
    private String krajPochodzenia;

    public Aktor(String imie, String nazwisko, String krajPochodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.krajPochodzenia = krajPochodzenia;
    }

    public Aktor() {
    }

    public void showInfo (){

    System.out.println("Imię: "+imie+", Nazwisko: "+nazwisko+", Kraj pochodzenia: "+krajPochodzenia);

    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getKrajPochodzenia() {
        return krajPochodzenia;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setKrajPochodzenia(String krajPochodzenia) {
        this.krajPochodzenia = krajPochodzenia;
    }
}


