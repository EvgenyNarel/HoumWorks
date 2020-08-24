package task_seven.appliance;

public class ForRelax extends ForHome {

    public ForRelax(String name) {
        super(name);

    }

    @Override
    public void rewind() {
        super.rewind();
        System.out.println("Сейчас перемотаем");
    }
}