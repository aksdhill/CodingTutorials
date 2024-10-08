public class CountOccurenceOfCharInString {
    public static void main(String[] args) {
        
        System.out.println(countCharInAString("akshay", 'a'));

    }

    public static int countCharInAString(String string, char ch) {
        int count = 0;

        for(int i =0; i < string.length(); i++) {
            if(string.charAt(i) == ch) {
                count++;
            }
        }

        return count;
    }

    
}
