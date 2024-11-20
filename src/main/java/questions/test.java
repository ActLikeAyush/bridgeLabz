package questions;


import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String args[]){



        SumIntrface sum = (a, b) -> a + b;

        int added=sum.add(22,33);
        System.out.println(added);

//        Filtering a List:

        ArrayList<String> list1=new ArrayList<>();
        list1.add("abc");
        list1.add("bcd");
        list1.add("acd");
        list1.add("lda");
        list1.add("ape");
        List<String> SteamList=list1.stream().filter(item->item.startsWith("a")).collect(Collectors.toList());
        System.out.println(SteamList);

        List<person> ps=new ArrayList<>();
        ps.add(new person("a",22,50000));
        ps.add(new person("b",25,50000));
        ps.add(new person("c",32,50000));
        ps.add(new person("d",55,50000));
        ps.add(new person("e",17,50000));

        List<person> pl=ps.stream()
        .sorted((age1,age2)-> age1.getAge() - age2.getAge())
                .collect(Collectors.toList());
        pl.forEach(person -> System.out.println(person.getAge()));



        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
        List<Integer> Ste=num.stream()
                .filter(i->i%2==0)
                .map(l-> l*l)
                .collect(Collectors.toList());


        System.out.println(Ste);




       List<Employee> list=new ArrayList<>();
       list.add(new Employee(1, "Alice", "Engineering", 90000));
       list.add(new Employee(2, "Bob", "HR", 75000));
       list.add(new Employee(3, "Charlie", "Engineering", 85000));
       list.add(new Employee(4, "David", "Marketing", 65000));
       list.add(new Employee(5, "Eve", "Engineering", 95000));

       List<Employee> new1=test.process(list);
//        List<Employee> s=test.sortEmp(list);
       for(Employee emp:new1) {
           System.out.println(emp.getName());

       }

    }

    List<String> strings = Arrays.asList("JavaScript", "Java", "Python", "Kotlin", "JavaFX", "C++");
    Predicate<String> g = new Predicate<String>() {
        public boolean test(String s) {
            return s.length() > 5;
        }
    };
    Predicate<String> containsJava = new Predicate<String>() {

        public boolean test(String s) {
            return s.toLowerCase().contains("java");
        }
    };

    Predicate<String> combined = g.and(containsJava);
    List<String> result = strings.stream()
            .filter(combined)
            .collect(Collectors.toList());









    static List<Employee> process(List<Employee> list){
        Stream<Employee> stream = list.stream();

            List<Employee> ls = stream.filter(i->i.getDepartment()=="Engineering" && i.getSalary()>80000).collect(Collectors.toList());

            ls.sort(Comparator.comparingDouble(Employee::getSalary).reversed());


        return  ls;

    }


//    static List<Employee> sortEmp(List<Employee> list){

//        Stream<Employee> stream =list.stream();
//        List<Employee> listOne
//        return listOne;
//    }
}
