package youtube;

import java.util.Comparator;

public class AscendinSalary implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        return o2.getSalary()- o1.getSalary();
    }
}
