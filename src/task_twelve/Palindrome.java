package task_twelve;

import java.io.*;
import java.util.ArrayList;


/*
В исходном файле находятся слова, каждое слово на новой стороке. После
запуска программы должен создать файл, который будет содержать в себе
только полиндромы

 */
public class Palindrome {


    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\training files\\Polindrome.txt"));
        String textOne;
        String a=" ";
        ArrayList<String> array = new ArrayList<>();
        while ((textOne = bufferedReader.readLine()) != null) {
            StringBuffer text = new StringBuffer(textOne);

            if (textOne.equalsIgnoreCase(text.reverse().toString())) {
                array.add(textOne);
           }
        }
        BufferedOutputStream dataOutput = new BufferedOutputStream(new FileOutputStream("Palindrom.txt"));
        System.out.println(array);
        for (int i = 0; i < array.size(); i++) {

            try {
                byte[] buffer = array.get(i).getBytes();
                byte[]s= a.getBytes();
                dataOutput.write(buffer, 0, buffer.length);
                dataOutput.write(s);
            } catch (IOException e) {
                e.getMessage();
            }
        }
        dataOutput.close();
    }
}

