package stu.ibu.edu.Week12;

import java.io.IOException;

public class ChatApplication {
    public static void main(String[] args) {
        ChatServer server = new ChatServer();
        try{
            server.start(1234);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
