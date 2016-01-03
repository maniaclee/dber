package psyco.dber.spring;

import psyco.dber.Dber;
import psyco.dber.exception.MappingException;

import java.util.Map;

/**
 * Created by lipeng on 16/1/3.
 */
public class DberClient {

    private Dber dber;

    public void registBean() throws MappingException {

        Map<Class<?>, Object> delegates = dber.getDelegates();
        if (delegates == null || delegates.isEmpty()) {
            throw new MappingException("no delegates are found.");
        }


    }
}
