package kozubg.aghacks.service;

import kozubg.aghacks.controller.CardDTO;

/**
 * Created by kozub on 24.10.15.
 */
public interface CardService {

    CardDTO create(CardDTO cardDTO);
    CardDTO findById(String id);
}
