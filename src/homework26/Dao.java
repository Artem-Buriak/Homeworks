package homework26;

import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface Dao<T> {
    void get(long id) throws SQLException;
    void getAll() throws SQLException;
    void save(T t) throws SQLException;
    void update(T t, String[] params);
    void delete(T t) throws SQLException;

}
