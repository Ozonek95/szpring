package ja.workshops.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.silnik;

import ja.workshops.spring.części.konfiguracja.xml.a_wstrzykiwanie_zależności.Samochód;

/**
 * Ziarno springowe wstrzykiwane do klasy {@link Samochód Samochód}.
 *
 * @author Wiktor Rup
 */
public class Benzyna implements Silnik {
    public String start() {
        return "Pyr pyr pyr...";
    }
}
