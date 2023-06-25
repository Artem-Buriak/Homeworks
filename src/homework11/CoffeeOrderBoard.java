package homework11;
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//1. Створити клас CoffeeOrderBoard. Клас є цифровим поданням черги замовлень у кав'ярні.
//Цей клас містить список замовлень.
public class CoffeeOrderBoard {

    public final Map<Integer, Order> orderBoard = new HashMap<>();
    public static int orderNumber = 0;
    private static final Logger logger = LogManager.getLogger(CoffeeOrderBoard.class);

    public CoffeeOrderBoard() {
        System.out.println("New board was created");
    }

    @Override
    public String toString() {
        return "CoffeeOrderBoardLog{" +
                "orderBoard=" + orderBoard +
                '}';
    }

    //3. Реалізувати метод add у класі CoffeeOrderBoard.
//Даний метод додає нове замовлення та надає замовленню номер (натуральний порядок).
    public void add(Order order) {
        orderNumber++;
        order.setNumber(orderNumber);
        orderBoard.put(orderNumber, order);
        logger.info("new order was added");
        System.out.println("Result of method add(): new order "+orderNumber+" | "+order.getClientName()+" - "+order.getProduct());
    }

    //4. Реалізувати метод deliver у класі CoffeeOrderBoard. Цей метод видає найближче у черзі замовлення.
//Видача супроводжується видаленням замовлення зі списку
//Назвемо deliverLast, бо треба видати останнє замовлення
    public void deliverLast() {
        System.out.println("Result of method deliverLast(): last order with number "+orderNumber+" was delivered and removed");
        logger.info("get last order");
        orderBoard.remove(orderNumber);
    }


    //5. Реалізувати метод deliver у класі CoffeeOrderBoard. Даний метод видає замовлення з певним номером.
//Видача супроводжується видаленням замовлення зі списку.
//Даний метод обробляє ситуацію, коли замовлення, що надійшло пізніше, готове раніше.
    public void deliver(int number) {
        System.out.println("Result of method deliver(): order with number "+number+" was delivered and removed");
        logger.info("deliver order by id");
        orderBoard.remove(number);
    }


    //6. Реалізувати метод draw у класі CoffeeOrderBoard. Цей метод виводить у консоль інформацію
//про поточний стан черги у порядку найближчого до видачі замовлення.
    public void draw() {
        System.out.println("Result of method draw()\nCurrent list of orders:");
        logger.info("get current order list");
        orderBoard.forEach((key, value) -> {
            System.out.println(key + " | " + value.getClientName() + " - "+value.getProduct());
            System.out.println("---------------------------------");
        });
    }
}
