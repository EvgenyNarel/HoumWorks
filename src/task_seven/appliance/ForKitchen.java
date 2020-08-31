package task_seven.appliance;

public abstract class ForKitchen extends Appliance {

    public ForKitchen(String name, boolean electra) {
        super(name, electra);
    }

    public ForKitchen(String name){
        super(name);
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

    protected void warmUp() {

    }

    protected void unfreeze() {
    }

    protected void bake() {

    }
    protected void wash(){

    }


}
