package psyco.dber.exception;

/**
 * Created by peng on 16/1/23.
 */
public class DberParsingRuntimException  extends  RuntimeException{
    public DberParsingRuntimException(String message) {
        super(message);
    }

    public DberParsingRuntimException(Throwable cause) {
        super(cause);
    }
}
