package homework26;

public class Lesson {
    int id;
    String name;
    Homework homework;

    public String getName() {
        return name;
    }

    public Homework getHomework() {
        return homework;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Lesson(String name, Homework homework) {
        this.name = name;
        this.homework = homework;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", homework=" + homework +
                '}';
    }
}
