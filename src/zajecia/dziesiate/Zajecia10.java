package zajecia.dziesiate;

import com.sun.org.apache.xpath.internal.operations.Or;
import zajecia.dziewiate.Address;
import zajecia.dziewiate.User;

import java.util.HashMap;

/**
 * Created by karamba on 2017-02-13.
 * dalsza czesc obiektow i ich obsluga
 */
public class Zajecia10 {
    /*
    HashMap<String, User> map = new HashMap<>(); // mapa obiekt powiazany z obiektem wzgledem klucza
    map.put("123", new User("Szymon", "Nowak", "sdkjhf"));
    map.put("2345", new User("Jan", "Kowalski", "asdff", new Address()));
    User user = map.get("123");
    map.forEach((k, v) -> {
        System.out.println(k);
        System.out.println(v);
        System.out.println();
    });*/

    public static void main(String[] args) {
        HashMap<Product, Integer> products = new HashMap<>();
        Product jablka = new Product("Jablka", "super swieze, zdrowe", 2.99);
        Product cebula = new Product("cebula", "lzowy masakrator", 0.99);
        Product pyry = new Product("pyry", "kwiat podziemnej pomaranczy", 1.99);

        Client client = new Client("Bozydar", "Archangielski", "988-345-678", new Address("Polska", "Poznan", "Lutycka", 22, "61-220"));

//        System.out.println(client.toString());

        products.put(jablka, 50);
        products.put(cebula, 500);
        products.put(pyry, 100);
        Warehouse warehouse = new Warehouse(products);
        System.out.println(warehouse.get(cebula, 450));

    }


}


