package Task_7.bankCards;

public class CreditCards extends BankCard {

    @Override
    double pay(double price) {

        return 0;
    }

    public double takeLoan(double value) {//взять кредит на сумму
        return value;

    }

    public void repailoan(double value) { //погасить кредит
        summa-=value;
        double sumRepailoan = summa;
        System.out.println("Вы внесли " + value + " оплату по кредиту, остаток по кредиту: " + sumRepailoan);
    }


}