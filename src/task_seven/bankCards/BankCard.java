package task_seven.bankCards;

public abstract class BankCard {
    int number;
    int expirationDate;
    String name;
    double balance;

    void registration(int number, int expirationDate, String name){
        this.number=number;
        this.expirationDate=expirationDate;
        this.name=name;
        System.out.println("Номер вашей карты: " + number + "; Срок действия: " + expirationDate + "; Банк: " + name + ".");

    }

    abstract double pay(double value);

    double withdrawal(double value) {
        this.balance-=value;
        System.out.println("С вашей карты снято: " + value);
        System.out.println("Остаток на карте " +name+" равен: " + balance);
        return balance;
    }
        double transfer(BankCard bankCard, double value) {
        this.balance-=value;
        bankCard.add(value);
        System.out.println("Cумма перевода ровна: " + value);
        return balance;
    }

    double add(double transfer) {
        this.balance+=transfer;
        return balance;
    }
    public void balance() {

        System.out.println("Остаток на карте " +name+" равен: " + balance);
    }


}

