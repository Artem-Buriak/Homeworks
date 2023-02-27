package homework5;
//Створити 3 класи, які реалізують цей інтерфейс: коло, трикутник, квадрат

public class Triangle implements Shapes{
    //Сторона
    private final double param;

    public Triangle(double param) {
        this.param = param;
    }

    @Override
    public double getSquare() {
        return (param*param*1.73)/4;
    }
}
