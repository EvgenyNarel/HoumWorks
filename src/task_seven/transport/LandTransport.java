package task_seven.transport;

/*
В классе Наземный добавляются поля:
 -Количество колёс
 - Расход топлива(л/100км)
 */
public class LandTransport extends Transport {
    int numberWheels;
    int fuelConsumption;              //(l / 100km)


    public LandTransport(double power, int maximumSpeed, int weight, String brand,int numberWheels,int fuelConsumption) {
        super(power, maximumSpeed, weight, brand);
        this.numberWheels=numberWheels;
        this.fuelConsumption=fuelConsumption;
    }
}





