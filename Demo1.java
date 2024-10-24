import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo1 {


        public static void main(String args[]){
            Comparator<String> com = new Comparator<String>()
            {
                public int compare(String i, String j)
                {
                    if(i.length() > j.length())
                        return 1;
                    else
                        return -1;
                }
            };
            List<String> nums = new ArrayList<>();
            nums.add("Sneha");
            nums.add("AmithaBaby");
            nums.add("Siji");
            nums.add("KMXavier");

            Collections.sort(nums, com);
            System.out.println(nums);
        }}

