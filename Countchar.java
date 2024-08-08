// Count characters

public class Count {
    public static void main(String[] args) {
        String string = "welcome to java";
        int count = 0;
                for (int i = 0; i < string.length(); i++) {
           
            if (string.charAt(i) != ' ') {
                count++;             }
        }
        
                System.out.println("Number of non-space characters: " + count);
    }
}
