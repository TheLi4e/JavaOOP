package Lesson5;
import java.util.Map;

public interface View {
    void printAll(Map<String, String> usersList);
    String getLogin ();
    String getPassword ();
    void print(String s);
}
