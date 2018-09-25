/**
 * The keyword `this` resolves name conflicts. We want the setData arguments to have the same name as the int variables.
 * Therefore we use `this` to differentiate the setData names.
 * Credit goes to https://www.guru99.com/java-this-keyword.html
 */

public class Account{
    int account_payroll;
    int account_receipts;
    
    public void setData(int account_payroll, int account_receipts) {
        this.account_payroll = account_payroll;
        this.account_receipts = account_receipts;
    }
    
    public void showData(){
        System.out.println("Value of payroll: " + account_payroll);
        System.out.println("Value of receipts: " + account_receipts);
    }
    
    public static void main(String args[]) {
        Account obj = new Account();
        obj.setData(30000, 55000);
        obj.showData();
    }
}
