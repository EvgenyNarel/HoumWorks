package Appliance;

public class ForRelax extends ForHoum {

    public ForRelax(String name) {
        super(name);

    }

    @Override
    public void rewind() {
        super.rewind();
        System.out.println("Сейчас перемотаем");
    }
}