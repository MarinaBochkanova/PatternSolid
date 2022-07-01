import Product.Product;

public interface AddRemove { // Interface segregation principle логическое разделение функций, интерфейс добавляет и
    // удаляет товары сортирует но не сортирует список.

    void addProduct(Product product);
    void removeProduct(int index);
}
