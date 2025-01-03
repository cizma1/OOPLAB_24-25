package stu.ibu.edu.Week13.Task3;

import stu.ibu.edu.Week12.ChatServer;

public class CamelCaseFormatter implements TextFormatter{
    public String formatText(String text){
        return Character.toUpperCase(text.charAt(0)) + text.substring(1).toLowerCase();
    }
}
