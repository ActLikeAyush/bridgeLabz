package collection;

public class PhoneNum {
    private int number;
    private String name;
    PhoneNum(int number,String name){
        this.number=number;
        this.name=name;
    }
    PhoneNum(){}

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
