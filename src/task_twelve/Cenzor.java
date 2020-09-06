package task_twelve;
/*
3) Проверка на цензуру:
Создаете 2 файла.
1 - й. Содержит исходный текст.
2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
определите сами, хотите каждое слово на новой строке, хотите через запятую
разделяйте, ваша программа делайте как считаете нужным.
Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
встретилось ни одного недопустимого слова, то выводите сообщение о том что
текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
сообщение, кол-во предложений не прошедших проверку и сами предложения
подлежащие исправлению.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Cenzor {
    public static void main(String[] args) {
        HashSet<String> senteceIncorrect = new HashSet<>();
        ArrayList<String> arrayBlack = new ArrayList<>();

        try (FileWriter writer = new FileWriter("Task12.txt");
             FileWriter writer1 = new FileWriter("BlackList.txt")) {
            String text = "дом любовь окно. Аптека, фонарь покойся стол любовь.одни они. Иди сюда. Спокойная ты.";
            writer.write(text);
            writer.flush();
            String textBlack = "Любовь,чувства,покойся";
            writer1.write(textBlack);
            writer1.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }


        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Task12.txt"));
            BufferedReader bufferedReader2 = new BufferedReader(new FileReader("BlackList.txt"));
            String t;
            String black;
            while ((black = bufferedReader2.readLine()) != null) {    //записали в arrayBlack слова маркеры
                String blackWords[] = black.split("[,]");
                for (String blackWord : blackWords) {
                    arrayBlack.add(blackWord);
                }
            }
            while ((t = bufferedReader.readLine()) != null) {//читает строки
                String text[] = t.split("[.!?...]");//разбиваю текст на предложения

                for (String tex : text) {

                    String word[] = tex.trim().split("\\p{P}|\\s+");  //разбиваю предложение на слова
                    for (String words : word) {
                        for (int i = 0; i < arrayBlack.size(); i++) {
                            String b = arrayBlack.get(i);
                            if (words.equalsIgnoreCase(b)) {
                                senteceIncorrect.add(tex);
                            }

                        }

                    }
                }
            }
            if (senteceIncorrect.isEmpty()) {
                System.out.println("Текст прошёл проверку на цензуру");
            } else {
                System.out.println("Колличество предложений которые необходимо исправит: " + senteceIncorrect.size());
                Iterator<String> iterator = senteceIncorrect.iterator();
                while (iterator.hasNext()) {
                    System.out.println(iterator.next());

                }
            }
            bufferedReader.close();
            bufferedReader2.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

