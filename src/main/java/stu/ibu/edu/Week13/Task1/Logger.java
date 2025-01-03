package stu.ibu.edu.Week13.Task1;

public class Logger {
    private static Logger instance;

    public Logger(){
    }

    public static synchronized Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message){
        System.out.println("[LOG]: " + message);
    }

    public void logInfo(String message){
        System.out.println("[INFO]: " + message);
    }

    public void logWarning(String message){
        System.out.println("[WARNING]: " + message);
    }

    public void logError(String message){
        System.out.println("[ERROR]: " + message);
    }

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Application started.");
        logger.logInfo("Connecting to the database.");
        logger.logWarning("Low disk space detected.");
        logger.logError("Failed to load configuration file.");
        logger.log("Application stopped.");
    }
}
