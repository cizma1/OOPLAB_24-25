package stu.ibu.edu.Week3.task2;

enum TaskStatus{
    TO_DO, IN_PROGRESS, COMPLETED, CANCELLED;
}

public class TaskItem {
    private int taskId;
    private String taskDescription;
    private TaskStatus taskStatus;

    public TaskItem(int taskId, String taskDescription, TaskStatus taskStatus) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

    public void printInfo(){
        System.out.println("ID: "+taskId+" | Task Description: "+taskDescription+" | Task Status: "+taskStatus);
    }

    public int getTaskId() {
        return taskId;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

}
