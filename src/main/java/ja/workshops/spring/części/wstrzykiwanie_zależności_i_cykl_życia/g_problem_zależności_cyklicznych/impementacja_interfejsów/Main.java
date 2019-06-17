package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.impementacja_interfejsów;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Jakub Czajka
 */
@ComponentScan(basePackages = {"ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.g_problem_zależności_cyklicznych.impementacja_interfejsów"})
class Main {

  public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(
        Main.class);
    ZiarnoA ziarnoA = context.getBean(
        ZiarnoA.class);
    ZiarnoB ziarnoB = context.getBean(
        ZiarnoB.class);
    ziarnoA.hello();
    ziarnoB.hello();

  }
}
