package kozubg.example.service;

import kozubg.example.controller.UserDTO;
import kozubg.example.entity.User;
import kozubg.example.exception.BadRequestException;
import kozubg.example.exception.EntityNotFoundException;
import kozubg.example.repository.UserRepository;
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
        if (repository.findOne(userDTO.getLogin()).isPresent())
            throw new BadRequestException();

        User persistedUser = new User.Builder()
                .login(userDTO.getLogin())
                .token(userDTO.getToken())
                .addedCard(userDTO.getAddedCard())
                .build();

        persistedUser = repository.save(persistedUser);

        return convertToDTO(persistedUser);
    }

    @Override
    public UserDTO findByLogin(String login) {
        Optional<User> foundUser = repository.findOne(login);
        return convertToDTO(foundUser.orElseThrow(EntityNotFoundException::new));
    }

    @Override
    public UserDTO update(UserDTO userEntry) {
        User foundUser = repository.findOne(userEntry.getLogin()).orElseThrow(EntityNotFoundException::new);

        foundUser.setToken(userEntry.getToken());
        foundUser.setAddedCard(userEntry.getAddedCard());

        foundUser = repository.save(foundUser);
        return convertToDTO(foundUser);
    }

    @Override
    public UserDTO delete(String login) {
        User foundUser = repository.findOne(login).orElseThrow(EntityNotFoundException::new);
        repository.delete(foundUser.getId());

        return convertToDTO(foundUser);
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
