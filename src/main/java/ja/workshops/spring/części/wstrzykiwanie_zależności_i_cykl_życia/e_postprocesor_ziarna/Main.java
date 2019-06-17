package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.e_postprocesor_ziarna;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * WAŻNE: W celu uzyskania instrukcji
 * umieść kursor na e_postprocesor_ziarna (pierwsza linijka tego pliku).
 *
 * @author Kacper Staszek
 */
@ComponentScan(basePackages = "ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.e_postprocesor_ziarna")
class Main {

  public static void main(String[] args) {
    ApplicationContext kontekst = new AnnotationConfigApplicationContext(Main.class);

    PierwszySuperTyp pierwszySuperTypImplOne = kontekst
        .getBean("pierwszySuperTypImplOne", PierwszySuperTyp.class);

    PierwszySuperTyp pierwszySuperTypImplTwo = kontekst
        .getBean("pierwszySuperTypImplTwo", PierwszySuperTyp.class);

    DrugiSuperTyp drugiSuperTyp = kontekst.getBean(DrugiSuperTyp.class);

    pierwszySuperTypImplOne.doStuff();
    pierwszySuperTypImplTwo.doStuff();
    drugiSuperTyp.doStuff();
  }
}
