package Task_9.MyAnatation;

import java.util.Objects;

@Version()
public class MyService {
    private double numberVersion;
    private String name;

    public MyService(){

    }
        public MyService(double numberVersion, String name) {
        this.numberVersion = numberVersion;
        this.name = name;
    }

    private void thisClassInfo() {
        System.out.println("Версия: " + numberVersion + "   " + " Кодовае имя " + name);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return Double.compare(myService.numberVersion, numberVersion) == 0 &&
                Objects.equals(name, myService.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberVersion, name);
    }

    public double getNumberVersion() {
        return numberVersion;
    }

    public void setNumberVersion(double numberVersion) {
        this.numberVersion = numberVersion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
