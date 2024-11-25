package BasicLogicalQuestions;

public class ReplaceSpace {
    public static void main(String[] args) {
        String a="abs scc skkl";
//        there is one method called replace in string
        String j=a.replace(' ','*');
        System.out.println(j);
//        and using array
        char ar[]=a.toCharArray();
        int count=0;
        for (char i:ar){
            if(i==' '){
                ar[count]='-';
                count++;
            }
            else {
                count ++;
            }

        }
        String a2=new String(ar);
        System.out.println(a2);
    }
}
