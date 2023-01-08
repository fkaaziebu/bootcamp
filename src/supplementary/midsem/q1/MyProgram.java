package supplementary.midsem.q1;


public class MyProgram {
    public static void main(String[] args) {
        MyProgram obj = new MyProgram();
        obj.printNumber(30);
    }

    public void printNumber(int n) {
        while (n >= 1) {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("Technology");
            } else if (n % 3 == 0) {
                System.out.println("KNUST");
            } else if (n % 5 == 0) {
                System.out.println("University");
            } else {
                System.out.println(n);
            }
            n--;
        }
    }
}
