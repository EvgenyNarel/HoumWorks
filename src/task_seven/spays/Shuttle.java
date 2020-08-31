package task_seven.spays;

/*
Шатл реализует интерфейс IStart.
• В методе предстартовой проверки генерируем случайное число в диапазоне от 0 до 10.
Если сгенерированное число больше 3-х то проверка прошла успешно. Если нет не успешно.
• В методе запуска двигателей выводим строку в консоль «Двигатели Шатла запущены. Все системы в норме.»
• В методе старт выводим строку в консоль. «Старт Шатла»

 */
public class Shuttle implements IStart {
    @Override
    public boolean prelaunchCheck() {
        int x = (int) (Math.random() * 11);
        if (x > 3) {
            System.out.println("Проверка прошла успешна");
            return true;
        } else{
            return false;
        }

    }

    @Override
    public void engineStarting() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");

    }
}

