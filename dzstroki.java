//Написать программу, меняющую в символьной строке порядок слов на зеркальный и выводящую строку в обратном порядке.
//Пример:
//    • «язык программирования Java»- «avaJ яинавориммаргорп кызя»
import java.util.Scanner;
import java.util.*;
public class dzstroki {

        public static String obratnye_slova(String input) {
            String[] words = input.split(" ");
            StringBuilder reversed = new StringBuilder();

            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]);
                if (i != 0) {
                    reversed.append(" ");
                }
            }

            return reversed.toString();
        }

        public static String obratnaya_stroka(String input) {
            StringBuilder reversed = new StringBuilder();

            for (int i = input.length() - 1; i >= 0; i--) {
                reversed.append(input.charAt(i));
            }

            return reversed.toString();
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите строку:");
            String input = scanner.nextLine();

            String obr = obratnye_slova(input);
            String obr_str = obratnaya_stroka(obr);

            System.out.println("Обратная строка:");
            System.out.println(obr_str);


    }
}
