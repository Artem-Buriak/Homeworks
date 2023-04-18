package homework19;

import java.util.Date;

public class Product {
    public static int count = 0;
    int id;
    String type;
    double price;
    boolean discount;
    Date createDate;

    public Product(String type, double price, boolean discount, Date createDate) {
        this.id = count+1;
        count++;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", createDate=" + createDate +
                '}';
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}