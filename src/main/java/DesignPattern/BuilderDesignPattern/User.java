package DesignPattern.BuilderDesignPattern;

public class User {
    private final String UserName;
    private final String UserEmail;
    private final String UserID;

    private User(UserBuilder builder){
//        intialize

        this.UserID=builder.UserId;
        this.UserEmail=builder.UserEmail;
        this.UserName=builder.UserName;
    }

    public String getUserName() {
        return UserName;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public String getUserID() {
        return UserID;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserName='" + UserName + '\'' +
                ", UserEmail='" + UserEmail + '\'' +
                ", UserID='" + UserID + '\'' +
                '}';
    }

    //    now create inner class to create object
    static class UserBuilder{
        private String UserName;
        private String UserEmail;
        private String UserId;

        public UserBuilder(){

        }


    public UserBuilder setUserName(String userName) {
        UserName = userName;
        return this;
    }


    public UserBuilder setUserEmail(String userEmail) {
        UserEmail = userEmail;
        return this;
    }

    public UserBuilder setUserId(String userId) {
        UserId = userId;
        return this;
    }
    public User Build(){
            User user=new User(this);
            return user;
    }
}
}
