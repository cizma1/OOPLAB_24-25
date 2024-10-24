package stu.ibu.edu.Week4.Task2;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(String color, FillType fillType, double height, double width){
        super(color, fillType);
        this.height = height;
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public String displayInfo(){
        return "Color is " + super.getColor() + " and it is " + super.getFillType() + ".";
    }

    @Override
    public double getArea(){
        return this.height * this.width;
    }
}
