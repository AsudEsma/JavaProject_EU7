package classes.day48_collections_part3;

import classes.day46_collections_part1.Product;

import java.util.HashSet;
import java.util.Set;

public class HashSetOfProducts_LAMBDA {
    public static void main(String[] args) {
        // Create set collection and add new products

        Set<Product> prodSet = new HashSet();
        prodSet.add(new Product("eggs", 34.90));
        prodSet.add(new Product("book", 67.90));
        prodSet.add(new Product("cheese", 89.90));
        prodSet.add(new Product("meat", 199.90));

        System.out.println(prodSet);

        // Print each product by using for each loop:
        for (Product product : prodSet) {
            System.out.println(product);
        }

        // Print the prices only:
        for (Product product : prodSet) {
            System.out.println(product.getPrice());
        }

        // Print each product by using forEach method:  **LAMBDA**
        prodSet.forEach(product -> System.out.println(product));
        prodSet.forEach(p -> System.out.println(p.getName()));
        prodSet.forEach(smt -> System.out.println(smt.getPrice()));
    }
}
