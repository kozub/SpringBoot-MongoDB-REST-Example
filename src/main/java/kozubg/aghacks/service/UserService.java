package kozubg.aghacks.service;

import kozubg.aghacks.controller.UserDTO;

/**
 * Created by kozub on 24.10.15.
 */
public interface UserService {

    UserDTO create(UserDTO userDTO);
    UserDTO findByLogin(String login);
}
