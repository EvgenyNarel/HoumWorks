package task_seven.appliance;

import java.util.Scanner;

public class Supporting extends ForKitchen {


    public Supporting(String name, boolean electra) {
        super(name, electra);
    }



    @Override
    public void warmUp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько минут подогревать:  ");
        String minutes = sc.next();
        System.out.println("Еда подогреется через "+minutes+" минут.");

    }
}