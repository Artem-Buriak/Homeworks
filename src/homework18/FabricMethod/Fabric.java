package homework18.FabricMethod;

public abstract class Fabric {
    public void start() {
        Furniture furniture = makeFurniture();
        furniture.push();
        furniture.put();
        furniture.getSquare();
    }
    public abstract Furniture makeFurniture();
}
