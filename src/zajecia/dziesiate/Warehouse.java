package zajecia.dziesiate;

import java.util.HashMap;

/**
 * Created by RENT on 2017-02-13.
 */
public class Warehouse {
    public Warehouse(HashMap<Product, Integer> werehouse) {
        this.werehouse = werehouse;
    }

    private HashMap<Product, Integer> werehouse;

    public boolean hasAmount(Product product, Integer amount) {
        boolean returnValue = false;
        if (werehouse.containsKey(product)) {
            Integer amountInWerehause = werehouse.get(product);
            returnValue = amountInWerehause >= amount;
        }
        return returnValue;
    }

    public HashMap<Product, Integer> get(Product product, int amount) {
        if (!hasAmount(product, amount)) {
            System.out.println("Brak towaru");
            return new HashMap<>();
        }
        Integer amountInWerehause = werehouse.get(product);
        werehouse.put(product, amountInWerehause - amount);

        HashMap<Product, Integer> products = new HashMap<>();
        products.put(product, amount);
        return products;
    }

    public void add(Product product, int amount) {
        boolean flag = true;
        if (werehouse.containsKey(product)) {
            Integer amountInWerehouse = werehouse.get(product);
            werehouse.put(product, amountInWerehouse + amount);
        } else {
            werehouse.put(product, amount);
        }
    }
}
