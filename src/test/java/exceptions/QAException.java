package exceptions;

public class QAException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public QAException() {
    }

    public QAException(String message) {
        super(message);
    }

    public QAException(String message, Throwable throwable) {
        super(message, throwable);
    }

}


