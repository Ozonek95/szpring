package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.f_ziarna_świadome_kontekstu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Ziarno świadome kontekstu w którym się znajduje poprzez wstrzyknięcie go do pola klasy poprzez {@code @Autowired}.
 * Przypomnę tylko, że wstrzykiwanie zależności bezpośrednio do pola jest złą praktyką.
 *
 * @author Marcin Ogorzalek
 */
@Component
class ŚwiadomeZiarnoAdnotacja {

  @Autowired
  ApplicationContext kontekstAplikacjiAdnotacja;

  void użycieZiarna() {
    System.out.println("Metoda z ŚwiadomeZiarnoAdnotacja");
    kontekstAplikacjiAdnotacja.getBean(Ziarno.class).metodaZiarenka();
  }
}
