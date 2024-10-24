import java.util.HashMap;
import java.util.Map;

public class Demo3 {
    public static void main(String args[]) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Sneha", 56);
        students.put("Nayana", 76);
        students.put("arya", 59);
        students.put("shiya", 86);

        System.out.println(students.keySet());
        for(String key : students.keySet())
        {
        System.out.println(students.get("sneha"));

    }
    }}

