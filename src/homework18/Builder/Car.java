package homework18.Builder;

public class Car {
    private CarType type;
    private int doors;
    private Engine engine;
    private Transmission transmission;
    private String colour;

    public Car(CarType type, int doors, Engine engine, Transmission transmission, String colour) {
        this.type = type;
        this.doors = doors;
        this.engine = engine;
        this.transmission = transmission;
        this.colour = colour;
    }

    public CarType getType() {
        return type;
    }

    public int getDoors() {
        return doors;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                ", doors=" + doors +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", colour='" + colour + '\'' +
                '}';
    }
}
