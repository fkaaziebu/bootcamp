package supplementary.endofsem.q1;

public class JuniorStaff extends Employee {
    private double baseSalary;
    private int hoursWorked;
    private String department;


    public double computeSalary() {
        return 0;
    }
    public String createPaySlip() {
        return "";
    }

    @Override
    public String getDepartment() {
        return this.department;
    }

    @Override
    public void setDepartment(String department) {
        this.department = department;
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
