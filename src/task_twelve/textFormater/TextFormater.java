package task_twelve.textFormater;

import java.util.ArrayList;

/*
2)Текстовый файл содержит текст. После запуска программы в другой файл
должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
предложении присутствует слово-палиндром, то не имеет значения какое кол-во
слов в предложении, оно попадает в новый файл.

Пишем все в ООП стиле. Создаём класс TextFormater
в котором два статических метода:
1. Метод принимает строку и возвращает кол-во слов в строке.
2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
есть возвращает true, если нет false

В main считываем файл.
Разбиваем текст на предложения. Используя методы класса TextFormater
определяем подходит ли нам предложение. Если подходит добавляем его в
новый файл

 */
public class TextFormater {

    public static int counterWords(String a) {

        int counterWords = 0;
        String word[] = a.trim().split("\\p{P}|\\s+");  //разбиваю предложение на слова
        for (String words : word) {
            counterWords++;                                   //считаю слова
            if (words.equals("")) {
                counterWords--;
            }
        }
//        System.out.println(counterWords);
        return counterWords;
    }

    public static boolean palindrome(String a) {
        boolean palindrom = false;
        String words[] = a.trim().split("\\p{P}|\\s+");
        for (String c : words) {
            if (c.length() > 2) {       //проверка на слова состоящие больше чез из 2 буквы
                StringBuffer wor = new StringBuffer(c);
                if (c.equalsIgnoreCase(wor.reverse().toString())) {

                    return palindrom = true;

                } else
                    palindrom = false;

            }
        }
        return palindrom;
    }
}
