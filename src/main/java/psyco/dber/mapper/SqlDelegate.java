package psyco.dber.mapper;

import java.util.List;

/**
 * Created by peng on 15/12/29.
 */
public interface SqlDelegate {

    List select(Sentence sentence, Object[] parameters);

    int update(Sentence sentence, Object[] parameters);

    int delete(Sentence sentence, Object[] parameters);

    Object insert(Sentence sentence, Object[] parameters);

}
