import Product.Product;
import Product.Bread;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListProduct listProduct = new ListProduct();
        listProduct.addProduct(new Product("творог", "Вкуснотеево", 105, 3112));
        listProduct.addProduct(new Product("сметана", "Вкуснотеево", 89, 1110));
        listProduct.addProduct(new Product("молоко", "Домик в деревне", 84, 2624));
        listProduct.addProduct(new Bread("хлеб", "Пшеничный", "Хлебный дом", 64, 0114));//
        // Liskov substitution principle. этот класс наследник  может заменить предка класс Product

        listProduct.addProduct(new Bread("хлеб", "Ржаной", "Хлебный дом", 58, 0112));
        listProduct.addProduct(new Product("молоко", "Вкуснотеево", 80, 2515));
        listProduct.addProduct(new Product("шоколад", "Красный Октябрь", 109, 4210));

        System.out.println("Список товаров: ");
        listProduct.printOut();
        Scanner scanner = new Scanner(System.in);
        Console console = new Console();
        console.outputListProducts(listProduct, scanner);
        Basket basket = new Basket();
        basket.choiceGoods(scanner, listProduct);


    }

}
