package pl.javastart.app;

import pl.javastart.model.*;

import java.util.Locale;
import java.util.Scanner;


public class ConsoleDataReader {

    Scanner scan = new Scanner(System.in);


    Film createMovie(Film film) {

        System.out.println("Podaj tytuł: ");
        film.setTytul(scan.nextLine());

        System.out.println("Podaj reżysera: ");
        film.setRezyser(scan.nextLine());

        System.out.println("Rok produkcji: ");
        film.setRokProdukcji(scan.nextInt());
        scan.nextLine(); //pozbywa się "\n"

        System.out.println("Gatunek: ");
        film.setGatunek(scan.nextLine());


        System.out.println("Opis: ");
        film.setOpis(scan.nextLine());

        System.out.println("Ocena: ");
        scan.useLocale(Locale.US);
        film.setOcena(scan.nextDouble());
        scan.nextLine(); //pozbywa się "\n"


        return film;
    }


    Serial createTvSeries(Serial serial) {


        System.out.println("Podaj tytuł: ");
        serial.setTytul(scan.nextLine());

        System.out.println("Podaj reżysera: ");
        serial.setRezyser(scan.nextLine());

        System.out.println("Rok produkcji: ");
        serial.setRokProdukcji(scan.nextInt());
        scan.nextLine(); //pozbywa się "\n"

        System.out.println("Gatunek: ");
        serial.setGatunek(scan.nextLine());

        System.out.println("Ilość sezonów: ");
        serial.setIloscSezonow(scan.nextInt());
        scan.nextLine(); //pozbywa się "\n"

        System.out.println("Ilość odcinków: ");
        serial.setIloscOdcinkow(scan.nextInt());
        scan.nextLine(); //pozbywa się "\n"

        System.out.println("Opis: ");
        serial.setOpis(scan.nextLine());

        System.out.println("Ocena: ");
        scan.useLocale(Locale.US);
        serial.setOcena(scan.nextDouble());
        scan.nextLine(); //pozbywa się "\n"

        return serial;
    }


    Aktor createActor(Aktor aktor) {


        System.out.println("Imię: ");
        aktor.setImie(scan.nextLine());

        System.out.println("Nazwisko: ");
        aktor.setNazwisko(scan.nextLine());

        System.out.println("Kraj pochodzenia: ");
        aktor.setKrajPochodzenia(scan.nextLine());

        return aktor;

    }
}