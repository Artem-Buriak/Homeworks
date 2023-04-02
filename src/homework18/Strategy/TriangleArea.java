package homework18.Strategy;

public class TriangleArea implements SquareStrategy{
    @Override
    public double getSquare(int side) {
        return ((side*side)*Math.sqrt(3.0))/4;
    }
}
