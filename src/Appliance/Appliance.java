package Appliance;

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

    public void turnON() {
        System.out.println(name + " вкл. в розетку");
        tornOn = true;
    }

    public void turnOFF() {
        if (tornOn == true) {
            System.out.println(name + " выкл. из розетки");
        } else{
            System.out.println(name+" Прибор не включен в розетку");
        }
    }

}

