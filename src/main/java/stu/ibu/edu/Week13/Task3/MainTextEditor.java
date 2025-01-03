package stu.ibu.edu.Week13.Task3;

public class MainTextEditor {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.setFormatter(new UpperCaseFormatter());
        editor.formatText("hello world");

        editor.setFormatter(new LowerCaseFormatter());
        editor.formatText("HELLO WORLD");

        editor.setFormatter(new CamelCaseFormatter());
        editor.formatText("java design patterns");
    }
}
