package hw34;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products;

    public ProductRepository() {
        products = new ArrayList<>();
        //create product list
        products.add(new Product(1, "product_1", 5.5));
        products.add(new Product(2, "product_2", 7.9));
        products.add(new Product(3, "product_3", 20.1));
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }
}