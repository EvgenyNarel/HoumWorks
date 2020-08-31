package task_twelve.textFormater;

import java.io.*;
import java.util.ArrayList;

public class RunnerTextFormater {


    public static void main(String[] args) {


        ArrayList<String> selectedWords = new ArrayList<>();
        ArrayList<String> array = new ArrayList<>();
        String a = "\n";

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\training files\\ZZZ.txt"));
            String t;

            while ((t = bufferedReader.readLine()) != null) {//читает строки
                String text[] = t.split("[.!?...]");//разбиваю текст на предложения

                for (String tex : text) {

                    array.add(tex); //добавляю по предложению в лист

                }
            }
//            System.out.println(array);     //для проверки, разбивки текста на предложения
            for (int i = 0; i < array.size(); i++) {
                boolean p = TextFormater.palindrome(array.get(i));
                int counterWords = TextFormater.counterWords(array.get(i)); //посчитали сколько слов в каждом предложении
                if (counterWords >= 3 && counterWords <= 5) {    //проверяю количество слов в предложении
                    selectedWords.add(array.get(i));  //добавляю подходящие по условию предложения в новый список
                } else if (p == true) {
                    selectedWords.add(array.get(i));
                }
            }
//            System.out.println(selectedWords);
            BufferedOutputStream dataOutput = new BufferedOutputStream(new FileOutputStream("TextForm.txt"));

            for (int i = 0; i < selectedWords.size(); i++) {

                byte[] buffer = selectedWords.get(i).getBytes();
                byte[] s = a.getBytes();
                dataOutput.write(buffer, 0, buffer.length);
                dataOutput.write(s);
            }
            bufferedReader.close();
            dataOutput.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
