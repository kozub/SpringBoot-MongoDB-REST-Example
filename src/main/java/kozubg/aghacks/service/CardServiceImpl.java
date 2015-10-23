package kozubg.aghacks.service;

import kozubg.aghacks.controller.CardDTO;
import kozubg.aghacks.entity.Card;
import kozubg.aghacks.exception.EntityNotFoundException;
import kozubg.aghacks.repository.CardRepository;
import kozubg.aghacks.utils.CardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kozub on 24.10.15.
 */
@Service
public class CardServiceImpl implements CardService {

    @Autowired
    private CardRepository repository;

    @Override
    public CardDTO create(CardDTO cardDTO) {
        Card created = CardMapper.toCard(cardDTO);
        created = repository.save(created);
        return CardMapper.toDTO(created);
    }

    @Override
    public CardDTO findById(String id) {
        Card found = repository.findOne(id).orElseThrow(EntityNotFoundException::new);
        return CardMapper.toDTO(found);
    }
}
