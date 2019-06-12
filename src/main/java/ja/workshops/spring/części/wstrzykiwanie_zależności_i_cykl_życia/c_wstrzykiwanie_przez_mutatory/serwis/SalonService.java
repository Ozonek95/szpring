package ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.serwis;

import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.repozytorium.SalonRepository;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Pracownik;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Salon;
import ja.workshops.spring.części.wstrzykiwanie_zależności_i_cykl_życia.c_wstrzykiwanie_przez_mutatory.domena.Samochód;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Marcin Ogorzalek
 */
@Service
public class SalonService {

  private SamochódService samochódService;
  private PracownikService pracownikService;
  private SalonRepository salonRepository;

  private Pracownik pracownik;

  @Autowired
  public void setSamochódService(SamochódService samochódService) {
    this.samochódService = samochódService;
  }

  @Autowired
  public void setPracownikService(PracownikService pracownikService) {
    this.pracownikService = pracownikService;
  }

  @Autowired
  public void setSalonRepository(SalonRepository salonRepository) {
    this.salonRepository = salonRepository;
  }

  @Autowired
  public void setPracownik(Pracownik pracownik) {
    this.pracownik = pracownik;
  }

  void wynajmijSamochód(Salon salon, Samochód samochód) {
    System.out.println("Wynajęcie "+samochód+" w salonie: "+salon);
    samochódService.wynajmijSamochód(samochód);
    salonRepository.zapisz(salon, samochód);
    pracownikService.przyznajPremię(pracownik);
  }

}
