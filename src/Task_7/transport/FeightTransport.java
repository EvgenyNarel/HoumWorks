package Task_7.transport;

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

    FeightTransport(int c) {

        this.carryingCapacity = c;
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

