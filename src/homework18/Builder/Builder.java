package homework18.Builder;

public interface Builder {
    void setCarType(CarType type);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setColour(String colour);
    void setDoors(int doors);
}

