package Singleton;

import java.util.Locale;

public class SingletonTest {
    public static void main(String[] args) {
        Database database1 = Database.getDatabase();
        Database database2 = Database.getDatabase();
        Database database3 = Database.getDatabase();
        database1.printDatabase(1);
        database1.text = database1.text.toLowerCase();
        System.out.println(database2.text);

    }
}
