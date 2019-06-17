package ja.workshops.spring.części.konfiguracja.programistyczna.a_witaj_swiecie;

/**
 * @author Wojciech Makiela
 */
class WitajŚwiecieZLicznikiem {

    private int poRazNty = 1;

    void run() {
        System.out.println("Hello World po raz " + poRazNty++);
    }
}
