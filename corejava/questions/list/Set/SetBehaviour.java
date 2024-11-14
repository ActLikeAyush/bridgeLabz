
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetBehaviour{
    public static <T> void addVal(Set<T> value){
        value.add((T) Integer.valueOf(1));
        value.add((T) Integer.valueOf(4)); 
        value.add((T) Integer.valueOf(3)); 
        value.add((T) Integer.valueOf(4));
        
    } 
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        LinkedHashSet<Integer> LHS=new LinkedHashSet<>();
        TreeSet<Integer> TS=new TreeSet<>();
        addVal(hs);
        addVal(LHS);
        addVal(TS);

        System.out.println(hs);
        System.out.println(LHS);
        System.out.println(TS);
    }
}
