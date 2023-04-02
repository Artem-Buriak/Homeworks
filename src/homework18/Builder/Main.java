package homework18.Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();
        director.constructCityCar(builder);

        Car car = builder.getResult();
        System.out.println("Car built with CarBuilder:");
        System.out.println(car);
    }
}
