package hw34;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() {
        products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public List<Product> getProducts() {
        return products;
    }
}