package collection;

import java.util.Map;
import java.util.TreeMap;

public class testPhone {
    public static void main(String[] args) {
        Map<String,Integer> TM=new TreeMap<>();
        PhoneNum ph1=new PhoneNum(79991, "surrya1");
        PhoneNum ph2=new PhoneNum(79992, "surrya2");
        PhoneNum ph3=new PhoneNum(79993, "surrya3");

        TM.put(ph1.getName(),ph1.getNumber());
        TM.put(ph2.getName(), ph2.getNumber());
        TM.put(ph3.getName(),ph3.getNumber());
        System.out.println(TM.get("surrya1"));


    }
}
