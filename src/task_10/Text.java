package task_10;

import java.util.*;

/*
Имеется текст. Следует составить для него частотный словарь.

 */
public class Text {
    public static void main(String[] args) {
        String stroka = "test,test,word,sentence      words number  is   eight";


        String i[] = stroka.split("\\p{P}|\\s+");

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String t : i) {

            if (map.containsKey(t)) {       //проверяем имеется ли такой ключ в mape если да то
                map.put(t, map.get(t) + 1); // добавляем только значение, а map.get(t) +1  - возвращает значение объекта, ключ которого равен t и добавляет 1

            } else {                            //если ключа нет, добавляем в map К,V=1;
                map.put(t, 1);
            }
        }

        Set<String> keys = map.keySet();        // возвращает все ключи LinkedHashMap
        int counter = 0;
        for (String key : keys) {       //пробегаемся по всем ключам keys
            if (map.get(key) == 1) {    //смотрим сколько слов в тексте не разу не повторилось
                counter++;
            }
            System.out.print(key);//выводим ключ
            System.out.println(" : " + map.get(key));//выводим значение
        }
        System.out.println("Уникальных слов: " + counter);
    }
}






