package task_seven.appliance;

public class ForCoocing extends ForKitchen {

    public ForCoocing(String name, boolean electra) {
        super(name, electra);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Готовим вкусно!");
    }
}

