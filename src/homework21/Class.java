package homework21;

public class Class {
    @BeforeSuite
    public void firstMethod() {
        System.out.println("first method is ok (BeforeSuite)");
    }

    /*@BeforeSuite
    public void firstMethodTestException() {
        System.out.println("first method is ok");
    }*/
    @Test(priority = 99)
    public void veryLowestPriorityMethod() {
        System.out.println("vey lowest priority method is ok");
    }
    @Test(priority = 1)
    public void mainMethod() {
        System.out.println("main method is ok");
    }
    @Test(priority = 4)
    public void averagePriorityMethod() {
        System.out.println("average priority method is ok");
    }
    @Test(priority = 8)
    public void lowestPriorityMethod() {
        System.out.println("lowest priority method is ok");
    }
    @AfterSuite
    public void lastMethod() {
        System.out.println("last method is ok (AfterSuite)");
    }
}
