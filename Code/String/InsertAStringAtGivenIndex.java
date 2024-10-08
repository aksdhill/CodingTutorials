public class InsertAStringAtGivenIndex {
    public static void main(String[] args) throws Exception {
        
        System.out.println(insertAStringAtGivenIndex("Akshay is my name", "Dhillon ", 7));

    }

    public static String insertAStringAtGivenIndex(String originalString, String stringToAppend, int index) throws Exception {
        if(index >= originalString.length() || index < 0) {
            throw new Exception("Index should be between 0 and Original String's length - 1");
        }
        
        StringBuilder updatedString = new StringBuilder("");

        updatedString.append(originalString.substring(0, index));
        updatedString.append(stringToAppend);

        updatedString.append(originalString.substring(index, originalString.length()));
        return updatedString.toString();
    }

    
}
