package psyco.dber.mapper;

import java.util.List;

/**
 * Created by lipeng on 16/1/4.
 */
public class SqlDelegaetImpl implements SqlDelegate {
    public List select(Sentence sentence, Object[] parameters) {
        System.out.println("select what the fuck");
        return null;
    }

    public int update(Sentence sentence, Object[] parameters) {
        return 0;
    }

    public int delete(Sentence sentence, Object[] parameters) {
        return 0;
    }

    public Object insert(Sentence sentence, Object[] parameters) {
        return null;
    }
}
