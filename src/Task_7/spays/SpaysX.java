package Task_7.spays;

public class SpaysX implements IStart{
    @Override
    public boolean prelaunchCheck() {
        int x = (int) (Math.random() *2);
        if (x ==1) {
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

