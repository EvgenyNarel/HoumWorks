package task_seven.transport;

/*
В классе Воздушный добавляются поля:
 - Размах крыльев (м)
 - Минимальная длина взлётно-посадочной полосы для взлёта
 */
public class AirTransport extends Transport{
    int wingspan;               //(m)
    int minimumRunway;

    public AirTransport(double power,int maximumSpeed, int weight, String brand, int wingspan, int minimumRunway) {
        super(power,maximumSpeed,weight,brand);
        this.wingspan = wingspan;
        this.minimumRunway = minimumRunway;
    }
}

