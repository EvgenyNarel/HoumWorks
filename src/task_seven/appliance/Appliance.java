package task_seven.appliance;

public abstract class Appliance {
    String name;
    boolean electra;
    boolean tornOn;

    public Appliance(String name) {
        this.name = name;
    }

    Appliance(String name, boolean electra) {
        this.name = name;
        this.electra = electra;
    }

    protected   void turnON() {
        System.out.println(name + " вкл. в розетку");
        tornOn = true;
    }

    protected void turnOFF() {
        if (tornOn == true) {
            System.out.println(name + " выкл. из розетки");
        } else{
            System.out.println(name+" Прибор не включен в розетку");
        }
    }

}

