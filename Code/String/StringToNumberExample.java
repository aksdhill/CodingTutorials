public class StringToNumberExample {
    public static void main(String[] args) {
        System.out.println(toInteger("199"));
        System.out.println(toInteger("-199"));
        
        System.out.println(toInteger(""));


    }

    public static int toInteger(String number) throws NumberFormatException{
        
        if(number == null || number.length() == 0) {
            throw new NumberFormatException();
        }
        
        boolean isNegativeNo = false;
        int startIndex = 0;

        if(number.charAt(0) == '-') {
            if(number.length() == 1) {
                throw new NumberFormatException();
            }
            isNegativeNo = true;
            startIndex = 1;
        }

        int result = 0;

        for(int i = startIndex ; i < number.length() ; i++) {
            if(number.charAt(i)  > 57 || number.charAt(i) < 48 ) {
                throw new NumberFormatException();
            } 
            
            result = (result*10) + ( number.charAt(i) - '0');
        }

        if(isNegativeNo) {
            return -1 * result;
        }

        return result;

    }


    
}
