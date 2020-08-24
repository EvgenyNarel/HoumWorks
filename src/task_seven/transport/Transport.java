package task_seven.transport;

/*
В классе Транспорт есть поля:
- Мощность(в лошадиных силах) - Максимальная скорость(км/ч) - Масса (кг) - Марка( например: Audi, BMW , Boing,  Airbus,  Scania , МАЗ и т.д. )
 */

public abstract class Transport {
    double power;                               // (horsepower)
    int maximumSpeed;                        //(km / h)
    int weight;                              // (kg)
    String brand ;

    public Transport(double power, int maximumSpeed, int weight, String brand){
        this.power=power;
        this.maximumSpeed=maximumSpeed;
        this.weight=weight;
        this.brand=brand;
    }


    public double powerkW(double power) {
        this.power = power;
        return power *= 0.74;
    }


}

