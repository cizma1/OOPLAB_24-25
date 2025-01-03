package stu.ibu.edu.Week13.Task3;

public class TextEditor {
    private TextFormatter formatter;

    public void setFormatter(TextFormatter formatter){
        this.formatter = formatter;
    }

    public void formatText(String text){
        System.out.println(formatter.formatText(text));
    }
}
