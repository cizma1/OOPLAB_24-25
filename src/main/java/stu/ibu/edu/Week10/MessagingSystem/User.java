package stu.ibu.edu.Week10.MessagingSystem;

public abstract class User {
    private String username;

    public User(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public abstract String getPermissionLevel();
}
