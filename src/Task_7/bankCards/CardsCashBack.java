package Task_7.bankCards;

public class CardsCashBack extends CreditCards {//карта с кэшбэком
    double perCentCash;

    public CardsCashBack(double perCent) {
        perCentCash = perCent;

    }

    @Override
    public double takeLoan(double value) {
        summa = value;
        System.out.println("Вы взяли кредит на сумму: " + summa + " $");
        return summa;

    }

    @Override
    double pay(double price) {
        double remainder = summa - price;
        double cashBack = (price * perCentCash) / 100;
        summa = remainder + cashBack;
        System.out.println("CashBack  составил: " + cashBack);
        System.out.println("Остааток на карте "+name+" с начисленным CashBack равна: " + summa);
        return cashBack;

    }




}
