package Task_7.appliance;

public class Supporting extends ForKitchen {
    boolean electra;

    public Supporting(String name, boolean electra) {
        super(name, electra);
    }



    @Override
    public int warmUp(int countWarmUp) {
        System.out.println("Подогревать: "+countWarmUp+" мин.");
        return countWarmUp;
    }
}