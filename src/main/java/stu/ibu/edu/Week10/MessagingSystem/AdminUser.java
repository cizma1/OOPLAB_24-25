package stu.ibu.edu.Week10.MessagingSystem;

@UserPermission(level = "admin")
public class AdminUser extends User {
    public AdminUser(String username){
        super(username);
    }

    @Override
    public String getPermissionLevel(){
        return "admin";
    }
}
