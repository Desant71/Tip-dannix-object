import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String maxName = null;//перем равна налу
        Scanner scanner = new Scanner(System.in);
        while (true) {//цикл
            System.out.println("Введите имя с большой буквы:");//вывод надпись
            String input = scanner.nextLine();
            if ("end".equals(input)) {//если ввели энд
                System.out.println("Программа завершена!");
                break;//заканчиваем программу
            }
            String name = input;//переимен переменую
            if (Character.isUpperCase(name.charAt(0))) {
            }else {
                System.out.println("Напиши имя с большой буквы");
                continue;
            }
            if (maxName == null) {
                System.out.println("Это первое введенное имя");
                maxName = name;
            }
            if (name.length() >= maxName.length()) {
                maxName = name;
                System.out.println("Самое длинное имя " + maxName);
            } else if (maxName.length() > name.length()) {
                System.out.println("Самое длинное имя " + maxName);
                System.out.println("Введенное имя меньше максимального на " + (maxName.length() - name.length()) + " символа");
            }
        }
    }
}