package Task_7.bankCards;

public abstract class BankCard {
    int number;
    int expirationDate;
    String name;
    double summa;

    void registration(int number, int expirationDate, String name){
        this.number=number;
        this.expirationDate=expirationDate;
        this.name=name;
        System.out.println("Номер вашей карты: " + number + "; Срок действия: " + expirationDate + "; Банк: " + name + ".");

    }

    abstract double pay(double value);

    double withdrawal(double value) {
        this.summa-=value;
        System.out.println("С вашей карты снято: " + value);
        System.out.println("Остаток на карте " +name+" равен: " + summa);
        return summa;
    }
        double transfer(BankCard bankCard, double value) {
        this.summa-=value;
        bankCard.add(value);
        System.out.println("Cумма перевода ровна: " + value);
        return summa;
    }

    double add(double transfer) {
        this.summa+=transfer;
        return summa;
    }
    public void ostatok() {

        System.out.println("Остаток на карте " +name+" равен: " + summa);
    }


}

