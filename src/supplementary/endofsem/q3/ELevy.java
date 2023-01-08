package supplementary.endofsem.q3;

public class ELevy {
    private String customer;
    private int transID;
    private double balance;
    private double transfer;

    public ELevy(String customer, double balance, int transID) {
        this.customer = customer;
        this.balance = balance;
        this.transID = transID;
    }

    public static void main(String[] args) {
        ELevy bright = new ELevy("Dr. Bright Yeboah", 400, 1234);
        bright.transaction(100);

        System.out.println();

        ELevy william = new ELevy("Prof. William", 30,  5678);
        william.transaction(40);

        System.out.println();

        ELevy joyceline = new ELevy("Mrs. Joyceline", 900,  9101);
        joyceline.transaction(700);

        System.out.println();

        ELevy brown = new ELevy("Miss Brown", 5500,  4562);
        brown.transaction(3000);
    }

    public void transaction(double amountToTransfer) {
        if (amountToTransfer > balance) {
            System.out.println("You do not have any balance!");
        }
        else {
            double originalBalance = this.balance;
            double tax = this.serviceTax(amountToTransfer);
            double levy = this.eLevy(amountToTransfer);
            System.out.println("Customer: " + this.customer);
            System.out.println("Original Balance: " + originalBalance);
            System.out.println("New Balance: " + this.balance);
            System.out.println("Service Tax: " + tax);
            System.out.println("E-Levy: " + levy);
            System.out.println("TransacID: " + this.transID);
        }
    }
    public double serviceTax(double amountToTax) {
        double amountAfterTax = 0.01 * amountToTax;;
        if (amountToTax > 1000) {
            amountAfterTax = 10;
        }
        this.balance = this.balance - amountToTax;
        return amountAfterTax;
    }

    public double eLevy(double amountToLevy) {
        double levy = 0.015 * amountToLevy;
        if (amountToLevy <= 100) {
            levy = 0;
        }
        return levy;
    }
}
