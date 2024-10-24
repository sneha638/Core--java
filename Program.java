

class Program {
    public static void main(String[] args) {
        int count = 0;
     String str = "sneahha";
        int arr;
        for(int i = 0; i < str.length() - 1 ; i++){
            //    for(int j=i; j< arr.length; j++)
            if(str.charAt(i) == str.charAt(i + 1)){
                count++;
                System.out.println("Repeating letter is:"+str.charAt(i));
            }
        }
    }}
