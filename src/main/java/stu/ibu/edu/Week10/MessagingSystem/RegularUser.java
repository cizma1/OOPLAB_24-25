package stu.ibu.edu.Week10.MessagingSystem;

@UserPermission(level = "regular")
public class RegularUser extends User {
    public RegularUser(String username){
        super(username);
    }

    @Override
    public String getPermissionLevel(){
        return "regular";
    }
}
