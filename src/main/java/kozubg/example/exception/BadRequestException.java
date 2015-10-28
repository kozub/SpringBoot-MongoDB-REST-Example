package kozubg.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by kozub on 24.10.15.
 */

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {
}
