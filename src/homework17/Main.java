package homework17;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PetrolStation ps = new PetrolStation(1000);
        Thread thread1 = new Thread(){
            public void run(){
                try {
                    ps.doRefuel(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread2 = new Thread(){
            public void run(){
                try {
                    ps.doRefuel(88);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread3 = new Thread(){
            public void run(){
                try {
                    ps.doRefuel(25);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread4 = new Thread(){
            public void run(){
                try {
                    ps.doRefuel(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        //Implementing a queue in real Life
        thread1.start(); Thread.sleep(10);
        thread2.start(); Thread.sleep(10);
        thread3.start(); Thread.sleep(10);
        thread4.start();

        //Interrupting program to avoid mix of Threads in doRefuel()
        Thread.sleep(12000);

        System.out.println("\nWorking with ThreadSafeList");
        ThreadSafeList lst = new ThreadSafeList();
        //Testing ThreadSafeList in different threads
        Thread thread5 = new Thread(){
            public void run(){
                System.out.println("start "+this.getName());
                lst.add(1);
                lst.add(2);
                lst.add(3);
                lst.get(0);
                lst.remove(1);
                System.out.println("finish "+this.getName());
            }
        };
        Thread thread6 = new Thread(){
            public void run(){
                System.out.println("start "+this.getName());
                lst.add(5);
                lst.add(6);
                lst.add(7);
                lst.remove(2);
                lst.get(1);
                System.out.println("finish "+this.getName());
            }
        };

        thread5.start();
        thread6.start();
    }
}
