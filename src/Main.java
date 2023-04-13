import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        String hello = "Hello";
        char[] chars = hello.toCharArray(); //получаем массив
        for (char c : chars) {
            System.out.println(c); //выводим в консоль
        }
        char firstChar = hello.charAt(0);
        System.out.println("Первая буква - " + firstChar);

        //Чтобы посчитать количество пробелов, нужно пройтись циклом по всем символам в строке и проверить, является ли каждый из этих символов пробелом.
        String str = "Это тестовая строка для подсчёта пробелов";
        int spaceCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Количество пробелов: " + spaceCount);

        //Для избавления от ненужных символов можно использовать метод trim().
        String text = "  Some spaces at the start and at the end   ";
        System.out.println("Исходный текст " + text);
        String clearedText = text.trim();
        System.out.println("Полученный текст " + clearedText);
        //Начиная с 11-й версии, в Java появился новый метод strip(), который убирает не только пробелы,
        // но и другие символы, которые могут считаться пробелами в различных кодировках.
        // Поэтому, если у вас JDK 11-й версии и выше, то предпочтительно использовать метод strip().


        //Предположим, что у вас есть небольшой текст, и вам нужно проверить, начинается ли он с цифры.
        // Как это сделать?
        // На помощь придёт метод isDigit класса Character — он как раз проверяет, является ли переданный ему в качестве параметра символ цифрой:

        String textt = "1990 year";
        if (Character.isDigit(textt.charAt(0))) {
            System.out.println("This is a digit");
        } else {
            System.out.println("This is not a digit");
        }
        //isLetter — проверяет, является ли переданный символ буквой;
        //isIdeographic — проверяет, является ли переданный символ иероглифом;
        //isJavaLetterOrDigit — проверяет, является ли переданный символ допустимым при именовании переменных и методов в Java.

        //Также класс Charset используется для задания кодировки текста. Чтобы узнать коды символов в данной кодировке, используем метод getBytes класса String:
        String teext = "Привет";
        byte[] textBytes = teext.getBytes(StandardCharsets.UTF_8);
        for (byte textByte : textBytes) {
            System.out.print(textByte + " ");
        }
    }

    }