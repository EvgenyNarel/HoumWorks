package task_seven.bankCards;

public class CardCashBack extends CreditCard {//карта с кэшбэком
    double perCentCash;

    public CardCashBack(double perCent) {
        perCentCash = perCent;

    }

    @Override
    public double takeLoan(double value) {
        balance = value;
        System.out.println("Вы взяли кредит на сумму: " + balance + " $");
        return balance;

    }

    @Override
    double pay(double price) {
        double remainder = balance - price;
        double cashBack = (price * perCentCash) / 100;
        balance = remainder + cashBack;
        System.out.println("CashBack  составил: " + cashBack);
        System.out.println("Остааток на карте "+name+" с начисленным CashBack равна: " + balance);
        return cashBack;

    }




}
