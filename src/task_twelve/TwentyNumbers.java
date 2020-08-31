package task_twelve;

import java.io.*;
import java.util.Random;

/*
Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
распечатать числа и их среднее арифметическое.
 */
public class TwentyNumbers {
    public static void main(String[] args) throws IOException {

        Random random = new Random();
        double counter = 0;
        double sum = 0;
        DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream("datafile.txt"));

        for (int i = 0; i < 20; i++) {
            try {
                dataOutput.writeInt(random.nextInt(20) + 1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        dataOutput.close();

        DataInputStream dataInput = new DataInputStream(new BufferedInputStream(new FileInputStream("datafile.txt")));
        while (dataInput.available() > 0) {
            int first = dataInput.readInt();
            counter++;
            sum += first;

            System.out.print(first + " ");
        }
        double average = sum / counter;

        System.out.println("Среднее арифметическое равно: " + average);

        dataInput.close();
    }

}

