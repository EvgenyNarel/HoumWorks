package task_seven.bankCards;

public abstract class DebitCard extends BankCard {



    public DebitCard(double balanc) {
        this.balance =balanc;
    }

    @Override
    double pay(double value) {
        balance -= value;
        return balance;
    }


}

