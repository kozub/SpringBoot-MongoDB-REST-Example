package kozubg.example.service;

import kozubg.example.controller.UserDTO;

/**
 * UserService defines operations on user entity
 *
 * Created by kozub on 24.10.15.
 */
public interface UserService {

    UserDTO create(UserDTO userDTO);
    UserDTO findByLogin(String login);
    UserDTO update(UserDTO userEntry);
    UserDTO delete(String login);
}
