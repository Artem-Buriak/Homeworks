package homework18.Builder;

public class Director {

    public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.COUPE);
        builder.setColour("Red");
        builder.setDoors(2);
        builder.setTransmission(Transmission.ROBOT);
        builder.setEngine(new Engine(2.0, true));
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.HATCHBACK);
        builder.setColour("Grey");
        builder.setDoors(5);
        builder.setTransmission(Transmission.CVT);
        builder.setEngine(new Engine(1.5, true));
    }

    public void constructFamilyCar(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setColour("White");
        builder.setDoors(5);
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setEngine(new Engine(2.4, false));
    }
}
