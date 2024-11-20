package optionals;

import java.util.Optional;

public class optionalsTest {

    public static void main(String args[]){
        System.out.println("hy");
        person p=new person();
//        System.out.println(p.getName().length());


        Optional<String> name = p.getName();
        name.ifPresent(n-> System.out.println(n.length()+"  // "+n));
        String defaultName= name.orElse("by by");
        System.out.println(defaultName);
    }
}
