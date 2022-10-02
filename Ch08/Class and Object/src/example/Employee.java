package example;

import java.util.Date;

public class Employee {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;

    Employee(String first,String last,Date dateOfBirth,Date hireOfDate){
        this.firstName=first;
        this.lastName=last;
        this.birthDate=dateOfBirth;
        this.hireDate=hireOfDate;
    }

    @Override
    public String toString() {
        return String.format( "%s, %s  Hired: %s  Birthday: %s",
                lastName, firstName, hireDate, birthDate);
    }

    public static void testEmployee(){
        Date birth = new Date(7,24,1949);
        Date hire = new Date(3,12,1988);
        Employee employee = new Employee("Bob","Blue",birth,hire);
        System.out.println(employee);
    }
}
