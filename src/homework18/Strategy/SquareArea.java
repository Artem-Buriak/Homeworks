package homework18.Strategy;

public class SquareArea implements SquareStrategy{
    @Override
    public double getSquare(int side) {
        return side*side;
    }
}
