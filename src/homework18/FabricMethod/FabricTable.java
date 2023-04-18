package homework18.FabricMethod;

public class FabricTable extends Fabric{

    @Override
    public Furniture makeFurniture() {
        return new Table();
    }
}
