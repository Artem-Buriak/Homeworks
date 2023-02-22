package homework11;
//2. Створити клас Order. Клас є цифровим поданням замовлення. Даний клас містить номер замовлення та ім'я людини, що його замовила.
//Трохи додамо інформацію про замовлення для більшої діференціації
public class Order {
    private String clientName;
    private int number;
    private String product;

    public Order(String clientName, String product) {
        this.clientName = clientName;
        this.product = product;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Order{" +
                "clientName='" + clientName + '\'' +
                ", number=" + number +
                '}';
    }
}
