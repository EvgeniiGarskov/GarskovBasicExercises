package BasicExercises.Inheritance;

public class Inheritance5 {

    public static void main(String[] args) {

        /*
        Напишите программу на Java для создания класса, известного как «BankAccount», с методами, называемыми
        deposit() и remove(). Создайте подкласс SavingsAccount, который переопределяет метод remove(), чтобы
        предотвратить снятие средств, если баланс счета падает ниже ста.

        Объяснение:

        Класс BankAccount имеет конструктор, который принимает номер счета и баланс в качестве аргументов. Он также
        имеет методы для ввода и вывода денег, а также для проверки баланса счета.

        Класс SavingsAccount является подклассом BankAccount и переопределяет метод снятия(). Он проверяет, падает ли
        баланс счета ниже ста, прежде чем разрешать снятие средств. Метод выводит сообщение об ошибке, если баланс
        ниже ста. Если баланс больше или равен ста, метод вызывает метод remove() суперкласса для вывода средств.

        В методе Main() -

        Метод main начинается с создания экземпляра класса BankAccount с номером счета «BA1234» и начальным балансом в
        500 долларов. Затем он вносит 1000 долларов на счет и отображает новый баланс. Затем он снимает 600 долларов
        со счета и отображает новый баланс.

        Затем метод создает экземпляр класса SavingsAccount с номером счета «SA1234» и начальным балансом в размере
        450 долларов США. Затем он пытается снять 300 долларов со счета и отображает новый баланс. Поскольку баланс
        остается выше минимального баланса в 150 долларов США, необходимого для учетной записи, снятие средств
        прошло успешно.

        Наконец, метод создает еще один экземпляр класса SavingsAccount с номером счета «SA1000» и начальным балансом в
        300 долларов. Затем он пытается снять 250 долларов со счета, в результате чего баланс становится ниже
        минимального остатка, необходимого для счета. Метод отображает новый баланс после попытки вывода средств,
        который по-прежнему должен составлять 300 долларов США, поскольку вывод не увенчался успехом.
         */

//        BankAccount BA1234 = new BankAccount("BA1234", 500);
//        System.out.println("Balance BA1234:\n" + BA1234.getBalance());
//        BA1234.deposit(1000);
//        BA1234.withdrawal(600);
//
//        SavingsAccount SA1234 = new SavingsAccount("SA1234", 450);
//        System.out.println("\nBalance SA1234:\n" + SA1234.getBalance());
//        SA1234.withdrawal(300);
//
//        SavingsAccount SA1000 = new SavingsAccount("SA1000", 300);
//        System.out.println("\nBalance SA1000:\n" + SA1000.getBalance());
//        SA1000.withdrawal(250);
    }
}

//class BankAccount {
//    private String accNum;
//    private double balance;
//
//    public BankAccount(String accNum, double balance) {
//        this.accNum = accNum;
//        this.balance = balance;
//    }
//
//    public void deposit(double balance) {
//        setBalance(getBalance() + balance);
//        System.out.println("Deposit of $" + balance + " successful. Current balance: $" + getBalance());
//    }
//    public void withdrawal(double balance) {
//        setBalance(getBalance() - balance);
//        System.out.println("Withdrawal of $" + balance + " successful. Current balance: $" + getBalance());
//    }
//
//    // public String getAccNum() {
//    //     return accNum;
//    // }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public void setBalance(double balance) {
//        this.balance = balance;
//    }
//}
//
//class SavingsAccount extends BankAccount {
//
//    public SavingsAccount(String accNum, double balance) {
//        super(accNum, balance);
//    }
//
//    @Override
//    public void withdrawal(double balance) {
//        if (getBalance() - balance >= 100) {
//            setBalance(getBalance() - balance);
//            System.out.println("Withdrawal of $" + balance + " successful. Current balance: $" + getBalance());
//        } else {
//            System.out.println("The balance is equal to or below 100. Withdrawal failed.");
//        }
//    }
//}
