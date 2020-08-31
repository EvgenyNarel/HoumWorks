package task_seven.bankCards;

public class CreditCard extends BankCard {

    @Override
    double pay(double price) {

        return 0;
    }

    public double takeLoan(double value) {//взять кредит на сумму
        return value;

    }

    public void repailoan(double value) { //погасить кредит
        balance-=value;
        double sumRepailoan = balance;
        System.out.println("Вы внесли " + value + " оплату по кредиту, остаток по кредиту: " + sumRepailoan);
    }


}