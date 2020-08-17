package Task_7.transport;

/*
В классе Транспорт есть поля:
- Мощность(в лошадиных силах) - Максимальная скорость(км/ч) - Масса (кг) - Марка( например: Audi, BMW , Boing,  Airbus,  Scania , МАЗ и т.д. )
 */

public abstract class Transport {
    double power;                               // (horsepower)
    int maximumSpeed;                        //(km / h)
    int weight;                              // (kg)
    String brand ;



    public double powerkW(double power) {
        this.power = power;
        return power *= 0.74;
    }


}

