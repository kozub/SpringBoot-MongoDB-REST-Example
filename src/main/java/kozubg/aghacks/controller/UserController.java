package kozubg.aghacks.controller;

import kozubg.aghacks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.logging.Logger;

/**
 * User REST API controller
 * Created by kozub on 23.10.15.
 */
@RestController
@RequestMapping("cartonik/api/v1/user")
public class UserController {

    private static final Logger logger = Logger.getLogger(UserController.class.toString());

    @Autowired
    private UserService userService;

    @RequestMapping(value = "{login}",  method = RequestMethod.GET)
    public UserDTO get(@PathVariable("login") String login) {
        logger.info("UserController.get: " + login);
        return userService.findByLogin(login);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public UserDTO create(@RequestBody @Valid UserDTO userEntry) {
        logger.info("UserController.create: ");
        return userService.create(userEntry);
    }

    @RequestMapping(value = "{login}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public UserDTO update(@RequestBody @Valid UserDTO userEntry) {
        logger.info("UserController.update");
        return userService.update(userEntry);
    }

    @RequestMapping(value = "{login}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public UserDTO delete(@PathVariable("login") String login) {
        logger.info("UserController.delete for: " + login);
        return userService.delete(login);
    }
}
