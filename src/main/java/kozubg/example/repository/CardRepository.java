package kozubg.example.repository;

import kozubg.example.entity.Card;
import org.springframework.data.repository.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Created by kozub on 24.10.15.
 */
public interface CardRepository extends Repository<Card, String> {

    Card save(Card saved);
    Optional<Card> findOne(String id);
    List<Card> findAll();
}
