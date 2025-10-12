public class BankAccount {
    private double bankAccountHolder;
    private double bankBalance;
    public BankAccount(Double bankAccountHolder, Double bankBalance){
        this.bankAccountHolder = bankAccountHolder;
        this.bankBalance = bankBalance;
    }
    public double getBankAccountHolder(){
        return bankAccountHolder;
    }
    public double getBankBalance(){
        return bankBalance;
    }

    public void deposite(double amount){
        if(amount>0){
          bankBalance = bankBalance + amount;
        }
    }
    public void withDraw(double amount){
        if(amount>0 && amount<=bankBalance){
            bankBalance -= amount;
        }
    }

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(12345.45, 100000.33);
        System.out.println(ba.getBankAccountHolder());
        ba.withDraw(5000.00);
        System.out.println(ba.getBankBalance());

    }

}
