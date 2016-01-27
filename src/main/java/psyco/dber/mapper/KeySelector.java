package psyco.dber.mapper;

import psyco.dber.anno.Key;

/**
 * Created by lipeng on 16/1/12.
 */
public class KeySelector {

    public String sql;
    public int type ;

    public KeySelector(Key key) {
        this.sql = key.value();
        this.type = key.type();
    }

}
