package Task_9.Tayps;

/*
Написать класс, который умеет хранить в себе массив любых типов данных (int, long
etc.). Реализовать метод get(int index), который возвращает любой элемент
массива по индексу.

 */
public class DataTypes <T>{
 static Object [] object ={12,"dsd",23, 22.1};

    public static void getContent(int index){
        if(index > object.length-1){
            System.out.println("Индекс превысил количество элементов в массиве");
            return;
        }if(index <0) {
            System.out.println("Индекс должен быть положительным или равным нулю");
            return;
        }
        System.out.println(object[index]);
       }



}
