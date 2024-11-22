package DesignPattern.BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
       User newUser= new User.UserBuilder()
                .setUserEmail("xyz@gmail.com")
                .setUserId("xyz.01")
                .setUserName("xyz")
                .Build();
        System.out.println(newUser);

    }
}
