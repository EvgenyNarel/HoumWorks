package task_seven.bankCards;

public abstract class DebitCard extends BankCard {



    public DebitCard(double summa) {
        this.balance = summa;
    }

    @Override
    double pay(double value) {
        balance -= value;
        return balance;
    }


}


