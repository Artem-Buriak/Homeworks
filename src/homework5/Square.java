package homework5;
//Створити 3 класи, які реалізують цей інтерфейс: коло, трикутник, квадрат

public class Square implements Shapes{
    //Сторона
    private final double param;

    public Square(double param) {
        this.param = param;
    }

    @Override
    public double getSquare() {
        return param*param;
    }
}
