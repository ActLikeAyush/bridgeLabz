package questions;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class predicateAndConsumer {
    public static void main(String args[]){
        List<String> strings = Arrays.asList("JavaScript", "Java", "Python", "Kotlin", "JavaFX", "C++");

        Consumer<String> toUpperCase=s-> System.out.println(s.toUpperCase());

        strings.forEach(toUpperCase);

        predicateAndConsumer a=new predicateAndConsumer();
        function fi=new function() {
            @Override
            public double areaOfCircle(int r) {
                return r * r * 3.14;
            }
        };

        double area=fi.areaOfCircle(24);
        System.out.println(area);

        String aa="hy";
        String bb="by";
        BiFunction <String,String,String> bi=new BiFunction() {
            @Override
            public Object apply(Object o, Object o2) {
                return o+""+o2;
            }
        };
        String cc=bi.apply(aa,bb);
        System.out.println(cc);

        square cal=(number -> number*number);
        System.out.println(cal.calculateSquare(55));
    }

}
