package Appliance;


    public class ForBath extends ForHoum {

        public ForBath(String name) {
            super(name);

        }


        @Override
        public void washСlothes() {
            super.washСlothes();
            System.out.println("Белье стирается");
        }
    }
