package BookStore.bookstore.service.exceptions;

import java.io.Serializable;

public class MessageFieldMissing implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fieldName;
    private String message;

    public MessageFieldMissing() {
        super();
    }

    public MessageFieldMissing(String fieldName, String message) {
        this.fieldName = fieldName;
        this.message = message;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
