import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import util.PriceUpdate;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Problema exemplo
         * Fazerumprogramaque,apartirdeumalistadeprodutos,aumenteo
         * preçodosprodutosem10%.
         */

        List<Product> list = new ArrayList<>();
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

       
        
        list.forEach(p ->p.setPrice(p.getPrice() * 1.1));
        

        list.forEach(System.out::println);

    }
}
