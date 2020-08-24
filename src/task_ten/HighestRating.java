package task_ten;

import java.util.*;

/*
Создать список оценок учеников с помощью ArryList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.
 */
public class HighestRating {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Integer> reiting = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            reiting.add(random.nextInt(10) + 1);
            System.out.print(reiting.get(i)+ " ");
        }

        System.out.println();

        Iterator<Integer> i = reiting.iterator();
        Integer applicant = i.next();

        while (i.hasNext()) {
            Integer next = i.next();
            if (next.compareTo(applicant) > 0)
                applicant = next;
        }
        System.out.println(applicant);;
    }

}


