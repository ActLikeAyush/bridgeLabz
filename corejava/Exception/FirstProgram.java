class MyException extends Exception{
    MyException(String string){
        super(string);
    }
}

public class FirstProgram {
    public static void AllEx(){
        int arr[] = new int[5];
        int i = 0;
        try {

            i = arr[5];
            throw new MyException("you are outof bound");

        } catch (MyException e) {

            System.out.println("  something   " + e);
        }

        int age = 15;
        if (age < 18) {
            throw new ArithmeticException("age is less then 18");
        } else {
            System.out.println("eligible for voting ");
        }
        try {
            int c = 1 / 0;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }


    }

    public static void myEx(int l) throws Exception{
        int i=0;
        // int j=22/0;


    }

    public static void main(String[] args)throws Exception {
    //    AllEx();
    //    myEx(22);
       
       System.out.println("done");
    //    throw new Exception("it will  not work");
       try{
        System.out.println("hy");
        int i=2/0;
       }
       finally{
        System.out.println("hy");
       }
    }
}