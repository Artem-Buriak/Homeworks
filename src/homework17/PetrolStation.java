package homework17;
//1.1. Створити клас PetrolStation. Клас імплементрізує заправну станцію.
//1.2 Клас PetrolStation містить властивість речовинного типу з ім'ям amount. Ця властивість становить кількість палива на станції.
//1.3 У класі PetrolStation реалізувати метод doRefuel. Метод набуває значення речовинного типу. При виконанні даного методу йде віднімання палива, що запитується, з доступної кількості.
//1.4 Одна заправка триває від 3-10 секунд. Після закінчення часу очікування, здійснює віднімання значення п.5
//1.5 Заправна станція може одночасно обслуговувати не більше 3 запитів.
public class PetrolStation {
    public float amount;

    public PetrolStation(float amount) {
        this.amount = amount;
    }

    public void doRefuel(int value) throws InterruptedException {
        System.out.println("Start refuel with thread "+Thread.currentThread().getName());
        if (Thread.activeCount()>5) {
            System.out.println("Try refuel(): another time, count of active threads is exceeded");
            return;
        }
        Thread.sleep((long) (Math.random()*7000+3000));
        this.amount -= value;
        System.out.println("Finish refuel with thread "+Thread.currentThread().getName()+" for "+value+" litres, rest: "+this.amount);
    }
}
