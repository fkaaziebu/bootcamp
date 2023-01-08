package supplementary.endofsem.q1;

public class EmployeeTest {
    public static void main(String[] args) {
        SeniorMembers obj = new SeniorMembers();
        SeniorStaff obj1 = new SeniorStaff();
        JuniorStaff obj2 = new JuniorStaff();

        // SeniorMember
        obj.setFirstName("John");
        obj.setLastName("Doe");
        obj.setDepartment("Biomedical Engineering Department");
        System.out.println("First name: " + obj.getFirstName());
        System.out.println("Second name: " + obj.getLastName());
        System.out.println("Department: " + obj.getDepartment());
        System.out.println("\n");

        // SeniorStaff
        obj1.setFirstName("James");
        obj1.setLastName("Brown");
        obj1.setDepartment("Computer Engineering Department");
        System.out.println("First name: " + obj1.getFirstName());
        System.out.println("Second name: " + obj1.getLastName());
        System.out.println("Department: " + obj1.getDepartment());
        System.out.println("\n");

        //JuniorStaff
        obj2.setFirstName("Eliel");
        obj2.setLastName("Keelson");
        obj2.setDepartment("Electrical Engineering Department");
        System.out.println("First name: " + obj2.getFirstName());
        System.out.println("Second name: " + obj2.getLastName());
        System.out.println("Department: " + obj2.getDepartment());
        System.out.println("\n");
    }
}
