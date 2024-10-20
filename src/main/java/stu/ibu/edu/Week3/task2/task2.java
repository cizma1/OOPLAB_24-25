package stu.ibu.edu.Week3.task2;



import java.sql.*;
import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {

        DbConnect dbConnect = new DbConnect();
        Connection conn = dbConnect.getConnection();

        ArrayList<TaskItem> tasks = getAllTasks(conn);


        getAllObjects(tasks);

        createTask(conn, new TaskItem(5, "New Task", TaskStatus.TO_DO));

        updateTaskDescription(conn, 1, "Updated Task Description");

        TaskItem task = getTaskById(conn, 2);
        if (task != null) {
            task.printInfo();
        }


        dbConnect.closeConnection();

}

    public static ArrayList<TaskItem> getAllTasks(Connection conn) {
        ArrayList<TaskItem> tasks = new ArrayList<>();
        String sql = "SELECT * FROM tasks";
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String description = rs.getString("task_description");
                String status = rs.getString("task_status");
                tasks.add(new TaskItem(id, description, TaskStatus.valueOf(status)));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    public static TaskItem getTaskById(Connection conn, int id) {
        TaskItem task = null;
        String sql = "SELECT * FROM tasks WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int taskId = rs.getInt("id");
                    String description = rs.getString("task_description");
                    String status = rs.getString("task_status");
                    task = new TaskItem(taskId, description, TaskStatus.valueOf(status));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return task;
    }

    public static void createTask(Connection conn, TaskItem task) {
        String sql = "INSERT INTO tasks (id, task_description, task_status) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, task.getTaskId());
            pstmt.setString(2, task.getTaskDescription());
            pstmt.setString(3, task.getTaskStatus().name());
            pstmt.executeUpdate();
            System.out.println("Task created: " + task.getTaskDescription());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateTaskDescription(Connection conn, int id, String newDescription) {
        String sql = "UPDATE tasks SET task_description = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, newDescription);
            pstmt.setInt(2, id);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Task updated: ID " + id + " | New Description: " + newDescription);
            } else {
                System.out.println("No task found with ID: " + id);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
