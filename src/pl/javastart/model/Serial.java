package pl.javastart.model;

public class Serial extends Film {

    private int iloscSezonow;
    private int iloscOdcinkow;

    public Serial(String tytul, String rezyser, int rokProdukcji, String gatunek, String opis, double ocena, int iloscSezonow, int iloscOdcinkow) {
        super(tytul, rezyser, rokProdukcji, gatunek, opis, ocena);
        this.iloscSezonow = iloscSezonow;
        this.iloscOdcinkow = iloscOdcinkow;
    }

    public Serial(int iloscSezonow, int iloscOdcinkow) {
        this.iloscSezonow = iloscSezonow;
        this.iloscOdcinkow = iloscOdcinkow;
    }

    public Serial() {

    }

    public void showInfo (){

        System.out.println("Tytuł: "+tytul+", Reżyser: "+rezyser+", Rok produkcji : "+rokProdukcji+", Gatunnek: "+gatunek+", Opis: "+opis+", Ilość sezonów: "+iloscSezonow+", Ilość odcinków: "+iloscOdcinkow+", Ocena: "+ocena);

    }

    public int getIloscSezonow() {
        return iloscSezonow;
    }

    public int getIloscOdcinkow() {
        return iloscOdcinkow;
    }

    public void setIloscSezonow(int iloscSezonow) {
        this.iloscSezonow = iloscSezonow;
    }

    public void setIloscOdcinkow(int iloscOdcinkow) {
        this.iloscOdcinkow = iloscOdcinkow;
    }
}