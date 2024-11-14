public class Runner {
    public static void main(String args[]){
        BST bs=new BST();
        bs.insert(8);
        bs.insert(7);
        bs.insert(12);
        bs.insert(15);
        bs.insert(5);
        bs.insert(2);
        System.out.println("hy");
        bs.preOrder();
        System.out.println("by");
    }
}
