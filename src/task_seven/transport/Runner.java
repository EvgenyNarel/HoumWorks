package task_seven.transport;

public class Runner {
    public static void main(String[] args) {
        Military m = new Military(23,100,40,"FAU-40",4,2,3,true);
        m.catapult();
        m.shot();
        LightTransport s=new LightTransport(213,200,4,"Hummer",6,10,"Пикап",12);
        s.specifications();


    }
}

