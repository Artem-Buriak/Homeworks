package hw34;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Scanner;

@Component
@Scope("prototype")
public class CartController {
    private final ProductRepository productRepository;
    private final Cart cart;

    @Autowired
    public CartController(ProductRepository productRepository) {
        this.productRepository = productRepository;
        this.cart = new Cart();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Додати товар до кошика");
            System.out.println("2. Видалити товар з кошика");
            System.out.println("3. Показати вміст кошика");
            System.out.println("4. Вийти");

            System.out.print("Виберіть опцію: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    addProductToCart(scanner);
                    break;
                case 2:
                    removeProductFromCart(scanner);
                    break;
                case 3:
                    showCartContents();
                    break;
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Невірна опція");
            }

            System.out.println();
        }
    }

    private void addProductToCart(Scanner scanner) {
        System.out.print("Введіть ID товару, який бажаєте додати до кошика: ");
        int productId = scanner.nextInt();
        Product product = productRepository.getProductById(productId);

        if (product != null) {
            cart.addProduct(product);
            System.out.println("Товар успішно додано до кошика.");
        } else {
            System.out.println("Товар з таким ID не знайдено.");
        }
    }

    private void removeProductFromCart(Scanner scanner) {
        System.out.print("Введіть ID товару, який бажаєте видалити з кошика: ");
        int productId = scanner.nextInt();

        cart.removeProduct(productId);
        System.out.println("Товар успішно видалено з кошика.");
    }

    private void showCartContents() {
        List<Product> products = cart.getProducts();

        if (products.isEmpty()) {
            System.out.println("Кошик порожній.");
        } else {
            System.out.println("Вміст кошика:");
            for (Product product : products) {
                System.out.println(product.getId() + ". " + product.getName() + " - " + product.getPrice());
            }
        }
    }
}