package zajecia.dziesiate;

import java.util.*;

/**
 * Created by RENT on 2017-02-13.
 */
public class Order {
    private HashMap<Product, Integer> basket;
    private Client client;
    private Date data;
    private double price;

    public Order(Client client, HashMap<Product, Integer> basket) {
        this.client = this.client;
        this.basket = basket;
        this.data = new Date();
        this.price = countPrice();
    }

    public Order addToOrder(Product product, int amount) {
        if (basket.containsKey(product)) {
            Integer amountInBasket = basket.get(product);
            basket.put(product, amountInBasket + amount);
        } else {
            basket.put(product, amount);
        }
        return this;
    }

    public double finish() {
        return countPrice();
    }

    private double countPrice() {
        Set<Map.Entry<Product, Integer>> entries = basket.entrySet(); //wywolanie basket.entrySet().var
        Iterator<Map.Entry<Product, Integer>> iterator = entries.iterator(); //wywolanie -> entries.iterator().var
        double totalPrice = 0;
        while (iterator.hasNext()) {
            Map.Entry<Product, Integer> next = iterator.next();
            Product product = next.getKey();
            Integer amount = next.getValue();
            double price = product.getPrice();
            totalPrice += amount * price;
        }
        return totalPrice;
    }

    public HashMap<Product, Integer> getBasket() {
        return basket;
    }

    public Client getClient() {
        return client;
    }

    public Date getData() {
        return data;
    }

    public double getPrice() {
        return price;
    }
}
