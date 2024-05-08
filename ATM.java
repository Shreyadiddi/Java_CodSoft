package Java_CodSoft;
import java.util.Scanner;

class BankAccount{
    private double balance;
    
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("Deposit sucsessful. Current balance: " + balance);
        } else{
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void checkBalance(){
        System.out.println("Current balance: " + balance);
    }
}
public class ATM {

    private BankAccount account;
        private Scanner sc;

        public ATM(BankAccount account){
            this.account = account;
            this.sc =  new Scanner(System.in);
        }

        public void displayOptions() {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                System.out.println("Enter amount to withdraw: ");
                double withdrawAmount = sc.nextDouble();
                account.withdraw(withdrawAmount);
                break;

                case 2:
                System.out.println("Enter amount to deposit: ");
                double depositAmount = sc.nextDouble();
                account.deposit(depositAmount);
                break;

                case 3:
                account.checkBalance();
                break;

                case 4:
                System.out.println("Thank you for using the ATM. Have a great Day");
                System.exit(0);

                default:
                System.out.println("Invalid choice.");
            }

            displayOptions();
        }

        public static void main(String args[]){
            BankAccount bankAccount = new BankAccount(1000.0);
    
            ATM atm = new ATM(bankAccount);
    
            atm.displayOptions();
        
    }
    
}

/* Output :
Welcome to the ATM!
1. Withdraw
2. Deposit
3. Check Balance
2
Enter amount to deposit: 
9000
Deposit sucsessful. Current balance: 10000.0
Welcome to the ATM!
1. Withdraw
2. Deposit
3. Check Balance
1
Enter amount to withdraw:
890
Withdrawal successful. Current balance: 9110.0
Welcome to the ATM!
1. Withdraw
2. Deposit
3. Check Balance
3
Current balance: 9110.0
Welcome to the ATM!
1. Withdraw
2. Deposit
3. Check Balance */
