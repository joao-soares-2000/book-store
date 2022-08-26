package BookStore.bookstore.service.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{

    List<MessageFieldMissing> errors = new ArrayList<>();


    public ValidationError() {
        super();
    }

    public ValidationError(long timestamp, Integer status, String error) {
        super(timestamp, status, error);
    }

    public List<MessageFieldMissing> getErrors() {
        return errors;
    }

    public void addErrors(String fieldName, String message) {
        this.errors.add(new MessageFieldMissing(fieldName, message));
    }
}
