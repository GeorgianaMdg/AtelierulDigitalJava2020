package Singleton;

public class Database {
    private static Database database = new Database();
    public String text;
    private Database() {}

    public static Database getDatabase() {
        if (database == null) {
            synchronized(Database.class){
                if (database == null) {
                    database = new Database();
                }
            }
        }
        return database;
    }

    public void printDatabase(int elem) {
        System.out.println("This is the database with " + elem + " elements");
        text = "OK";
    }
}
