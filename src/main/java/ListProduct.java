import Product.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListProduct implements AddRemove, SortingList {
    List<Product> listProduct = new ArrayList<>();
    int index;


    @Override
    public void addProduct(Product product) {
        listProduct.add(product);
    }

    @Override
    public void removeProduct(int index) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (i == (index - 1)) {
                listProduct.remove(i);
            }
        }
    }

    @Override
    public void filterByWords(String word) {
        List<Product> listSort = listProduct.stream()
                .filter(product -> product.getName().equals(word))
                .collect(Collectors.toList());
        listProduct = listSort;
        printOut();
    }

    @Override
    public void filterByPrice() {
        List<Product> listSort = listProduct.stream()
                .sorted(Comparator.comparing(product -> product.getPrice()))
                .collect(Collectors.toList());
        listProduct = listSort;
        printOut();
    }

    @Override
    public void filterByTrademark(String wordTrademark) {
        List<Product> listSort = listProduct.stream()
                .filter(product -> product.getTrademark().equals(wordTrademark))
                .collect(Collectors.toList());
        listProduct = listSort;
        printOut(); //DRY

    }

    public void printOut() { //DRY
        for (int i = 0; i < listProduct.size(); i++) { //принцип избегания магических чисел
            Product product = listProduct.get(i);
            System.out.println(i + 1 + ". " + product);
        }
    }


}
