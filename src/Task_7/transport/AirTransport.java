package Task_7.transport;

/*
В классе Воздушный добавляются поля:
 - Размах крыльев (м)
 - Минимальная длина взлётно-посадочной полосы для взлёта
 */
public class AirTransport extends Transport{
    int wingspan;               //(m)
    int minimumRunway;

    public AirTransport(int maximumSpeed, int weight, String brand, int wingspan, int minimumRunway) {
        this.wingspan = wingspan;
        this.minimumRunway = minimumRunway;
    }
}

