package homework18.FabricMethod;

public class Main {

    public static void main(String[] args) {
        int a = (int) (Math.random()*100);
        Fabric fabric;
        if (a<=50) {
            System.out.println("We will make the chair");
            fabric = new FabricChair();
        } else {
            System.out.println("We will make the table");
            fabric = new FabricTable();
        }
        fabric.start();

    }
}
