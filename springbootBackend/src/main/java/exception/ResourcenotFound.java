package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourcenotFound extends RuntimeException {

	private static final long serialVersionUID =1L;
	
	public ResourcenotFound(String message) {
		super(message);
	}
}
