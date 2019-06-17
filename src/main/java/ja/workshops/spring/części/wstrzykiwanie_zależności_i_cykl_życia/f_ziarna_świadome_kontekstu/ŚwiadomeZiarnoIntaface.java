package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.f_ziarna_świadome_kontekstu;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Ziarno świadome kontekstu w którym się znajdujepoprzez wimplementację interfejsu {@code ApplicationContextAware}.
 *
 * @author Marcin Ogorzalek
 */
@Component
public class ŚwiadomeZiarnoIntaface implements ApplicationContextAware {

  ApplicationContext kontekstAplikacjiInterfejs;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.kontekstAplikacjiInterfejs = applicationContext;
    System.out.println("ŚwiadomeZiarnoIntaface setter");
  }

  void użycieZiarna() {
    System.out.println("Metoda z ŚwiadomeZiarnoIntaface");
    kontekstAplikacjiInterfejs.getBean(Ziarno.class).metodaZiarenka();
  }
}
