package kozubg.example.service;

import kozubg.example.controller.CardDTO;

import java.util.List;

/**
 * Created by kozub on 24.10.15.
 */
public interface CardService {

    CardDTO create(CardDTO cardDTO);
    CardDTO findById(String id);
    CardDTO update(CardDTO cardEntry);
    List<CardDTO> findAll();
}
