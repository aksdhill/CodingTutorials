public class Anagram {
    public static  void main(String[] args) {
        String string1 = "car";
        String string2 = "rac";

        String result = isAnagram(string1, string2);
        System.out.println(result);
    }

    public static String isAnagram(String string1, String string2) {

        String ANAGRAM = "Anagram";
        String NOT_AN_ANAGRAM = "Not an Anagram";
        if(string1.length() != string2.length()) {
            return NOT_AN_ANAGRAM;
        }

        int[] ch1 = new int[26];
        int[] ch2 = new int[26];
        
        for(int i = 0; i < string1.length(); i++) {
            int c1 = string1.charAt(i) - 'a';
            int c2 = string2.charAt(i) - 'a';

            ch1[ c1 ]++;
            ch2[ c2 ]++;
            
        }

        for(int i = 0; i < ch1.length; i++) {
            if(ch1[i] != ch2[i]) {
                return NOT_AN_ANAGRAM;
            }
        }

        return ANAGRAM;
    }
}

