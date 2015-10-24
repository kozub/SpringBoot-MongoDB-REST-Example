package kozubg.aghacks.repository;

import kozubg.aghacks.entity.User;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.Optional;

/**
 * Interface UserRepository provides access to User document from MongoDB database.
 *
 * Created by kozub on 24.10.15.
 */
public interface UserRepository extends Repository<User, String>{

    User save(User saved);

    @Query(value = "{ 'login' : ?0}")
    Optional<User> findOne(String login);
}
