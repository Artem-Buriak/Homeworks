package homework26;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class LessonDao implements Dao<Lesson>{

    @Override
    public void get(long id) throws SQLException {
        String query = "select * from Lesson where id = "+id+";";
        System.out.println("QUERY: "+query);
        Main.dbc.execute(query);
    }

    @Override
    public void getAll() throws SQLException {
        String query = "select * from Lesson";
        System.out.println("QUERY: "+query);
        Main.dbc.execute(query);
    }

    @Override
    public void save(Lesson lesson) throws SQLException {
        String query = "insert into Lesson (name, homework_id) values "
                +"(\'"+lesson.getName()+"\', "+lesson.getHomework().getId()+");";
        System.out.println("QUERY: "+query);
        Main.dbc.execute(query);
        //Database has autoincrement ID
        //We need to know Id from database to provide data consistency and set ID from DB to our Java Object
        lesson.setId(Main.dbc.executeId("select max(id) from Lesson"));
    }

    @Override
    public void update(Lesson lesson, String[] params) {

    }

    @Override
    public void delete(Lesson lesson) throws SQLException {
        String query = "delete from Lesson where id = "+lesson.getId()+";";
        System.out.println("QUERY: "+query);
        Main.dbc.execute(query);
    }
}
