package Task_7.bankCards;

public class RunnerBank {
    public static void main(String[] args) {
     CardsCashBack card=new CardsCashBack(3);
     card.registration(22222,2020,"Alfa");
     card.takeLoan(5000);



     SalaryCards salaryCards = new SalaryCards(8000);
     salaryCards.registration(1111,2020,"BPS");
     salaryCards.add(3000);
     salaryCards.transfer(card,100);
     salaryCards.ostatok();

     card.ostatok();


    }
}
