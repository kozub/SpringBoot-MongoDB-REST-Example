package kozubg.aghacks.service;

import kozubg.aghacks.entity.User;
import kozubg.aghacks.controller.UserDTO;
import kozubg.aghacks.exception.EntityNotFoundException;
import kozubg.aghacks.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by kozub on 24.10.15.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDTO create(UserDTO userDTO) {
        User persistedUser = new User.Builder()
                .login(userDTO.getLogin())
                .token(userDTO.getToken())
                .build();

        persistedUser = repository.save(persistedUser);

        return convertToDTO(persistedUser);
    }

    @Override
    public UserDTO findByLogin(String login) {
        Optional<User> foundUser = repository.findOne(login);
        return convertToDTO(foundUser.orElseThrow(EntityNotFoundException::new));
    }

    private UserDTO convertToDTO(User user) {
        return new UserDTO.Builder()
                .id(user.getId())
                .login(user.getLogin())
                .token(user.getToken())
                .addedCard(user.getAddedCard())
                .build();
    }
}
