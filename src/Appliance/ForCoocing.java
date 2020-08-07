package Appliance;

public class ForCoocing extends ForKitchen {
    boolean electra;
    public ForCoocing(String name, boolean electra) {
        super(name, electra);
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("Готовим вкусно!");
    }
}

