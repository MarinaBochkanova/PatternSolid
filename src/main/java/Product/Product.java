package Product;

public class Product { // Single-responsibility principle Класс только создает новый товар (продукт) Создание списка товаров,
    // добавление и удаление товаров из списка, сортировка списка и т.д. вынесено в отдельный класс ListProduct
    String name;
    String trademark;
    double price;
    int article;

    public Product(String name, String trademark, double price, int article) {
        this.name = name;
        this.trademark = trademark;
        this.price = price;
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setProducer(String trademark) {
        this.trademark = trademark;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getArticle() {
        return article;
    }

    public void setArticle(int article) {
        this.article = article;
    }

    @Override
    public String toString() {
        return name +
                ", торговая марка: " + trademark +
                ", цена: " + price +
                ", артикул: " + article;
    }
}
