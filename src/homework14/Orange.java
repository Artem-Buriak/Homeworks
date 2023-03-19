package homework14;
//2.2 Створити типи Apple, Orange які продають тип Fruit.
public class Orange extends Fruit{
    public static String type = "Orange";
    public Orange() {
        this.weight = 1.5F;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Orange";
    }
}
