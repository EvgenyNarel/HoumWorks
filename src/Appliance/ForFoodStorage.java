package Appliance;

public class ForFoodStorage extends ForKitchen {

    public ForFoodStorage(String name) {
        super(name);
    }


    @Override
    public void unfreeze() {
        super.unfreeze();
        System.out.println("Придется подождать пока все разморозится");
    }
}

