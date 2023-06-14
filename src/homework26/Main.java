package homework26;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    //static params
    public static Connection conn;
    public static DataBaseConnection dbc;
    private static Dao<Lesson> lessonDao;

    public static void main(String[] args) throws SQLException {
        //Creating connection
        lessonDao = new LessonDao();
        dbc = new DataBaseConnection();
        conn = dbc.getConnection();

        //Creating Homework (we need it to add Lesson)
        Homework hw1 = new Homework(1, "test", "first homework");

        //Creating Java Object - Lesson
        Lesson ls1 = new Lesson("From Idea", hw1);

        //Save created Lesson to Database
        lessonDao.save(ls1);

        //Now we know ID of our Lesson
        System.out.println("New Object in DB: "+ls1);

        //Let`s delete this lesson
        lessonDao.delete(ls1);

        //Return all Lessons
        lessonDao.getAll();

        //Return all concrete Lesson
        lessonDao.get(1);

        //Close connection
        dbc.close(conn);
    }
}
