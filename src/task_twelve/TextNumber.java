package task_twelve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

/*
Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
распечатать.
 */
public class TextNumber {
    public static void main(String[] args) {
        try {

            BufferedReader buf = new BufferedReader(new FileReader("D:\\training files\\numbers.txt"));
            int a;
            int sum = 0;
            String numb = "";
            while ((a = buf.read()) != -1) {

                if (Character.isDigit((char) a)) {
                    numb += (char) a;
                } else {
                    numb += (' ');
                }
            }
            Set<Integer> set = new LinkedHashSet<>();

            String getNumbers[];
            getNumbers = numb.trim().split("\\s+");
            int numArr[] = new int[getNumbers.length];

            for (int i = 0; i < getNumbers.length; i++) {
                numArr[i] = Integer.parseInt(getNumbers[i]);
                sum += numArr[i];
                System.out.print(numArr[i] + " ");
                set.add(numArr[i]);

            }
            System.out.println("  Сумма чисел равна: " + sum);

            System.out.println("Числа без повторов: " + set);
            buf.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
