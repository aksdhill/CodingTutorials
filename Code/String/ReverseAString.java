public class ReverseAString {
    public static void main(String[] args)
    {
        String reversedString = reverse("abcd");
        System.out.println(reversedString);

    }

    public static String reverse(String str) {
        char[] charArray = str.toCharArray();

        int left, right;
        
        left = 0;
        right = charArray.length - 1;

        while(left < right) {
            char temp = charArray[left];

            charArray[left] = charArray[right];
            charArray[right]= temp;
            
            left++;
            right--;

        }

        return new String(charArray);
    }

}





