package example;
import java.util.*;

public class Employee2 {
    private String firstName;
    private String lastName;
    private static int count=0;

   Employee2(String first,String last){
        this.firstName=first;
        this.lastName=last;

       ++count;
       System.out.printf("Employee constructor: %s %s; count = %d\n",firstName,lastName,count);
   }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getCount() {
        return count;
    }

    public static void EmployeeTest(){
        System.out.printf( "Employees before instantiation: %d\n",Employee2.getCount());
        Employee2 e1 = new Employee2("Susan","Baker");
        Employee2 e2 = new Employee2("Bob","Blue");

        System.out.printf("Employees after instantiation:\n");
        System.out.printf("via e1.getCount(): %d\n",getCount());
        System.out.printf("via e2.getCount(): %d\n",getCount());
        System.out.printf("via Employee.getCount(): %d\n",Employee2.getCount());

        System.out.printf( "\nEmployee 1: %s %s\nEmployee 2: %s %s\n", e1.getFirstName(), e1.getLastName(),
                e2.getFirstName(), e2.getLastName() );

        // in this example, there is only one reference to each Employee,
// so the following two statements indicate that these objects
// are eligible for garbage collection
        e1 = null;
        e2 = null;
    }
}
