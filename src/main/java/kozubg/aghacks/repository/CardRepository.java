package kozubg.aghacks.repository;

import kozubg.aghacks.entity.Card;
import org.springframework.data.repository.Repository;

import java.util.Optional;

/**
 * Created by kozub on 24.10.15.
 */
public interface CardRepository extends Repository<Card, String> {

    Card save(Card saved);
    Optional<Card> findOne(String id);
}
