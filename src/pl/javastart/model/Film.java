package pl.javastart.model;

public class Film {

     String tytul;
     String rezyser;
     int rokProdukcji;
     String gatunek;
     String opis;
     double ocena;

    public Film(String tytul, String rezyser, int rokProdukcji, String gatunek, String opis, double ocena) {
        this.tytul = tytul;
        this.rezyser = rezyser;
        this.rokProdukcji = rokProdukcji;
        this.gatunek = gatunek;
        this.opis = opis;
        this.ocena = ocena;
    }

    public Film(){

    }

    public void showInfo (){

    System.out.println("Tytuł: "+tytul+", Reżyser: "+rezyser+", Rok produkcji : "+rokProdukcji+", Gatunnek: "+gatunek+", Opis: "+opis+", Ocena: "+ocena);

    }

    public String getTytul() {
        return tytul;
    }

    public String getRezyser() {
        return rezyser;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public String getGatunek() {
        return gatunek;
    }

    public String getOpis() {
        return opis;
    }

    public double getOcena() {
        return ocena;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public void setRezyser(String rezyser) {
        this.rezyser = rezyser;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }
}
