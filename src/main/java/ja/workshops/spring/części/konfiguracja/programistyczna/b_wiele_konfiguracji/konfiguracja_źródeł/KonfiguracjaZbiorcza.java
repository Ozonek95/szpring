package ja.workshops.spring.części.konfiguracja.programistyczna.b_wiele_konfiguracji.konfiguracja_źródeł;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Wojciech Makiela
 */
@Configuration
@Import({KonfiguracjaPetardy.class, KonfiguracjaGwiazdyNeutronowej.class})
public class KonfiguracjaZbiorcza {

}
