package Task_7.bankCards;

public abstract class DebitCards extends BankCard {



    public DebitCards(double summa) {
        this.summa = summa;
    }

    @Override
    double pay(double value) {
        summa -= value;
        return summa;
    }


}


