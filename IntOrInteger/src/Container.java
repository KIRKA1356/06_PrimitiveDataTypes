public class Container {
    private Integer count = 0; //Или же можно написать private int count; Разницы нет, Объект класса Intger
                                // не может быть не задан, а примитив int автоматически подставит 0.

    public void addCount(int value) {
        count = count + value;
    }

    public int getCount() {
        return count;
    }
}
