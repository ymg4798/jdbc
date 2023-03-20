package hello.jdbc.repository.ex;

public class NyDuplicateKeyException extends MyDbException{
    public NyDuplicateKeyException() {
        super();
    }

    public NyDuplicateKeyException(String message) {
        super(message);
    }

    public NyDuplicateKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public NyDuplicateKeyException(Throwable cause) {
        super(cause);
    }
}
