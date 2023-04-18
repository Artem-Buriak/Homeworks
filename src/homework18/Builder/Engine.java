package homework18.Builder;

public class Engine {
    private final double volume;
    private final boolean isTurbo;

    public Engine(double volume, boolean isTurbo) {
        this.volume = volume;
        this.isTurbo = isTurbo;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "volume=" + volume +
                ", isTurbo=" + isTurbo +
                '}';
    }
}
