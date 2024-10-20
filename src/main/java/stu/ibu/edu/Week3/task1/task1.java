package stu.ibu.edu.Week3.task1;

import stu.ibu.edu.Week3.task1.TaskStatus;

import java.util.ArrayList;
import java.util.Collections;

public class task1 {
    public static void main(String[] args) {
        ArrayList<TaskItem> tasks = new ArrayList<TaskItem>();

        Collections.addAll(tasks,
                new TaskItem(1,"Push lab code to the github", TaskStatus.TO_DO),
                new TaskItem(2,"Prepare for the quiz", TaskStatus.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", TaskStatus.COMPLETED));

        getAllObjects(tasks);
        getByStatus(tasks, TaskStatus.COMPLETED);
        getByCondition(tasks, 2);
        getTaskDescription(tasks);

}

    public static void getAllObjects(ArrayList<TaskItem> tasks){
        for(TaskItem t : tasks){
            t.printInfo();
        }
    }

    public static void getByStatus(ArrayList<TaskItem> tasks, TaskStatus status){
        for(TaskItem t : tasks){
            if(t.getTaskStatus()==status){
                t.printInfo();
            }
        }
    }

    public static void getByCondition(ArrayList<TaskItem> tasks, int id){
        for(TaskItem t : tasks){
            if(t.getTaskId()>=id){
                t.printInfo();
            }
        }
    }

    public static void getTaskDescription(ArrayList<TaskItem> tasks){
        for(TaskItem t : tasks){
            System.out.println(t.getTaskDescription());
        }
    }
}
