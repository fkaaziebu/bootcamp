package supplementary.endofsem.q1;

public abstract class Employee {
    private String firstName;
    private String lastName;
    private String department;

    public abstract String getDepartment();

    public abstract void setDepartment(String department);

    public abstract String getFirstName();

    public abstract void setFirstName(String firstName);

    public abstract String getLastName();

    public abstract void setLastName(String lastName);
}
