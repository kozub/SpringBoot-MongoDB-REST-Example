package kozubg.aghacks.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by kozub on 23.10.15.
 */

@RestController
@RequestMapping("cartonik/api/v1/user")
public class UserController {

    @RequestMapping(value = "{id}",  method = RequestMethod.GET)
    String getTest(@PathVariable("id") String id) {
        return "Hello: " + id;
    }
}
