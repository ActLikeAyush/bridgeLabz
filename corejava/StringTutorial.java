import java.util.Arrays;

/**
 * StringTutorial
 */






 public class StringTutorial {

    public static void main(String[] args) {
        String abc="SHRIRAMJAIRAMJAIJAIRAM";
        String acd ="abc";
        acd="chacha";
        String abc1=new String("abc");
        String abc2=new String("abc");
        System.out.println(acd);
        System.out.println((abc2.equals(abc))?"same":"not same");
        System.out.println(acd.isEmpty());
        System.out.println(acd.charAt(0));
        // System.out.println(acd.charCodeAt(0));
        char [] a= acd.toCharArray();
        System.out.println(Arrays.toString(a));
        String al=abc.substring(abc.length()-3);
        System.out.println(al);
        System.out.println(al.indexOf("A"));
        System.out.println(abc.contains("RAM"));
        System.out.println(abc.startsWith("SHRI"));
        String firstOne= acd.replace("chacha", "chachi");
        System.out.println(firstOne);
        String new1="   a b c d   ";
        System.out.println(new1.trim());
    }
}