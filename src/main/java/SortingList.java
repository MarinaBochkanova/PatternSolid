public interface SortingList { // Interface segregation principle логическое разделение функций, интерфейс сортирует
    // список, но не добавляет и не удаляет товары.
    void filterByWords(String word);
    void filterByPrice();
    void filterByTrademark (String trademark);
}
