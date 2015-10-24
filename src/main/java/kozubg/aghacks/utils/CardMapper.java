package kozubg.aghacks.utils;

import kozubg.aghacks.controller.CardDTO;
import kozubg.aghacks.entity.Card;

/**
 * Created by kozub on 24.10.15.
 */
public class CardMapper {
//TODO reflesją
    public static CardDTO toDTO(Card card) {
        return new CardDTO.Builder()
                .id(card.getId())
                .name(card.getName())
                .lastName(card.getLastName())
                .possition(card.getPossition())
                .address(card.getAddress())
                .phone(card.getPhone())
                .site(card.getSite())
                .mail(card.getMail())
                .tags(card.getTags())
                .build();
    }

    public static Card toCard(CardDTO cardDTO) {
        return new Card.Builder()
                .id(cardDTO.getId())
                .name(cardDTO.getName())
                .lastName(cardDTO.getLastName())
                .possition(cardDTO.getPossition())
                .address(cardDTO.getAddress())
                .phone(cardDTO.getPhone())
                .mail(cardDTO.getMail())
                .site(cardDTO.getSite())
                .tags(cardDTO.getTags())
                .build();
    }
}
