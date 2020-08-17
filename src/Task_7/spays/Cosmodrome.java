package Task_7.spays;

import java.util.concurrent.TimeUnit;

/*
Метод запуск принимает объект типа IStart.
В методе первым делом осуществляем предстартовую проверку переданного объекта,
если она провалилась(метод вернул false) выводим сообщение «Предстартовая проверка провалена».
Если проверка прошла успешно, то производим запуск двигателей(вызываем метод запуска двигателя).
После этого производиться обратный отсчет (10 ..... 1).
После обратного отсчета вызываем метод старт переданного объекта.
Создаем класс Шатл.


 */
public class Cosmodrome {
    void launching(IStart start) throws InterruptedException {
        if (start.prelaunchCheck() == false) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            start.engineStarting();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                TimeUnit.SECONDS.sleep(1);
            }
            start.start();
        }
    }
}

