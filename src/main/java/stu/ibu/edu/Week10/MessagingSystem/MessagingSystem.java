package stu.ibu.edu.Week10.MessagingSystem;

public class MessagingSystem {
    @CanSendMessage
    @RequiresPermission(level = "admin")
    public void sendMessage(User user){
        String userPermission = user.getPermissionLevel();
        if(userPermission.equals("admin")){
            System.out.println(user.getUsername() + " (Admin) sent message.");
        }
        else{
            System.out.println(user.getUsername() + " (Regular User) is restricted from sending messages.");
        }
    }

    public static void main(String[] args) {
        MessagingSystem messagingSystem = new MessagingSystem();

        User regularUser = new RegularUser("Adi");
        User adminUser = new AdminUser("Benjamin");

        messagingSystem.sendMessage(regularUser);
        messagingSystem.sendMessage(adminUser);
    }
}

