/*SINGLE RESPONSIBILITY: A class should only have one responsibility*/

/*Wrong: Wrong: A class that handles both account logic and reports printing.*/
//class Account {
//    public void deposit(double amount) { /* Handle deposit */ }
//    public void withdraw(double amount) { /* Hand withdraw */ }
//    
//    // SRP Violation - Printing Reports is Not Account's Responsibility
//    public void printStatement() { System.out.println("Account statement"); }
//}

/*Correct: Split the functionality into two separate classes.*/
class Account {
  public void deposit(double amount) { /* Handle deposit */ }
  public void withdraw(double amount) { /* Hand withdraw */ }
}

class AccountStatement {
    public void printStatement(Account account) { System.out.println("Account statement"); }
}