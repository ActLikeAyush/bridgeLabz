package StreamAPI;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class basic {
    public static void main(String args[]){
        List<Integer> list =new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        Stream <Integer> data = list.stream();
        Stream <Integer> evenData= data.filter(n->n%2==0);
        evenData.forEach(d-> System.out.println(d));
//        data.forEach(d-> System.out.println(d));
        Stream <Integer> MapData=list.stream();
        Stream <Integer> mapData=MapData.map(n->n*2);
        mapData.forEach(n-> System.out.println(n));

        Stream<Integer> newStreamData=list.stream();


//        here we are doing all the opration on the same line
//        here it is not return any thing because it is printing right now, so don't need tp store it in any variable
        newStreamData.map(n->n%2!=0).forEach(n-> System.out.println(n));

//        Stream<Integer> newStreamDataAgain=list.stream();

//        list.stream().sorted().map(n->n*3).forEach(n-> System.out.println(n));
//        list.forEach(n-> System.out.println(n));

    }
}
