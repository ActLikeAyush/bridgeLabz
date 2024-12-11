package JavaScriptPackage;

public class staticClass {

    void a(){
        System.out.println("a");
    }
    void b(){
        System.out.println("b");
    }
    public static void main(String[] args) {
        staticClass obj1=new staticClass();
//        obj1.a();
        staticClass.innerCLass obj=new innerCLass();

    }
    static class innerCLass{
        void innerC(){
            System.out.println("innerC");
        }
    }
}
