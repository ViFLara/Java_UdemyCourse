package udemy.course.exercise29.util;

import udemy.course.exercise29.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    // Increase the price by 10 percent
    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
