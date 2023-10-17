public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё(1025 ё(1105).
        for (int i = 0; i < 6000; i++) {
            if (i == 1025 || i ==1105){
                char c = (char) i;
                System.out.println(i + "-" + c); //Так же можно было посметить Ё и ё внутрь списка,
            }                                   // но тогда символы будут не по порядку, оставил так
            if (1040<=i && i<=1103){
                char c = (char) i;
                System.out.println(i + "-" + c);
            }

        }
    }
}
