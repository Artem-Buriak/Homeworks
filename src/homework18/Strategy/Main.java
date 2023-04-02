package homework18.Strategy;

public class Main {
    private static SquareStrategy strategy;

    public static void main(String[] args) {
        //String figure = "Square";
        //int side = 4;
        String figure = "Triangle";
        int side = 12;

        if (figure == "Square") {
            strategy = new SquareArea();
        } else if (figure == "Triangle") {
            strategy = new TriangleArea();
        } else {
            System.out.println("Unknown figure");
        }

        System.out.println("Area of "+figure+" with side "+side+" is "+strategy.getSquare(side));
    }
}
