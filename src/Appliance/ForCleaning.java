package Appliance;

    public class ForCleaning extends ForHoum {
        public ForCleaning(String name) {
            super(name);
        }

        @Override
        public void cleanUp() {
            super.cleanUp();
            System.out.println("Начинаю уборку");
        }
    }

