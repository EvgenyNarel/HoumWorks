package task_ten;

import java.util.ArrayList;
import java.util.Random;

/*
Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Удалить неудовлетворительные оценки из списка.
 */
public class Rating {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> reiting = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            reiting.add(random.nextInt(10) + 1);
            System.out.print(reiting.get(i)+" ");
        }
        System.out.println();
        reiting.removeIf(x -> x < 4);

        System.out.print(reiting);
    }
}
