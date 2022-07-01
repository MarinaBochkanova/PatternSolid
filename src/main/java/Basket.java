import Product.Product;

import java.util.Scanner;

public class Basket {
    int[] basket;

    public void choiceGoods(Scanner scanner, ListProduct listProduct) {
        int[] basket = new int[listProduct.listProduct.size()]; //принцип избегания магческих чисел

        while (true) {
            System.out.println("Введите порядковый номер товара и количество товара через пробел или введите end");
            try {
                String input = scanner.nextLine();
                if (input.equals("end")) {
                    break;
                }
                String[] parts = input.split(" ");
                int productNumber = Integer.parseInt(parts[0]) - 1;  // номер продукта(ячейки)
                int productCount = Integer.parseInt(parts[1]);
                basket[productNumber] += productCount;

            } catch (RuntimeException exception) {
                System.out.println("Введенные данные не корректны.");
            }

            System.out.println();
            System.out.println("Ваша корзина:");
            System.out.println("Наименование товара    Количество   Цена/за.ед   Общая стоимость");

            int sumProducts = 0;   // итогова сумма заказа
            for (int i = 0; i < basket.length; i++) { // Принцип избегания магических чисел
                if (basket[i] > 0) {
                    Product nowProduct = listProduct.listProduct.get(i);
                    double priceProduct = nowProduct.getPrice();
                    double costProduct = basket[i] * priceProduct;
                    sumProducts += costProduct;
                    System.out.println(nowProduct.getName() + "            " +
                            "        " + basket[i] + "               " + nowProduct.getPrice()
                            + "           " + costProduct + " руб.");

                }

            }
            System.out.println("Итого:  " + sumProducts + " руб.");

        }
        System.out.println("Список заказа успешно сформирован!" + "\n"
                + "Спасибо за Ваш заказ!");
    }
}
