package Product;

public class Bread extends Product { // Liskov substitution principle. этот класс наследник вполне может
    // заменить предка класс Product

    private String grade;

    public Bread(String name, String grade, String trademark, double price, int article) {
        super(name, trademark, price, article);
        this.grade = grade;  // Open-closed principle. У данного класса наследника добавилось поле,
        // расширяющее характеристику продукта (класса Product)
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return   name + " " + grade +
                ", торговая марка: " + trademark +
                ", цена: " + price +
                ", артикул: " + article;
    }
}
