package task_ten;

import java.util.*;


/*
Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
числа.
 */
public class RaitingRepeat {
    public static void main(String[] args) {
        Random random = new Random();

        LinkedList<Integer> reiting = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            reiting.add(random.nextInt(10) + 1);
            System.out.print(reiting.get(i)+" ");
        }
        System.out.println();
        Set<Integer> set = new LinkedHashSet<>(reiting);
        System.out.println(set);
    }
}

