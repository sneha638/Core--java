cpublic class VowelsConsonants {
    public static void main(String[] args) {
        int vCount = 0, cCount = 0;
        String string = "Welcome to Java";
        string = string.toLowerCase();  
                for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);  
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;  
            }
           
            else if (ch >= 'a' && ch <= 'z') {
                cCount++;              }
        }

                System.out.println("Number of vowels: " + vCount);
        System.out.println("Number of consonants: " + cCount);
    }
}
