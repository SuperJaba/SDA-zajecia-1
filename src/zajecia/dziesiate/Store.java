package zajecia.dziesiate;

import java.util.HashMap;

/**
 * Created by RENT on 2017-02-13.
 */
public class Store {
    private Warehouse warehouse;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public Store(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Order createOrder(Client client) {
        return new Order(client, new HashMap<>());
    }

    public void addToBasket(Order order, Product product, int amount) {
        if (warehouse.hasAmount(product, amount)) {
            order.addToOrder(product, amount);
        } else {
            System.out.println("sorry");
        }
    }

    public void finish(Order order) {
        HashMap<Product, Integer> basket = order.getBasket();
        basket.forEach((productInBasket, amountInBasket) -> {
            warehouse.get(productInBasket, amountInBasket);
        });
        System.out.println(order.finish());
    }
}
