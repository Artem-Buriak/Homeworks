package homework18.Builder;

public class CarBuilder implements Builder{
    private CarType type;
    private int doors;
    private Engine engine;
    private Transmission transmission;
    private String colour;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Car getResult() {
        return new Car(type, doors, engine, transmission, colour);
    }
}
