package task_seven.bankCards;

public class SalaryCard extends DebitCard {   //зарплатная карта

    public SalaryCard(double summaDebit) {
        super(summaDebit);

    }

    @Override
    public double pay(double value) {
        balance -= value;
        System.out.println("С вашей карты списанно: " + value);
        System.out.println("Остаток на карте " + balance);
        return balance;
    }

}
