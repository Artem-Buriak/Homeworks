package homework18.FabricMethod;

public class FabricChair extends Fabric{
    @Override
    public Furniture makeFurniture() {
        return new Chair();
    }
}
