package task_twelve;
/*
Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
должны быть распечатаны отдельно.
 */

import java.io.File;
import java.util.ArrayList;

public class LIstFile {
    public static void main(String[] args) {
        ArrayList<String> file = new ArrayList<>();
        ArrayList<String> folder = new ArrayList<>();

        File dir = new File("D:\\training files");
//         если объект представляет каталог
        if (dir.isDirectory()) {
//         получаем все вложенные объекты в каталоге
            for (File item : dir.listFiles()) {

                if (item.isDirectory()) {
                    folder.add(item.getName());


                    file.add(item.getName());
                }
            }
            System.out.println("Файлы каталога: " + file);
            System.out.println();
            System.out.println("Каталоги внутри каталога: " + folder);
        }
        System.out.println(" Это не каталог!!!");
    }
}
