package task_seven.appliance;

    public class ForCleaning extends ForHome {
        public ForCleaning(String name) {
            super(name);
        }

        @Override
        public void cleanUp() {
            super.cleanUp();
            System.out.println("Начинаю уборку");
        }
    }

