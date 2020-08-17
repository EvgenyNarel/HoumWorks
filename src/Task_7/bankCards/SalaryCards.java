package Task_7.bankCards;


public class SalaryCards extends DebitCards {   //зарплатная карта

    public SalaryCards(double summaDebit) {
        super(summaDebit);

    }

    @Override
    public double pay(double value) {
        summa -= value;
        System.out.println("С вашей карты списанно: " + value);
        System.out.println("Остаток на карте " + summa);
        return summa;
    }

}