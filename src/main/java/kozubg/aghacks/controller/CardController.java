package kozubg.aghacks.controller;

import kozubg.aghacks.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Logger;

/**
 * Card REST API
 * Created by kozub on 24.10.15.
 */
@RestController
@RequestMapping("cartonik/api/v1/card")
public class CardController {

    private static final Logger logger = Logger.getLogger(CardController.class.toString());

    @Autowired
    private CardService cardService;

    @RequestMapping(method = RequestMethod.GET)
    public List<CardDTO> getAll() {
        logger.info("CardController.getAll");
        return cardService.findAll();
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public CardDTO get(@PathVariable("id") String id) {
        logger.info("CardController.get: " + id);
        return cardService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public CardDTO create(@RequestBody @Valid CardDTO cardEntry) {
        logger.info("CardController.create" );
        return cardService.create(cardEntry);
    }

    @RequestMapping(value = "{login}", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public CardDTO update(@RequestBody @Valid CardDTO cardEntry) {
        logger.info("CardController.create" );
        return cardService.update(cardEntry);
    }
}
