package homework14;
//2.1 Створити базовий тип Fruit.
public class Fruit {
    public static String type = "Fruit";
    public float weight;

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Fruit";
    }
}
