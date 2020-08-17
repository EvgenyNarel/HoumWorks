package Task_7.transport;

/*
В классе Легковой добавляются поля:
- Тип кузова
- Кол-во пассажиров

Разработать метод описание который будет возвращать составленную строку с описанием всех характеристик объекта.
 В строку включить ещё один параметр мощность в киловаттах (кВ) .
 Расчёт мощности в киловаттах производится в отдельном методе :
1 л.с = 0.74 кВ

Для легкового разработать метод который будет принимать время и считать сколько километров проедет машина
двигаясь с максимальной скоростью и сколько топлива она израсходует за это время, результат вывести в консоль,
расчёт расходуемого топлива вынести в отдельный метод private.

Результат работы метода должен вывести такую строчку:
За время (ваше введённое время) ч, автомобиль (марка автомобиля)
двигаясь с максимальной скоростью (ваша максимальная скорость) км/ч
проедет (xxx) км  и израсходует (xxx) литров топлива.

Мой результат выглядит так:
“За время 2,5 часа, автомобиль Audi двигаясь с максимальной скоростью 230 км/ч израсходует 46.0 литров топлива”

 */
public class LightTransport extends LandTransport {
    String bodyType;
    int numberOfPassengers;

    LightTransport(String body, int number, double power){
                this.bodyType=body;
        this.numberOfPassengers=number;
        powerkW(power);
    }

    public LightTransport(int maximumSpeed, int weight, String brand) {


    }


    public void specifications() {
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
        System.out.println("Тип кузова: " + bodyType + ", Колличество пассажиров: " + numberOfPassengers + " " + ", Мощность в кВ: " + powerkW(power));
    }

    public int consumption(int time, String brand, int maxSpeed) {
        int way = time * maxSpeed;
        System.out.println("За время " + time + " ч, автомобиль " + brand + " двигаясь с максимальной скоростью " + maxSpeed + " км / ч проедет " + way + " км и израсходует " + consumptionFuel(way) + " литров топлива");
        return way;
    }

    private int consumptionFuel(int way) {
        int consumptionsFuel=8; //расход топлива на 100 км
        int fuel = (way /100)* consumptionsFuel;
        return fuel;
    }
}

