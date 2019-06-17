package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.f_ziarna_świadome_kontekstu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p><b>WAŻNE: Aby uzyskać instrukcję umieść kursor na f_ziarna_świadome_kontekstu (sama góra tego pliku) i wciśnij Ctrl+q</b></p>
 *
 * @author Marcin Ogorzalek
 */
@ComponentScan(basePackages = {"ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.f_ziarna_świadome_kontekstu"})
public class ZiarnaŚwiadomeKontekstuApp {

  public static void main(String[] args) {
    ApplicationContext kontekst = new AnnotationConfigApplicationContext(ZiarnaŚwiadomeKontekstuApp.class);
    kontekst.getBean(ŚwiadomeZiarnoAdnotacja.class).użycieZiarna();
    kontekst.getBean(ŚwiadomeZiarnoIntaface.class).użycieZiarna();
// FIXME: odkomentowanie poniższego wywołania spowoduje NullPointerException.
//    kontekst.getBean(NieświadomeZiarno.class).kontekstAplikacjiAdnotacja.getBean(Ziarno.class).metodaZiarenka();
// możliwe jest uzyskanie dowolnego ziarna obecnego w danym kontekście;
    kontekst
        .getBean(ŚwiadomeZiarnoIntaface.class)
        .kontekstAplikacjiInterfejs
        .getBean(ŚwiadomeZiarnoAdnotacja.class)
        .użycieZiarna();
  }

}
