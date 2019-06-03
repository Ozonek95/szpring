package autowire.exerciseTwo.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author Marcin Ogorzalek
 */
@Component
public class Samochód {

  @Value("Czarna Wołga")
  private String marka;

  @Override
  public String toString() {
    return marka;
  }
}
