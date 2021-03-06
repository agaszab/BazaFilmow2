package pl.javastart.app;

import pl.javastart.model.*;

import java.util.Scanner;

public class Filmweb {

    public static void main(String[] args) {

        System.out.println("Baza Filmów wersja 0.2");

        ConsoleDataReader consol = new ConsoleDataReader();


        Aktor aktor = new Aktor("Flavio", "Insinna", "Italy");
        Film film = new Film("Św Jan Bosko", "Lodovico Gasparini", 2004, "religijny", "Film o świętym Janie Bosko.", 5.0);  //String tytul, String rezyser, int rokProdukcji, String gatunek, String opis, double ocena
        Serial serial = new Serial("Na dobre i na złe", "Wojciech Wójcik", 1999, "obyczajowy", "Film o szpitalu w Leśniej Górze", 3.5, 1, 650); //String tytul, String rezyser, int rokProdukcji, String gatunek, String opis, double ocena, int iloscSezonow, int iloscOdcinkow

        aktor.showInfo();
        System.out.println("");
        film.showInfo();
        System.out.println("");
        serial.showInfo();

        Film film1 = new Film();
        consol.createMovie(film1);
        film1.showInfo();

        Serial serial1 = new Serial();
        consol.createTvSeries(serial1);
        serial1.showInfo();

        Aktor aktor1 = new Aktor();
        consol.createActor(aktor1);
        aktor1.showInfo();


    }
}
