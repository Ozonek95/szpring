package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.f_ziarna_świadome_kontekstu;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Po mimo tego, że klasa ta ma zadeklarowaną metodę o sygnaturze identycznej jak w {@link ŚwiadomeZiarnoIntaface}
 * nie jest one świadome ApplicationContext. Dlatego też jego użycie powoduje NPM.
 *
 * @author Marcin Ogorzalek
 */
@Component
public class NieświadomeZiarno {

  ApplicationContext kontekstAplikacji;

  public void setKontekstAplikacji(ApplicationContext kontekstAplikacji) throws BeansException {
    this.kontekstAplikacji = kontekstAplikacji;
    System.out.println("ŚwiadomeZiarnoIntaface setter");
  }
}
