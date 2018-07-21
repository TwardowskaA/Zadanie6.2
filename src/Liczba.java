public class Liczba {

    public int wynik(int x) {

        int wynik = 0;

        while (x != 0) {
            wynik = wynik + (x % 10);
            x = (x / 10);

        }

        return wynik;


    }
}


