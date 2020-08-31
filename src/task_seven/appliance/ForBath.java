package task_seven.appliance;


    public class ForBath extends ForHome {

        public ForBath(String name) {
            super(name);

        }


        @Override
        public void washСlothes() {
            super.washСlothes();
            System.out.println("Белье стирается");
        }
    }

