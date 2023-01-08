package supplementary.endofsem.q1;

public class SeniorMembers extends Employee {
    private double baseSalary;
    private int hoursWorked;


    public double computeSalary() {
        return 0;
    }
    public String createPaySlip() {
        return "";
    }

    @Override
    public String getDepartment() {
        return null;
    }

    @Override
    public void setDepartment(String department) {

    }

    @Override
    public String getFirstName() {
        return null;
    }

    @Override
    public void setFirstName(String firstName) {

    }

    @Override
    public String getLastName() {
        return null;
    }

    @Override
    public void setLastName(String lastName) {

    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
