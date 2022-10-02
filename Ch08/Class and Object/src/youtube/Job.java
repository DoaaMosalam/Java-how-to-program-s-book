package youtube;

import java.util.*;

public class Job {


     static void value(){
        Set<Person> list = new HashSet<Person>();

        list.add(new Person("Doaa","Mosalam", "Arabic",20131991,3000));
        list.add(new Person("Ahmed","Mohammed","Math",20201991,2000));
        list.add(new Person("Tamer","Hosseny","English",1242017,5000));
        list.add(new Person("Fatma","Sayed","Science",19791991,6000));
        print( list);
        System.out.println("==========================================");
//        filterSalary((TreeSet<Person>) list);
//        System.out.println("============================================");
//        addElement((TreeSet<Person>) list);
    }

    public static void print(Set set) {
        Iterator<Person> iterator = set.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            System.out.println(person);
        }
    }

    public static void filterSalary(Set<Person> set){
        Iterator<Person> iterator = set.iterator();
        while (iterator.hasNext()){
            Person person = iterator.next();
            if (person.getSalary()>5000){
                iterator.remove();
            }
        }

        for (Person pe:set) {
            System.out.println(pe);
        }
    }

    public static void addElement(Set<Person> set){
        ListIterator<Person> iter = (ListIterator<Person>) set.iterator();
        while (iter.hasNext()){
            Person person = iter.next();
           if (!person.getFirstName().equalsIgnoreCase("Tamer")){
               iter.add(new Person("Amr","Mohammed","Social",242344,3500));
               break;
           }
        }
        for (Person pe : set){
            System.out.println(pe);
        }

    }


}
