package homework14;
//2.2 Створити типи Apple, Orange які продають тип Fruit.
public class Apple extends Fruit{
    public static String type = "Apple";
    public Apple() {
        this.weight = 1.0F;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Apple";
    }
}
