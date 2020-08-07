package Appliance;

public abstract class ForKitchen extends Appliance {
    boolean electra;
    public ForKitchen(String name, boolean electra) {
        super(name, electra);
    }

    @Override
    public void turnON() {
        if (electra == true) {
            if (tornOn == true) {
                System.out.println(name + " выкл. из розетки");
            } else System.out.println(name + " Прибор не включен в розетку");
        }else System.out.println(" Прибор не электрический");
    }

    @Override
    public void turnOFF() {
        if (electra == true) {
            if (tornOn == true) {
                System.out.println(name + " выкл. из розетки");
            } else {
                System.out.println(name + " Прибор не включен в розетку");
            }
        }else {
            System.out.println(" Прибор не электрический");
        }
    }

    public ForKitchen(String name){
        super(name);
    }

    public int warmUp(int a) {
        return a;
    }

    public void unfreeze() {
    }

    public void bake() {

    }
    public void wash(){

    }


}
