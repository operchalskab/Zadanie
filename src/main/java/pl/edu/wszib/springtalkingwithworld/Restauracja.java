package pl.edu.wszib.springtalkingwithworld;

public class Restauracja {

    public static double koszt (Klient klient){
        double wynik =25;
        if (klient.osobaTowarzyszaca){
            wynik += 15;
        }

        if (klient.dziecko){
            wynik += 40;
        }
        if (klient.zwierze){
            wynik += 20;
        }
        return wynik;
    }

}
