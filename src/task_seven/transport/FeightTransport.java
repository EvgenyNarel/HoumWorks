package task_seven.transport;

/*
В классе Грузовой добавляется  поле:
- Грузоподъёмность(т)

-Для грузового разработать метод который проверит можно ли загрузить в него xxx  груза
Метод должен проверять если это кол-во груза помещается в грузовик то выводит в консоль ”Грузовик загружен”,
 если кол-во груза которое нужно загрузить больше чем то которое может влезть в наш грузовик то выводим
 “Вам нужен грузовик побольше ”.

 */
public class FeightTransport extends LandTransport {
    int carryingCapacity;

    FeightTransport(double power, int maximumSpeed, int weight, String brand,int numberWheels,int fuelConsumption,int carryingCapacity) {
        super(power,maximumSpeed,weight,brand,numberWheels,fuelConsumption);

        this.carryingCapacity = carryingCapacity;
    }

    public void specifications(int carryingCapacity, double power) {
        this.carryingCapacity = carryingCapacity;
        System.out.println("Грузоподъемность: " + carryingCapacity + ", Мощность в кВ: " + powerkW(power));
    }

    public void liftingCapacity(int weight) {
        if (weight <= carryingCapacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше");
        }
    }

}

