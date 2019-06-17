package ja.workshops.spring.części.konfiguracja.programistyczna.b_wiele_konfiguracji.ziarno;

/**
 * @author Wojciech Makiela
 */
public class GwiazdaNeutronowa implements Wybuchable {

    @Override
    public void wybuchaj() {
        System.out.println("Tak właściwie, to gwiazdy neutronowe nie wybuchają, " +
                "ale kto mi zabroni robić taki przykład? *Głośne kosmiczne Puff!*");
    }
}
