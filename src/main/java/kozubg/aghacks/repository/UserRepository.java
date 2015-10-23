package kozubg.aghacks.repository;

import kozubg.aghacks.entity.User;
import org.springframework.data.repository.Repository;

import java.util.Optional;

/**
 * Created by kozub on 24.10.15.
 */
public interface UserRepository extends Repository<User, String>{

    User save(User saved);
    Optional<User> findOne(String id);
}
