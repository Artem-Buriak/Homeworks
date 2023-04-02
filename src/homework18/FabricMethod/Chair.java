package homework18.FabricMethod;

public class Chair implements Furniture{
    @Override
    public void push() {
        System.out.println("You can push the chair");
    }

    @Override
    public void put() {
        System.out.println("You cann`t put smthing in the chair");
    }

    @Override
    public void getSquare() {
        System.out.println("You can calculate a square of the chair");
    }
}
