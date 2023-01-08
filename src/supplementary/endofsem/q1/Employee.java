package supplementary.endofsem.q1;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String department;

    public abstract String getDepartment();

    public abstract void setDepartment(String department);

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
