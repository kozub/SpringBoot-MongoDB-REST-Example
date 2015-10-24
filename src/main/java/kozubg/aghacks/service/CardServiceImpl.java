package kozubg.aghacks.service;

import kozubg.aghacks.controller.CardDTO;
import kozubg.aghacks.entity.Card;
import kozubg.aghacks.exception.EntityNotFoundException;
import kozubg.aghacks.repository.CardRepository;
import kozubg.aghacks.utils.CardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public CardDTO update(CardDTO cardEntry) {
        Card mappedCard = CardMapper.toCard(cardEntry);
        mappedCard = repository.save(mappedCard);
        return CardMapper.toDTO(mappedCard);
    }

    @Override
    public List<CardDTO> findAll() {
        List<Card> cards = repository.findAll();
        return cards.stream().map(CardMapper::toDTO).collect(Collectors.toList());
    }

    @Override
    public CardDTO findById(String id) {
        Card found = repository.findOne(id).orElseThrow(EntityNotFoundException::new);
        return CardMapper.toDTO(found);
    }


}
