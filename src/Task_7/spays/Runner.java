package Task_7.spays;

public class Runner {
    public static void main(String[] args) throws InterruptedException {

        Shuttle shuttle = new Shuttle();

        SpaysX spaysX = new SpaysX();

        Cosmodrome baikonur = new Cosmodrome();

        baikonur.launching(spaysX);
        baikonur.launching(shuttle);
    }
}
