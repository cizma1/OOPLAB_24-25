package stu.ibu.edu.Week6;

import java.util.Arrays;

public class Smallest {
    //Task1
    public static int smallest(int[] array){
        int smallestNum = array[0];
        for(int i=0;i< array.length;i++){
            if(array[i] < smallestNum)
                smallestNum = array[i];
        }
        return smallestNum;
    }

    //Task2
    public static int indexOfSmallest(int[] array){
        int smallestNum = array[0];
        int index = 0;
        for(int i=0;i< array.length;i++){
            if(array[i] < smallestNum) {
                smallestNum = array[i];
                index = i;
            }
        }
        return index;
    }

    //Task3
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int smallestNum = array[index];
        int smallestIndex = index;
        for(int i=index;i< array.length;i++){
            if(array[i]<smallestNum) {
                smallestNum = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    //Task4
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] values = {3, 2, 5, 4, 8};

        //System.out.println("smallest: " + smallest(values));
        /*System.out.println("Index of smallest: " + indexOfSmallest(values));

        System.out.println(indexOfTheSmallestStartingFrom(values,1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));*/

        System.out.println(Arrays.toString(values));
        swap(values, 1, 0);

        System.out.println(Arrays.toString(values));
        swap(values, 0, 3);

        System.out.println(Arrays.toString(values));
    }
}
