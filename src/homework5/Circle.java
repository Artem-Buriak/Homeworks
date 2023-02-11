package homework5;
//Створити 3 класи, які реалізують цей інтерфейс: коло, трикутник, квадрат

public class Circle implements Shapes{
    //Радіус
    private final double param;

    public Circle(double param) {
        this.param = param;
    }

    @Override
    public double getSquare() {
        return 3.14*param*param;
    }
}
