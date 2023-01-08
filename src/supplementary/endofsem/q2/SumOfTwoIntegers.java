package supplementary.endofsem.q2;
import javax.swing.*;

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        int firstNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first Number: "));
        int secondNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second Number: "));

        int res = firstNum + secondNum;

        JOptionPane.showMessageDialog(null, "The sum is " + res);
    }
}
