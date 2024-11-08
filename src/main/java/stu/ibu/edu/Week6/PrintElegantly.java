package stu.ibu.edu.Week6;

public class PrintElegantly {
    public static void printElegantly(int[] array){
        String result = "";
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
            if(i != array.length-1){
                System.out.println(", ");
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }
}
