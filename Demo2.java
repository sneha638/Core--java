import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students implements Comparable<Students>
{
    int age;
    String name;

    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Students that){
        if(this.age > that.age)
            return 1;
        else
            return -1;
    }

}

public class Demo2{
    public static void main(String args[]){
        Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j)
            {
                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };
        List<Students> nums = new ArrayList<>();
        nums.add(new Students(21,"Mariya"));
        nums.add(new Students(22,"Manu"));
        nums.add(new Students(27,"theresa"));
        nums.add(new Students(28,"silpa"));

        Collections.sort(nums);
        for(Students s : nums)
        System.out.println(s);
    }}