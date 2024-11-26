package ai.ednova.app.exceptions;

import ai.ednova.app.constants.ErrorsMessages;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.io.Serial;

@ResponseStatus(HttpStatus.BAD_REQUEST)
@Getter
@Setter
public class BadRequestException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L; // Ajout d'un identifiant de version

    private String message;

    // Constructeur avec message
    public BadRequestException(String message) {
        super(message); // Passer le message à la classe parent
        this.message = message;
    }

    // Constructeur par défaut pour permettre la création sans message
    public BadRequestException() {
        super(ErrorsMessages.BAD_REQUEST_MESSAGE); // Message par défaut
        this.message = ErrorsMessages.BAD_REQUEST_MESSAGE;
    }
}
