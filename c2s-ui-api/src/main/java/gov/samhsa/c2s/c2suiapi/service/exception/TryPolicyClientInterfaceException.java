package gov.samhsa.c2s.c2suiapi.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class TryPolicyClientInterfaceException extends RuntimeException {
    public TryPolicyClientInterfaceException() {
    }

    public TryPolicyClientInterfaceException(String message) {
        super(message);
    }
}
