package ja.workshops.spring.części.konfiguracja.programistyczna.b_wiele_konfiguracji.ziarno;

/**
 * @author Wojciech Makiela
 */
public class Petarda implements Wybuchable {
    @Override
    public void wybuchaj() {
        System.out.println("No i petarda... *Puff*");
    }
}
