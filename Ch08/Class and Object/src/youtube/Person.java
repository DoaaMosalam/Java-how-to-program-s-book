package youtube;

import java.util.Objects;

public class Person{

    private String firstName;
    private String lastName;
    private String department;
    private long id;
    private int salary;

    public enum Department{
        Arabic,English,Math,Social,Science, Regions;
    }


    //This constructor contains variable.
    Person(String fN, String lN,String  dep, long i, int sal){
        this.firstName=fN;
        this.lastName=lN;
        this.department=dep;
        this.id=i;
        this.salary=sal;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department='" + department + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId() == person.getId() && getSalary() == person.getSalary() && getFirstName().equals(person.getFirstName()) && getLastName().equals(person.getLastName()) && getDepartment().equals(person.getDepartment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getDepartment(), getId(), getSalary());
    }
}
