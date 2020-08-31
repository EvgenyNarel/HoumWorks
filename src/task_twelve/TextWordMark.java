package task_twelve;

import java.io.*;
import java.util.ArrayList;

/*
Создать файл с текстом, прочитать, подсчитать в тексте количество знаков
препинания и слов.
 */
public class TextWordMark {
    public static void main(String[] args) {

        int counterWords = 0;
        int counterMarks = 0;

        try (FileWriter writer = new FileWriter("TextWordMark.txt"))
        {
            String text = " !Следует,    обратить внимание, что при ,чтении строки .символы завершения cтроки обрезаются, поэтому при    выводе    используется,   ,println!";

            writer.write(text);
            writer.flush();

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("TextWordMark.txt"));
            String t;

            while ((t = bufferedReader.readLine()) != null) {

                System.out.println(t);
                String text[] = t.trim().split("\\p{P}|\\s+");

                for (String tex : text) {
                    counterWords++;

                    if (tex.equals("")) {
                        counterWords--;
                        counterMarks++;
                    }

                }

            }
            System.out.println("Слов в тексте: " + counterWords);
            System.out.println("Знаков препинания в тексте: " + counterMarks);
            bufferedReader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



    }
}
