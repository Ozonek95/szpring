/**
 * Ostatnią aletrnatywą jest zaimplementowanie intrfejsów
 * {@code ApplicationContextAware} : <a href = "https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/ApplicationContextAware.html">ApplicationContextAware</a>
 * <br><br>
 * {@code InitializingBean}: <a href = "https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/beans/factory/InitializingBean.html">InitializingBean</a>
 * <br><br>
 * Pierwszy daje nam dostęp do kontekstu aplikacji.
 * Drugi pozwala nam nadpisać metodę afterPropertiesSet() która pozwala z kontekstu utworzyc ziarno.
 *
 * <ol>
 *   {@link ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.impementacja_interfejsów.ZiarnoA ZiarnoA}
 *   <li>
 *     Dodaj do implemntacji {@code ApplicationContextAware} i {@code InitializingBean}. metoda setKontekstAplikacji powinna umożliwić Ci wyciagnięcie do zmiennej kontekstu,
 *     w metodzie afterPropertiesSet z pomocą kontekstu zapisz {@link ZiarnoA#ziarnoB} w zmiennej.
 *   </li>
 * </ol>
 *
 *
 * @author Jakub Czajka
 */
package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.impementacja_interfejsów;