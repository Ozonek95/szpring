/**
 * <h1>Prezentacja konfiguracji programistycznej - Przykład użycia.</h1>
 * Podczas zapoznania się z kodem w tym pakiecie zobaczych przykładową implementację
 * aplikacji webowej (instrukcja uruchomienia na samym dole).<br/>
 * Dowiesz się jak może wyglądać konfiguracja aplikacji webowej, oraz powtórzysz sobie czym są:
 * <ul>
 *     <li>{@link org.springframework.stereotype.Controller @Controller}</li>
 *     <li>{@link org.springframework.stereotype.Service @Service}</li>
 *     <li>{@link org.springframework.stereotype.Repository @Repository}</li>
 * </ul>
 *
 * <ol>
 *     <li>Przegląd kodu<br/>
 *          Polecam przypomnieć sobie czym są repozytoria, serwisy oraz kontrolery (w tej kolejności)
 *          <ol>
 *              <li>{@link ja.workshops.spring.części.konfiguracja.programistyczna.c_specjalistyczne_ziarna.RozsądneRepozytorium}</li>
 *              <li>{@link ja.workshops.spring.części.konfiguracja.programistyczna.c_specjalistyczne_ziarna.SuperSerwis}</li>
 *              <li>{@link ja.workshops.spring.części.konfiguracja.programistyczna.c_specjalistyczne_ziarna.KreatywnyKontroler}</li>
 *          </ol>
 *          W dokumentacji tych klas znajdziesz skrótowe przypomnienie czym są wspomniane stereotypy.
 *     </li><br/>
 *     <li>Konfiguracja<br/>
 *         W klasie {@link ja.workshops.spring.części.konfiguracja.programistyczna.c_specjalistyczne_ziarna.Konfiguracja} możesz znaleźć przykładową
 *         konfigurację aplikacji webowej. Przeczytaj proszę jej dokumentację.
 *         <br/>
 *         Zwróć uwagę na fakt, że do tej pory żadna z metod z adnotacją {@link org.springframework.context.annotation.Bean @Bean}
 *         nie była prywatna. Spróbuj teraz stworzyć nową metodę "konfiguracja()", która będzie zwracać instancje klasy {@link ja.workshops.spring.części.konfiguracja.programistyczna.c_specjalistyczne_ziarna.Konfiguracja},
 *         jednocześnie mając prywatny modyfikator dostępu. Po wprowadzeniu zmian spróbuj uruchomić aplikację.
 *     </li>
 * </ol>
 * <br/>
 * Aby uruchomić Tomcata użyj komendy:
 * <p>{@code mvn tomcat7:run}</p>
 * jeśli chcesz uruchomić go na innym porcie niż domyślny (8080), użyj polecenia
 * <p>{@code mvn tomcat7:run -Dmaven.tomcat.port=8888}</p>
 * <br/>
 * @author Wojciech Makiela
 */
package ja.workshops.spring.części.konfiguracja.programistyczna.c_specjalistyczne_ziarna;