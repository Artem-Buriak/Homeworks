package homework18.FabricMethod;

public class Table implements Furniture{
    @Override
    public void push() {
        System.out.println("You can push the table");
    }

    @Override
    public void put() {
        System.out.println("You can put smthing in the table");
    }

    @Override
    public void getSquare() {
        System.out.println("You can calculate a square of the table");
    }
}
