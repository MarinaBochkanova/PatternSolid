import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Console {
    public void outputListProducts(ListProduct listProduct, Scanner scanner) {


        System.out.println("\n" + "Для сортировки списка введите цифру, соответствующую сортировке:" + "\n"
                + "1. Сортировка по наименованию товара." + "\n"
                + "2. Сортировка по торговой марке." + "\n"
                + "3. Сортировка по цене." + "\n"
                + "Если готовы перейти к выбору товара, введите любой символ.");


        while (true) {
            String input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("Введите наименование товара.");
                String wordInput = scanner.nextLine();
                listProduct.filterByWords(wordInput);
                System.out.println("Если хотите отсортировать список по возрастанию цены, введите 'да'. "
                        + " Если готовы перейти к выбору товара, введите любой символ.");
                String choice = scanner.nextLine();
                if (choice.equals("да")) {
                    listProduct.filterByPrice();
                } else {
                    break;
                }

            }
            if (input.equals("2")) {
                System.out.println("Введите наименование торговой марки.");
                String wordInput = scanner.nextLine();
                listProduct.filterByTrademark(wordInput);
                System.out.println("Если хотите отсортировать список по возрастанию цены, введите 'да'. "
                        + " Если готовы перейти к выбору товара, введите любой символ.");
                String choice = scanner.nextLine();
                if (choice.equals("да")) {
                    listProduct.filterByPrice();
                } else {
                    break;
                }
            }
            if (input.equals("3")) {
                listProduct.filterByPrice();
                break;
            }
            break;
        }

    }

}

