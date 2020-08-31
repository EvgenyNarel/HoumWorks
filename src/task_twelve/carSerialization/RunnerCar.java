package task_twelve.carSerialization;
/*
4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
сериализации произвести обратный процесс

 */
import java.io.*;

public class RunnerCar {
    public static void main(String[] args) {
        //сериализация
        try (ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream("Car.txt"))) {
            Car car = new Car("BMW", 260, 200);
            a.writeObject(car);
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
//Десериализация
        try(ObjectInputStream b = new ObjectInputStream(new FileInputStream("Car.txt")))
        {
            Car car=(Car)b.readObject();
            System.out.printf("Brand: %s \t Speed: %d \t price: %d", car.getBrand(),car.getSpeed(),car.getPrice());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}

    class Car implements Serializable {
        private String brand;
        private int speed;
        private int price;

        public Car(String brand, int speed, int price) {
            this.brand = brand;
            this.speed = speed;
            this.price = price;
        }

        public String getBrand() {
            return brand;
        }

        public int getSpeed() {
            return speed;
        }

        public int getPrice() {
            return price;
        }
    }

