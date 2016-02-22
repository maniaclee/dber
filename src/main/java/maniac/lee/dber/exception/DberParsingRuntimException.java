package maniac.lee.dber.exception;

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
    public static DberParsingRuntimException build(Throwable cause) {
        return new DberParsingRuntimException(cause);
    }
    public static DberParsingRuntimException build(String cause) {
        return new DberParsingRuntimException(cause);
    }


}
